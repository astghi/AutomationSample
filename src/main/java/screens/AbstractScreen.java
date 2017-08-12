package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtils;

import java.util.concurrent.TimeUnit;

/**
 * Created by am on 8/12/17.
 */
public class AbstractScreen {

    AppiumDriver driver;
    protected CommonUtils utils;
    static final String packageName = "com.capigami.outofmilk";

    public AbstractScreen(WebDriver driver) {
        this.driver = (AppiumDriver) driver;
        this.utils = new CommonUtils(driver);
    }

}
