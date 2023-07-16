package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class NewApp {

    public static AppiumDriver<MobileElement> driver;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("PlatformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "13");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("appPackage", "com.wdiodemoapp");
        desiredCapabilities.setCapability("appActivity", "com.wdiodemoapp.MainActivity");
        desiredCapabilities.setCapability("noReset", "true");

        String url="http://127.0.0.1:4723/wd/hub";
        driver = new AndroidDriver<MobileElement>(new URL(url), desiredCapabilities);
        Thread.sleep(5000);
        System.out.println("Application started");

        //driver.closeApp();





    }
}
