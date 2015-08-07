package com.philheenan.immaterial.conductor.facets;

import com.philheenan.immaterial.conductor.ConductorBaseTest;

import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.assertNotNull;

/**
 * @author Phil Heenan on 07/08/15.
 */
public class MovieListConductorTest extends ConductorBaseTest {

    @Inject
    MovieListConductor conductor;

    @Before
    public void setup() {
        super.setup();
    }

    @Test
    public void testConductor() {
        assertNotNull(conductor);
        assertNotNull(conductor.cacheFacet);
        assertNotNull(conductor.remoteFacet);
    }
}
