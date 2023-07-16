package org.example;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;
import java.util.List;

public class MoreElements extends Content {


    public static void main(String[] args) throws MalformedURLException, InterruptedException {


        ParentClass();
        driver.findElement(new MobileBy.ByAccessibilityId("Animation")).click();
        Thread.sleep(2000);
        List<MobileElement> appElements = driver.findElements(MobileBy.id("android:id/text1"));
        int i;
        for (i = 0; i < appElements.size(); i++) {

            Thread.sleep(2000);
            String appElemntText = appElements.get(i).getText();
            System.out.println("Text of all elemnts " + appElemntText);


        }


    }

}
