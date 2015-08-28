package com.philheenan.immaterial.remote.sample;

import com.philheenan.immaterial.conductor.facets.sample.SampleRemoteFacet;
import com.philheenan.immaterial.remote.RemoteBaseTest;
import com.philheenan.immaterial.remote.entity.SampleEntity;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

/**
 * @author Phil Heenan on 28/08/15.
 */
public class SampleRemoteFacetTest extends RemoteBaseTest {

    @Inject
    SampleRemoteFacet facet;

    @Before
    public void setup() {
        super.setup();
        graph.inject(this);
    }

    @Test
    public void testInstance() {
        Assert.assertNotNull(facet);
    }



    private SampleEntity getEntity(String name, int version) {
        SampleEntity entity = new SampleEntity();
        entity.name = name;
        entity.version = version;
        return entity;
    }
}
