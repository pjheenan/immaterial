package com.philheenan.immaterial.conductor;

import com.philheenan.immaterial.conductor.facets.MovieListConductorTest;
import com.philheenan.immaterial.conductor.facets.movie_list.MovieListCacheFacet;
import com.philheenan.immaterial.conductor.facets.movie_list.MovieListRemoteFacet;

import org.mockito.Mockito;

import dagger.Module;
import dagger.Provides;

/**
 * @author Phil Heenan on 07/08/15.
 */
@Module (
        library = true,
        complete = false,
        addsTo = ConductorModule.class,
        injects = {
                ConductorBaseTest.class,
                MovieListConductorTest.class
        }
)
public class ConductorTestModule {

    @Provides
    MovieListCacheFacet provideMovieListCacheFacet() {
        return Mockito.mock(MovieListCacheFacet.class);
    }

    @Provides
    MovieListRemoteFacet provideMovieListRemoteFacet() {
        return Mockito.mock(MovieListRemoteFacet.class);
    }
}
