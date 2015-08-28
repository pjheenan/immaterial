package com.philheenan.immaterial.conductor;

import com.philheenan.immaterial.conductor.component.ConductorModule;

import org.junit.Before;

import dagger.ObjectGraph;

/**
 * @author Phil Heenan on 07/08/15.
 */
public class ConductorBaseTest {

    protected ObjectGraph graph;

    @Before
    public void setup() {
        graph = ObjectGraph.create(new ConductorModule(), new SampleTestModule());
    }

}
