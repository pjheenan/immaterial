package com.philheenan.immaterial.remote;

import com.philheenan.immaterial.remote.entity.SampleEntity;
import com.philheenan.immaterial.remote.sample.SampleModelFactory;
import com.philheenan.immaterial.sample.Sample;

import dagger.Module;
import dagger.Provides;

/**
 * @author Phil Heenan on 28/08/15.
 */
@Module(
        complete = false,
        library = true
)
public class ModelFactoryModule {

    @Provides
    ModelFactory<SampleEntity, Sample> provideSampleModelFactory() {
        return new SampleModelFactory();
    }
}
