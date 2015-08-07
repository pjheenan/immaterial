package com.philheenan.immaterial.conductor;

import org.junit.Before;

import dagger.ObjectGraph;

/**
 * @author Phil Heenan on 07/08/15.
 */
public class ConductorBaseTest {

    ObjectGraph objectGraph;

    @Before
    public void setup() {

        objectGraph = ObjectGraph.create(new ConductorTestModule());
        objectGraph.inject(this);

    }
}
