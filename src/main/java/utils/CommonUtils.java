package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by am on 8/12/17.
 */
public class CommonUtils {

    private WebDriver driver;

    public CommonUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By by) {driver.findElement(by).click();}

    public boolean isElementPresent(By by) {
        List<WebElement> elements;
        elements = driver.findElements(by);
        if (elements.size() > 0)
            return true;
        else
            return false;
    }

    public void type(By by, String name) {
        driver.findElement(by).sendKeys(name);
    }
}
