package com.philheenan.immaterial.conductor;

import com.philheenan.immaterial.conductor.component.MovieListModule;
import com.philheenan.immaterial.conductor.facets.movie_list.MovieListCacheFacet;
import com.philheenan.immaterial.conductor.facets.movie_list.MovieListRemoteFacet;

import org.mockito.Mockito;

import dagger.Module;
import dagger.Provides;

/**
 * @author Phil Heenan on 07/08/15.
 */
@Module
public class MovieListTestModule extends MovieListModule {

    @Provides
    MovieListCacheFacet provideMovieListCacheFacet() {
        return Mockito.mock(MovieListCacheFacet.class);
    }

    @Provides
    MovieListRemoteFacet provideMovieListRemoteFacet() {
        return Mockito.mock(MovieListRemoteFacet.class);
    }
}
