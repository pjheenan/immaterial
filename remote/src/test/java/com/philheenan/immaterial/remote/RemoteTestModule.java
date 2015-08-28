package com.philheenan.immaterial.remote;

import com.philheenan.immaterial.remote.sample.SampleModelFactoryTest;
import com.philheenan.immaterial.remote.sample.SampleRemoteFacetTest;

import dagger.Module;

/**
 * @author Phil Heenan on 28/08/15.
 */
@Module(
        complete = false,
        library = true,
        overrides = true,
        addsTo = RemoteModule.class,
        injects = {
                RemoteBaseTest.class,
                SampleModelFactoryTest.class,
                SampleRemoteFacetTest.class
        }
)
public class RemoteTestModule {
}
