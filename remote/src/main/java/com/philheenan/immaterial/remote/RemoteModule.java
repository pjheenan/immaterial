package com.philheenan.immaterial.remote;

import com.philheenan.immaterial.conductor.facets.movie_list.MovieListRemoteFacet;
import com.philheenan.immaterial.remote.movie_list.MovieListRemote;

import dagger.Module;
import dagger.Provides;

/**
 *
 * @author Phil Heenan on 07/08/15.
 */
@Module
public class RemoteModule {

    @Provides
    MovieListRemoteFacet provideMovieListFacet() {
        return new MovieListRemote();
    }
}
