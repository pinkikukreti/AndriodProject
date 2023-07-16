package org.example;

import io.appium.java_client.MobileBy;
import junit.framework.Assert;

import java.net.MalformedURLException;

public class ScrollingPage extends Content{


    public static void main (String [] args) throws MalformedURLException, InterruptedException {

        ParentClass();
        driver.findElement(new MobileBy.ByAccessibilityId("Graphics")).click();
        Thread.sleep(2000);
        ScrollingPage("xfermodes");
        driver.findElement(new MobileBy.ByAccessibilityId("Xfermodes")).click();
        Thread.sleep(2000);

        String title = driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")).getText();
        Assert.assertEquals("Graphics/Xfermodes", title);

        System.out.println(title);
        driver.closeApp();
    }

            public static void ScrollingPage (String element) throws InterruptedException {
                driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector())" +
                        ".scrollIntoView(new UiSelector().textContains(\"" + element+ "\").instance(0));"));
                Thread.sleep(1000);



  }
}
