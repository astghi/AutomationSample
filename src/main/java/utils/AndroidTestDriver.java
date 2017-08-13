package utils;

import org.testng.annotations.AfterClass;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
/**
 * Created by am on 8/12/17.
 */
public class AndroidTestDriver {

    public AndroidDriver driver;

    File currDir = new File("");
    String path = currDir.getAbsolutePath();
    String app = path + ".apps/com.capigami.outofmilk.apk";

    public void instantiateDevice() throws MalformedURLException {

        System.out.println("Test is going to be run on device with <" + "D6633" + "> deviceID");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("appPath", app);
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "6.0.1");
        capabilities.setCapability("appPackage", "com.capigami.outofmilk");
        capabilities.setCapability("appActivity", ".MainActivity");
        capabilities.setCapability("appium-version", "1.6.5");
        capabilities.setCapability("deviceName", "D6633");
        capabilities.setCapability("newCommandTimeout", 40);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4725" + "/wd/hub"), capabilities);
    }

    @BeforeMethod
    public void startDriver() throws MalformedURLException {
        instantiateDevice();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }
}
