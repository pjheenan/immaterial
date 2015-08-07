package com.philheenan.immaterial.conductor;

import com.philheenan.immaterial.conductor.facets.MovieListConductor;

import dagger.Module;

/**
 *
 * @author Phil Heenan on 06/08/15.
 */
@Module (
        library = true,
        complete = false,
        injects = {
                MovieListConductor.class
        }
)
public class ConductorModule {

}
