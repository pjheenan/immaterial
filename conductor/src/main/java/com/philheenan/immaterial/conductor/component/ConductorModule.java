package com.philheenan.immaterial.conductor.component;

import com.philheenan.immaterial.conductor.facets.sample.SampleModule;

import dagger.Module;

/**
 * @author Phil Heenan on 10/08/15.
 */
@Module(
        complete = false,
        library = true,
        includes = {
                SampleModule.class
        }
)
public class ConductorModule {
}
