package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static java.lang.Thread.sleep;

public class OpenApp {

    public static AppiumDriver<MobileElement> driver;

    public static void MainMethod1() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("platformVersion", "13");
        desiredCapabilities.setCapability("appPackage", "io.appium.android.apis");
        desiredCapabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
        //desiredCapabilities.setCapability("appPackage", "com.wdiodemoapp");
        //desiredCapabilities.setCapability("appActivity", "com.wdiodemoapp.MainActivity");
        desiredCapabilities.setCapability("noReset", false);
        String url = "http://127.0.0.1:4723/wd/hub";
        driver = new AndroidDriver<MobileElement>(new URL(url), desiredCapabilities);
        sleep(5000);
        System.out.println("Application Started");
    }

    public static void waitForElementToBecomeVisible(MobileElement element, int waitInSeconds) throws InterruptedException {
        new WebDriverWait(driver, waitInSeconds).until(ExpectedConditions.visibilityOf(element));

    }


    public static void swipeLeft() throws InterruptedException {
        // Reporter.log(currentClassName + "Swiping Left", true);
        sleep(2000);
        TouchAction dragNDrop;
        dragNDrop = new TouchAction(driver)
                .press(PointOption.point(918, 1251)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(190, 1251))
                .release();
        dragNDrop.perform();


    }

    public static void swipeLeft2() throws InterruptedException {
        // Reporter.log(currentClassName + "Swiping Left", true);
        sleep(2000);
        TouchAction dragNDrop;
        dragNDrop = new TouchAction(driver)
                .press(PointOption.point(909, 1251)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(159, 1251))
                .release();
        dragNDrop.perform();


    }

    public static void ScrollingPage(String element) throws InterruptedException {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector())" +
                ".scrollIntoView(new UiSelector().textContains(\"" + element + "\").instance(0));"));
        Thread.sleep(1000);

    }

}

