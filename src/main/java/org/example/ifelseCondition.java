package org.example;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import junit.framework.Assert;

import java.net.MalformedURLException;

public class ifelseCondition extends Content {



    public static void main (String[] args ) throws MalformedURLException, InterruptedException {
        ParentClass();
        MobileElement prefernce = driver.findElement(new MobileBy.ByAccessibilityId("Preference"));
        prefernce.click();
        MobileElement dependencies = driver.findElement(new MobileBy.ByAccessibilityId("3. Preference dependencies"));
        dependencies.click();
        Thread.sleep(2000);
        MobileElement checkbox = driver.findElement(MobileBy.id("android:id/checkbox"));
        Boolean ischecked = Boolean.valueOf(checkbox.getAttribute("checked"));
        System.out.println("value of attribute" + ischecked);
       // Assert.assertTrue(ischecked);

        if(ischecked) {
            System.out.println("Already checked");
        }else{
            checkbox.click();
            Thread.sleep(2000);
        }

       String afterchecked = checkbox.getAttribute("checked");

        System.out.println ("value of afterchecked" + afterchecked);
        Assert.assertTrue(Boolean.parseBoolean(afterchecked));

        driver.closeApp();

















    }
}
