package com.philheenan.immaterial.conductor;

import com.philheenan.immaterial.conductor.facets.sample.SampleConductorTest;

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
                .sampleTestModule(new SampleTestModule())
                .build();
    }

    @Component(modules = SampleTestModule.class)
    public interface TestComponent extends ConductorComponent {
        void inject(SampleConductorTest testCase);
    }
}
