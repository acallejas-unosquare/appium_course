package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class UIAutomationTest  extends base {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver driver = capabilities();
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("text(\"Views\")")).click();

        // Validate clickable for all options
        System.out.println(driver.findElements(new AppiumBy.ByAndroidUIAutomator("new UiSelector().clickable(true)")).size());

        //driver.findElement(new AppiumBy.ByAndroidUIAutomator("text(\"Animation\")")).click();
    }
}
