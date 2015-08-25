package com.philheenan.immaterial.conductor;

import com.philheenan.immaterial.conductor.component.SampleModule;
import com.philheenan.immaterial.conductor.facets.sample.SampleCacheFacet;
import com.philheenan.immaterial.conductor.facets.sample.SampleRemoteFacet;

import org.mockito.Mockito;

import dagger.Module;
import dagger.Provides;

/**
 * @author Phil Heenan on 07/08/15.
 */
@Module
public class SampleTestModule extends SampleModule {

    @Provides
    SampleCacheFacet provideSampleCacheFacet() {
        return Mockito.mock(SampleCacheFacet.class);
    }

    @Provides
    SampleRemoteFacet provideSampleRemoteFacet() {
        return Mockito.mock(SampleRemoteFacet.class);
    }
}