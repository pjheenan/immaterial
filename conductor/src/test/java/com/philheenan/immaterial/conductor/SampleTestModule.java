package com.philheenan.immaterial.conductor;

import com.philheenan.immaterial.conductor.facets.sample.SampleCacheFacet;
import com.philheenan.immaterial.conductor.facets.sample.SampleConductorTest;
import com.philheenan.immaterial.conductor.facets.sample.SampleModule;
import com.philheenan.immaterial.conductor.facets.sample.SampleRemoteFacet;

import org.mockito.Mockito;

import dagger.Module;
import dagger.Provides;

/**
 * @author Phil Heenan on 07/08/15.
 */
@Module(
        complete = false,
        library = true,
        overrides = true,
        addsTo = SampleModule.class,
        injects = {
                ConductorBaseTest.class,
                SampleConductorTest.class
        }
)
public class SampleTestModule {

    @Provides
    SampleCacheFacet provideSampleCacheFacet() {
        return Mockito.mock(SampleCacheFacet.class);
    }

    @Provides
    SampleRemoteFacet provideSampleRemoteFacet() {
        return Mockito.mock(SampleRemoteFacet.class);
    }
}
