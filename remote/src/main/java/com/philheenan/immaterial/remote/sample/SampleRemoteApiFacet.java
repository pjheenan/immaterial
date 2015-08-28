package com.philheenan.immaterial.remote.sample;

import com.philheenan.immaterial.conductor.facets.sample.SampleRemoteFacet;
import com.philheenan.immaterial.conductor.facets.sample.SampleRemoteRequest;
import com.philheenan.immaterial.remote.entity.SampleEntity;
import com.philheenan.immaterial.sample.Sample;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

/**
 * @author Phil Heenan on 07/08/15.
 */
public class SampleRemoteApiFacet implements SampleRemoteFacet {

    @Override
    public Observable<Sample> process(SampleRemoteRequest input) {
        return Observable.just(new SampleEntity()).map(entityModelMapper());
    }

    Func1<SampleEntity, Sample> entityModelMapper() {
        return new Func1<SampleEntity, Sample>() {
            @Override
            public Sample call(SampleEntity sampleEntity) {
                return null;
            }
        };
    }

}
