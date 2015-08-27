package com.philheenan.immaterial.cache.sample;

import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;

import com.philheenan.immaterial.conductor.facets.sample.SampleCacheRequest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import rx.Observable;

/**
 * @author Phil Heenan on 26/08/15.
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class SampleCacheTest {

    @Before
    public void setup() {

    }

    @Test
    public void testProcess() {
        Observable obs = new SampleCache().process(new SampleCacheRequest());
        Assert.assertNotNull(obs);
    }
}
