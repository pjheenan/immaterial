package com.philheenan.immaterial.ui.presentation;

import org.junit.After;
import org.junit.Before;

import dagger.ObjectGraph;

/**
 * @author Phil Heenan on 01/09/15.
 */
public class PresentationBaseTest {

    protected ObjectGraph graph;

    @Before
    public void setup() {
        graph = ObjectGraph.create(new PresentationModule(), new PresentationTestModule());
    }

    @After
    public void teardown() {
    }
}
