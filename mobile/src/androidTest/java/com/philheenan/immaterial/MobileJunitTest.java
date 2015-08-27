package com.philheenan.immaterial;

import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

/**
 * @author Phil Heenan on 26/08/15.
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class MobileJunitTest {

    @Before
    public void setup() {

    }

    @Test
    public void simpleTest() {
        assertTrue(true);
    }

}
