package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import junit.framework.Assert;

import java.net.MalformedURLException;

public class NormalPractice extends Content {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        ParentClass();
        MobileElement prefernce = driver.findElement(new MobileBy.ByAccessibilityId("Preference"));
         prefernce.click();
        Thread.sleep(2000);
        MobileElement dependencies = driver.findElement(new MobileBy.ByAccessibilityId("3. Preference dependencies"));
         dependencies.click();
        Thread.sleep(2000);
        MobileElement checkbox = driver.findElement(MobileBy.id("android:id/checkbox"));
        checkbox.click();
        Boolean ischecked = Boolean.valueOf(checkbox.getAttribute("checked"));
        System.out.println("Value of ischecked" +ischecked);
        Assert.assertTrue(ischecked);
        driver.closeApp();








    }






}
