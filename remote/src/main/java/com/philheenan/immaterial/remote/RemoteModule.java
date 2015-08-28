package com.philheenan.immaterial.remote;

import com.philheenan.immaterial.conductor.facets.sample.SampleRemoteFacet;
import com.philheenan.immaterial.remote.sample.SampleRemoteApiFacet;

import dagger.Module;
import dagger.Provides;

/**
 *
 * @author Phil Heenan on 07/08/15.
 */
@Module (
        complete = false,
        library = true
)
public class RemoteModule {

    @Provides
    SampleRemoteFacet providesampleFacet() {
        return new SampleRemoteApiFacet();
    }
}
