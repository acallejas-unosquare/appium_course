package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Arrays;

public class swipeDemo extends base {

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = capabilities();

        driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
        WebElement obj1 = driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']"));

        int centerX = obj1.getRect().x + (obj1.getSize().width /2);
        double startY = obj1.getRect().y + (obj1.getSize().height *0.9);
        double endY = obj1.getRect().y + (obj1.getSize().height *0.1);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);

        //Move finger start potition
        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), centerX, (int)startY));

        // Finger comes down into contact with screen
        swipe.addAction(finger.createPointerDown(0));

        // Finger move to end position
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), centerX, (int) endY));

        // Get up finger from screen
        swipe.addAction(finger.createPointerUp(0));

        driver.perform(Arrays.asList(swipe));




        //driver.findElement(new AppiumBy.ByAndroidUIAutomator("text(\"2. Inline\")")).click();
        //driver.findElement(By.xpath("//*[@content-desc='9']")).click();





    }
}
