package com.philheenan.immaterial.conductor.component;

import com.philheenan.immaterial.conductor.facets.sample.SampleCacheFacet;
import com.philheenan.immaterial.conductor.facets.sample.SampleRemoteFacet;

import dagger.Module;
import dagger.Provides;

/**
 * @author Phil Heenan on 10/08/15.
 */
@Module
public class SampleModule {

    @Provides
    SampleRemoteFacet provideRemote() {
        return null;
    }

    @Provides
    SampleCacheFacet provideCache() {
        return null;
    }


}
