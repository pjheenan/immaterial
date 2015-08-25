package com.philheenan.immaterial.conductor.facets.sample;

import com.philheenan.immaterial.lib.contract.Facet;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import rx.functions.Func1;

/**
 * @author Phil Heenan on 07/08/15.
 */
public class SampleConductor implements Facet<String, List<String>> {

    @Inject
    SampleCacheFacet cacheFacet;
    @Inject
    SampleRemoteFacet remoteFacet;

    @Inject
    public SampleConductor() {
    }

    @Override
    public Observable<List<String>> process(String input) {
        return remoteFacet.process(new SampleRemoteRequest())
                .startWith(cacheFacet.process(new SampleCacheRequest()))
                .map(new Func1<Object, List<String>>() {
                    @Override
                    public List<String> call(Object o) {
                        List<String> result = new ArrayList<>();
                        if (o instanceof String) {
                            result.add((String) o);
                        } else {
                            result.add(o.toString());
                        }
                        return result;
                    }
                });
    }
}
