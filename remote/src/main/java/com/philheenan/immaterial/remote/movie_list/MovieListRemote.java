package com.philheenan.immaterial.remote.movie_list;

import com.philheenan.immaterial.conductor.facets.movie_list.MovieListRemoteFacet;
import com.philheenan.immaterial.conductor.facets.movie_list.MovieListRemoteRequest;

import rx.Observable;

/**
 * @author Phil Heenan on 07/08/15.
 */
public class MovieListRemote implements MovieListRemoteFacet {

    @Override
    public Observable<Object> process(MovieListRemoteRequest input) {
        return Observable.just((Object) "remote");
    }
}
