package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.CommonUtils;

/**
 * Created by am on 8/12/17.
 */
public class ListScreen extends AbstractScreen {

    public ListScreen(WebDriver driver) {
        super(driver);
    }

    private By SEARCH_TEXT_BOX = By.id(packageName + ":id/input_field");


    public void clickOnSearchBox() {utils.click(SEARCH_TEXT_BOX);}
    public void typeInSearchBox(String name) {utils.type(SEARCH_TEXT_BOX, name);}
}
