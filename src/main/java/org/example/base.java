package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class base {

    public static AndroidDriver capabilities() throws MalformedURLException {

        // Define app path
        File appPath = new File("src");
        File app = new File(appPath, "ApiDemos-debug.apk");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "MyDevice");
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        //UI Automator
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");


        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);

        return driver;

    }
}