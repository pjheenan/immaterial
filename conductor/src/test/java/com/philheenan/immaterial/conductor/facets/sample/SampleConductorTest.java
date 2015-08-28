package com.philheenan.immaterial.conductor.facets.sample;

import com.philheenan.immaterial.conductor.ConductorBaseTest;
import com.philheenan.immaterial.sample.Sample;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import rx.Observer;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;

/**
 * @author Phil Heenan on 07/08/15.
 */
public class SampleConductorTest extends ConductorBaseTest {

    @Inject
    SampleConductor conductor;

    @Before
    public void setup() {
        super.setup();
        graph.inject(this);
    }

    @Test
    public void testConductor() {
        assertNotNull(conductor);
        assertNotNull(conductor.cacheFacet);
        assertNotNull(conductor.remoteFacet);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testObservables() {
        Observer<Object> mockObserver = Mockito.mock(Observer.class);

        Sample remoteSample = new Sample();
        remoteSample.name = "remote";
        Sample cacheSample = new Sample();
        cacheSample.name = "cache";
        Mockito.when(conductor.remoteFacet.process(any(SampleRemoteRequest.class)))
                .thenReturn(Observable.<Sample>just(remoteSample));
        Mockito.when(conductor.cacheFacet.process(any(SampleCacheRequest.class)))
                .thenReturn(Observable.<Sample>just(cacheSample));
        ArgumentCaptor<List> captor = ArgumentCaptor.forClass(List.class);

        conductor.process("input").subscribe(mockObserver);

        Mockito.verify(mockObserver, Mockito.times(2)).onNext(captor.capture());
        assertTrue("cache".equals(captor.getAllValues().get(0).get(0)));
        assertTrue("remote".equals(captor.getAllValues().get(1).get(0)));
    }
}
