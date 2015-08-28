package com.philheenan.immaterial.conductor.component;

import dagger.Module;

/**
 * @author Phil Heenan on 10/08/15.
 */
@Module(
        complete = false,
        library = true,
        includes = {
                com.philheenan.immaterial.conductor.facets.sample.SampleModule.class
        }
)
public class ConductorModule {
}
