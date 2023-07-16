package org.example;

import base.OpenApp;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import junit.framework.Assert;

import java.net.MalformedURLException;

public class LoginPage extends OpenApp {


    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        MainMethod1();
        MobileElement login = driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]/android.widget.TextView"));
        login.click();

       // new WebDriverWait(driver, 1000).until(ExpectedConditions.visibilityOf(login));

      MobileElement email = driver.findElement(new MobileBy.ByAccessibilityId("input-email"));
      email.sendKeys("pinkikukreti13@gmail.com");

        waitForElementToBecomeVisible(email,10);

        MobileElement pswd = driver.findElement(new MobileBy.ByAccessibilityId("input-password"));
        pswd.sendKeys("Test@123");
        waitForElementToBecomeVisible(pswd,10);

        MobileElement taplogin = driver.findElement(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup"));
        taplogin.click();

        String result = driver.findElement(MobileBy.id("android:id/alertTitle")).getText();
         System.out.println("success pop up"+ result);
        Assert.assertEquals("Success",result);

        MobileElement clkonOK = driver.findElement(MobileBy.id("android:id/button1"));
        clkonOK.click();

        MobileElement taponswipe = driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Swipe\"]"));
        taponswipe.click();

        MobileElement swipeelmnt = driver.findElement(MobileBy.xpath("(//android.view.ViewGroup[@content-desc=\"card\"])[1]/android.widget.TextView"));
        waitForElementToBecomeVisible(swipeelmnt,10);

        swipeLeft();
        Thread.sleep(5000);

        swipeLeft2();
        Thread.sleep(5000);







      //driver.closeApp();




    }


}
