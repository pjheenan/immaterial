package com.philheenan.immaterial.remote.sample;

import com.philheenan.immaterial.remote.ModelFactory;
import com.philheenan.immaterial.remote.RemoteBaseTest;
import com.philheenan.immaterial.remote.entity.SampleEntity;
import com.philheenan.immaterial.sample.Sample;

import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * @author Phil Heenan on 28/08/15.
 */
public class SampleModelFactoryTest extends RemoteBaseTest {

    @Inject
    ModelFactory<SampleEntity, Sample> modelFactory;

    @Before
    public void setup() {
        super.setup();
        graph.inject(this);
    }

    @Test
    public void injectionTest() {
        assertNotNull(modelFactory);
    }

    @Test
    public void testModelMapping() {
        SampleEntity entity = new SampleEntity();
        entity.name = "Name";
        entity.version = 10;
        Sample sample = modelFactory.fromEntity(entity);
        assertNotNull(sample);
        assertEquals("Name 10", sample.name);
    }

    @Test
    public void testNullEntityMapping() {
        Sample sample = modelFactory.fromEntity(null);
        assertNotNull(sample);
        assertNull(sample.name);
    }

    @Test
    public void testNullName() {
        SampleEntity entity = new SampleEntity();
        entity.name = null;
        entity.version = 10;
        Sample sample = modelFactory.fromEntity(entity);
        assertNotNull(sample);
        assertEquals("10", sample.name);
    }

    @Test
    public void testNullVersion() {
        SampleEntity entity = new SampleEntity();
        entity.name = "Name";
        Sample sample = modelFactory.fromEntity(entity);
        assertNotNull(sample);
        assertEquals("Name 0", sample.name);
    }

    @Test
    public void testEmptyName() {
        SampleEntity entity = new SampleEntity();
        entity.name = "";
        entity.version = 10;
        Sample sample = modelFactory.fromEntity(entity);
        assertNotNull(sample);
        assertEquals("10", sample.name);
    }


}
