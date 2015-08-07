package com.philheenan.immaterial.cache.movie_list;

import com.philheenan.immaterial.conductor.facets.movie_list.MovieListCacheFacet;
import com.philheenan.immaterial.conductor.facets.movie_list.MovieListCacheRequest;

import rx.Observable;

/**
 * @author Phil Heenan on 07/08/15.
 */
public class MovieListCache implements MovieListCacheFacet {

    @Override
    public Observable<Object> process(MovieListCacheRequest input) {
        return Observable.just((Object) "cache");
    }
}
