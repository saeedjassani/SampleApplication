package com.saeedjassani.sampleapplication;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.assertEquals;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    private UiDevice mDevice;

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        mDevice = UiDevice.getInstance(getInstrumentation());

        mDevice.pressHome();

        UiObject allAppsButton = mDevice
                .findObject(new UiSelector().description("WhatsApp"));

        allAppsButton.clickAndWaitForNewWindow();

        assertEquals("com.saeedjassani.sampleapplication", appContext.getPackageName());
    }
}
