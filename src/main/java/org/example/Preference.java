package org.example;

import io.appium.java_client.MobileBy;
import junit.framework.Assert;

import java.net.MalformedURLException;

public class Preference extends Content{

   public static void main(String[] args) throws MalformedURLException, InterruptedException {
     ParentClass();

     driver.findElement(new MobileBy.ByAccessibilityId("Preference")).click();
       Thread.sleep(2000);
     driver.findElement(new MobileBy.ByAccessibilityId("3. Preference dependencies")).click();
       Thread.sleep(2000);
     driver.findElement(MobileBy.id("android:id/checkbox")).click();
       Thread.sleep(2000);
       driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='WiFi settings']")).click();
       Thread.sleep(2000);
       driver.findElement(MobileBy.id("android:id/edit")).sendKeys("Testwifi");
       Thread.sleep(2000);
       driver.findElement(MobileBy.id("android:id/button1")).click();
       Thread.sleep(2000);

       /*Boolean result2 = driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='WiFi settings']")).isDisplayed();
       Assert.assertTrue(result2);*/
     String result3 = driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='WiFi settings']")).getText();
     System.out.println("Text displayed" +result3);
     Assert.assertEquals(result3,"WiFi settings");
        driver.closeApp();

}
}
