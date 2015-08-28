package com.philheenan.immaterial.remote;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import dagger.ObjectGraph;

/**
 * @author Phil Heenan on 28/08/15.
 */
public class RemoteBaseTest {

    protected ObjectGraph graph;

    @Before
    public void setup() {
        graph = ObjectGraph.create(new RemoteModule(), new RemoteTestModule());

    }

    @Test
    public void testSimple() {
        Assert.assertTrue(true);
    }
}
