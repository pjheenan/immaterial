package com.philheenan.immaterial.conductor.facets;

import com.philheenan.immaterial.lib.contract.Facet;

import java.util.List;

import rx.Observable;

/**
 * @author Phil Heenan on 07/08/15.
 */
public class MovieListConductor implements Facet<String, List<String>> {

    @Override
    public Observable<List<String>> process(String input) {
        return null;
    }
}
