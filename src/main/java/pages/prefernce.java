package pages;

import base.OpenApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import locators.Locators;

public class prefernce extends OpenApp {
    Locators loc;

public prefernce(AppiumDriver<MobileElement>appiumDriver){

loc=new Locators(appiumDriver);
}

public void clickonprefernce (){

    loc.prefences.click();
}

    public void clickondependencies (){

    loc.dependcies.click();
    }

    public void clickonCheckbox(){

    loc.chkbox.click();
    }

    public void taponwifi (){

    loc.wifisettings.click();
    }

    public void enterwifiname (){

    loc.enterwifiname.sendKeys("testpinki");
    }

    public void clickonButton (){

    loc.buttonclk.click();
    }




}
