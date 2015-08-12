package com.example.myapp;

import com.example.support.RobolectricGradleTestRunner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityTest {

    private MainActivity mActivity;

    @Before
    public void setUp() throws Exception {
        mActivity = Robolectric.buildActivity(MainActivity.class)
                .create()
                .start()
                .resume()
                .get();
    }


    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(mActivity);
    }

}