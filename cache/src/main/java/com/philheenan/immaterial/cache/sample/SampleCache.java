package com.philheenan.immaterial.cache.sample;

import com.philheenan.immaterial.conductor.facets.sample.SampleCacheFacet;
import com.philheenan.immaterial.conductor.facets.sample.SampleCacheRequest;
import com.philheenan.immaterial.sample.Sample;

import rx.Observable;

/**
 * @author Phil Heenan on 07/08/15.
 */
public class SampleCache implements SampleCacheFacet {

    @Override
    public Observable<Sample> process(SampleCacheRequest input) {
        Sample sample = new Sample();
        sample.name = "cache";
        return Observable.just(sample);
    }
}
