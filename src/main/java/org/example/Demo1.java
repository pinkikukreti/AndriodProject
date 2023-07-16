package org.example;

import base.OpenApp;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import junit.framework.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;

public class Demo1 extends OpenApp {

    @BeforeTest
    public void AppLaunching() throws MalformedURLException, InterruptedException {

     MainMethod1();

    }
    @BeforeTest
    public void testmethod(){

   System.out.println("I am Beforetest");
    }
    @BeforeClass
    public void testbeforeclass(){
        System.out.println("I am BeforeClass");

    }

    @BeforeMethod
    public void testbeforemethod(){
        System.out.println("I am BeforeMethod");

    }
    @Test(priority=0)
    public void testcase1() throws InterruptedException {
        MobileElement login = driver.findElement(new MobileBy.ByAccessibilityId("Login"));
        login.click();

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


    }
   // @Test (priority=1)

    /*public void testcase2 () throws InterruptedException {

        Thread.sleep(5000);
        //MobileElement swipeclk = driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc=\"Swipe\"]"));
        //swipeclk.click();
        //waitForElementToBecomeVisible(swipeclk,10);

        MobileElement taponswipe = driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Swipe\"]"));
        taponswipe.click();


        MobileElement swipeelmnt = driver.findElement(MobileBy.xpath("(//android.view.ViewGroup[@content-desc=\"card\"])[1]/android.widget.TextView"));
        waitForElementToBecomeVisible(swipeelmnt,10);

        swipeLeft();

        swipeLeft2();
        Thread.sleep(5000);
*/



    @AfterMethod
        public void testaftermethod (){
        System.out.println("I am Aftermethod");

        }

      @AfterClass
    public void testafterclass (){
          System.out.println("I am Afterclass");

      }

      @AfterTest

      public void testaftertest(){

          System.out.println("I am AftercTest");
      }

    @AfterTest
    public void Testaftersuite(){

        driver.closeApp();


    }

}
