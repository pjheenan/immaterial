package com.philheenan.immaterial.cache.sample;

import com.philheenan.immaterial.conductor.facets.sample.SampleCacheFacet;
import com.philheenan.immaterial.conductor.facets.sample.SampleCacheRequest;

import rx.Observable;

/**
 * @author Phil Heenan on 07/08/15.
 */
public class SampleCache implements SampleCacheFacet {

    @Override
    public Observable<Object> process(SampleCacheRequest input) {
        return Observable.just((Object) "cache");
    }
}
