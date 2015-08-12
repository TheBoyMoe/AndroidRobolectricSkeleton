package com.example.myapp;

import android.widget.TextView;

import com.example.support.ResourceLocator;
import com.example.support.RobolectricGradleTestRunner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import static com.example.support.Assert.assertViewIsVisible;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

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


    @Test
    public void shouldHaveHelloString() throws Exception  {

        // assert that the view is non-null(and visible) and the string matches what is expected
        TextView helloWorld = (TextView) mActivity.findViewById(R.id.hello_world);
        assertViewIsVisible(helloWorld);
        assertThat(helloWorld.getText().toString(),
                equalTo(ResourceLocator.getString(R.string.hello_world)));
    }


}