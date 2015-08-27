package com.philheenan.immaterial.conductor.facets.sample;

import com.philheenan.immaterial.conductor.ConductorBaseTest;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import javax.inject.Inject;

import rx.Observable;

import static org.junit.Assert.assertNotNull;
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
    public void testObservables() {
        Mockito.when(conductor.remoteFacet.process(any(SampleRemoteRequest.class)))
                .thenReturn(Observable.<Object>just("remote"));
        Mockito.when(conductor.cacheFacet.process(any(SampleCacheRequest.class)))
                .thenReturn(Observable.<Object>just("cache"));

        conductor.process("input");

        Mockito.verify(conductor.remoteFacet).process(any(SampleRemoteRequest.class));
        Mockito.verify(conductor.cacheFacet).process(any(SampleCacheRequest.class));

    }
}
