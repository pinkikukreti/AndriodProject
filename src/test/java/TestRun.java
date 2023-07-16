import base.OpenApp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.prefernce;

import java.net.MalformedURLException;

public class TestRun extends OpenApp {

    prefernce tst;

    @BeforeSuite
    public void openmyapp() throws MalformedURLException, InterruptedException {

        MainMethod1();
    }

    @BeforeClass

    public void setupObject1(){

    tst= PageFactory.initElements(driver,prefernce.class);
    }

   @Test
    public void performclick (){
    tst.clickonprefernce();
    tst.clickondependencies();
    tst.clickonCheckbox();
    tst.taponwifi();
    tst.enterwifiname();
    tst.clickonButton();

    }

   @AfterSuite
    public void closeApp(){

      driver.closeApp();

   }


}
