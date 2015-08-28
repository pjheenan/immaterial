package com.philheenan.immaterial.remote.sample;

import com.philheenan.immaterial.remote.ModelFactory;
import com.philheenan.immaterial.remote.entity.SampleEntity;
import com.philheenan.immaterial.sample.Sample;

/**
 * @author Phil Heenan on 28/08/15.
 */
public class SampleModelFactory implements ModelFactory<SampleEntity, Sample> {

    @Override
    public Sample fromApiEntity(SampleEntity entity) {
        Sample sample = new Sample();
        if (entity != null) {
            sample.name = (entity.name != null && entity.name.length() > 0 ? entity.name + " " : "");
            sample.name = sample.name + entity.version;
        }
        return sample;
    }
}
