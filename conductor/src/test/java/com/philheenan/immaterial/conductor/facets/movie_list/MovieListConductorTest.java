package com.philheenan.immaterial.conductor.facets.movie_list;

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
public class MovieListConductorTest extends ConductorBaseTest {

    @Inject
    com.philheenan.immaterial.conductor.facets.movie_list.MovieListConductor conductor;

    @Before
    public void setup() {
        super.setup();
        conductorComponent.inject(this);
    }

    @Test
    public void testConductor() {
        assertNotNull(conductor);
        assertNotNull(conductor.cacheFacet);
        assertNotNull(conductor.remoteFacet);
    }

    @Test
    public void testObservables() {
        Mockito.when(conductor.remoteFacet.process(any(MovieListRemoteRequest.class)))
                .thenReturn(Observable.<Object>just("remote"));
        Mockito.when(conductor.cacheFacet.process(any(MovieListCacheRequest.class)))
                .thenReturn(Observable.<Object>just("cache"));

        conductor.process("input");

        Mockito.verify(conductor.remoteFacet).process(any(MovieListRemoteRequest.class));
        Mockito.verify(conductor.cacheFacet).process(any(MovieListCacheRequest.class));

    }
}
