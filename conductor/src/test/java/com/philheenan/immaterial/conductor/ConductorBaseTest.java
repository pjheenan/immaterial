package com.philheenan.immaterial.conductor;

import com.philheenan.immaterial.conductor.facets.movie_list.MovieListConductorTest;

import org.junit.Before;

import dagger.Component;

/**
 * @author Phil Heenan on 07/08/15.
 */
public class ConductorBaseTest {

    protected TestComponent conductorComponent;

    @Before
    public void setup() {
        conductorComponent = DaggerConductorBaseTest_TestComponent.builder()
                .movieListTestModule(new MovieListTestModule())
                .build();
    }

    @Component(modules = MovieListTestModule.class)
    public interface TestComponent extends ConductorComponent {
        void inject(MovieListConductorTest testCase);
    }
}
