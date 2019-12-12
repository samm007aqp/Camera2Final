package com.example.camera2final;

import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private MainActivity mMainActivity;

    @Before
    public void setUp (){mMainActivity = new MainActivity(); }
    @Test
    public void check_Views() {
        View view =  mMainActivity.findViewById(R.id.textureView);
        assertNotNull(view);
    }

}