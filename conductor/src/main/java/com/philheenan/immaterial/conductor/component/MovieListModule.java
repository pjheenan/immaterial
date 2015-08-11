package com.philheenan.immaterial.conductor.component;

import com.philheenan.immaterial.conductor.facets.movie_list.MovieListCacheFacet;
import com.philheenan.immaterial.conductor.facets.movie_list.MovieListRemoteFacet;

import dagger.Module;
import dagger.Provides;

/**
 * @author Phil Heenan on 10/08/15.
 */
@Module
public class MovieListModule {

    @Provides
    MovieListRemoteFacet provideRemote() {
        return null;
    }

    @Provides
    MovieListCacheFacet provideCache() {
        return null;
    }


}
