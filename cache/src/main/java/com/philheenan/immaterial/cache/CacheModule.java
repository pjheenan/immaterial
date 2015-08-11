package com.philheenan.immaterial.cache;

import com.philheenan.immaterial.cache.movie_list.MovieListCache;
import com.philheenan.immaterial.conductor.facets.movie_list.MovieListCacheFacet;

import dagger.Module;
import dagger.Provides;

/**
 * @author Phil Heenan on 07/08/15.
 */
@Module
public class CacheModule {

    @Provides
    MovieListCacheFacet provideMovieListCache() {
        return new MovieListCache();
    }
}
