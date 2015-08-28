package com.philheenan.immaterial.conductor.facets.sample;

import dagger.Module;
import dagger.Provides;

/**
 * @author Phil Heenan on 10/08/15.
 */
@Module(
        complete = false,
        library = true,
        injects = {
                SampleConductor.class
        }
)
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
