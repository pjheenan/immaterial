package com.philheenan.immaterial.conductor.facets;

import com.philheenan.immaterial.conductor.facets.movie_list.MovieListCacheFacet;
import com.philheenan.immaterial.conductor.facets.movie_list.MovieListRemoteFacet;
import com.philheenan.immaterial.lib.contract.Facet;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;

/**
 * @author Phil Heenan on 07/08/15.
 */
public class MovieListConductor implements Facet<String, List<String>> {

    @Inject
    MovieListCacheFacet cacheFacet;
    @Inject
    MovieListRemoteFacet remoteFacet;

    @Override
    public Observable<List<String>> process(String input) {
        return null;
    }
}
