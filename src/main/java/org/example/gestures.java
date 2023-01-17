package org.example;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.input.model.TouchPoint;

import java.net.MalformedURLException;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class gestures extends base {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver driver = capabilities();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();

        //Tap
        //TouchAction t = new TouchAction();
        WebElement expandList = driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']"));
        tapOptions().withElement(element(expandList));




    }
}
