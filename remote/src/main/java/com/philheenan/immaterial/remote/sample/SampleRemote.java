package com.philheenan.immaterial.remote.sample;

import com.philheenan.immaterial.conductor.facets.sample.SampleRemoteFacet;
import com.philheenan.immaterial.conductor.facets.sample.SampleRemoteRequest;

import rx.Observable;

/**
 * @author Phil Heenan on 07/08/15.
 */
public class SampleRemote implements SampleRemoteFacet {

    @Override
    public Observable<Object> process(SampleRemoteRequest input) {
        return Observable.just((Object) "remote");
    }
}
