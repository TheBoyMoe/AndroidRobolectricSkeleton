package com.example.support;


import android.view.View;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class Assert {

    public static void assertViewIsVisible(View v) {

        // assert view element is non-null and visible
        assertNotNull(v);
        assertThat(v.getVisibility(), equalTo(View.VISIBLE));
    }
}
