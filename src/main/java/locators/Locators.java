package locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Assert;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class Locators {


    public Locators(AppiumDriver<MobileElement>appiumDriver){

        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, Duration.ofSeconds(10)),this);
    }


        @AndroidFindBy(accessibility = "Preference")
        public MobileElement prefences;

        @AndroidFindBy(accessibility = "3. Preference dependencies")
        public MobileElement dependcies ;

        @AndroidFindBy(id = "andriod:id/checkbox")
        public MobileElement chkbox;

        @AndroidFindBy(xpath = "//android.widget.TextView[@text='WiFi settings']")
        public MobileElement wifisettings;

        @AndroidFindBy(id = "android:id/edit")
        public MobileElement enterwifiname;

        @AndroidFindBy(id = "android:id/button1")
        public MobileElement buttonclk;






    }

