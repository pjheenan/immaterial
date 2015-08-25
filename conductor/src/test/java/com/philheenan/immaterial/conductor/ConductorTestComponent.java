package com.philheenan.immaterial.conductor;

import dagger.Component;

/**
 * @author Phil Heenan on 10/08/15.
 */
@Component(modules = SampleTestModule.class)
public interface ConductorTestComponent extends ConductorComponent {

    void inject(ConductorBaseTest testCase);
}
