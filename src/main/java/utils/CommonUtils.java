package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.io.InputStream;
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

    public void sendKeyEvent (int event) throws IOException, InterruptedException {
        String command = "adb -s " + "shell input keyevent " + event;
        String out = processHandler(command);
    }

    public String processHandler (String command) throws IOException, InterruptedException {
        Process pc = Runtime.getRuntime().exec(command);
        pc.waitFor();
        InputStream inputStream = pc.getInputStream();
        int size = inputStream.available();
        byte out [] = new byte[size];
        inputStream.read(out);
        String output = new String(out,"UTF-8");
        return output;
    }

    public List<WebElement> getElements(By by) { return driver.findElements(by);}
}
