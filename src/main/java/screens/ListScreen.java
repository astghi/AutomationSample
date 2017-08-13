package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.CommonUtils;

import java.util.List;

/**
 * Created by am on 8/12/17.
 */
public class ListScreen extends AbstractScreen {

    public ListScreen(WebDriver driver) {
        super(driver);
    }

    private By SEARCH_TEXT_BOX = By.id(packageName + ":id/input_field");
    private By ITEM_DESCRIPTION = By.id(packageName + ":id/description");


    public void clickOnSearchBox() {utils.click(SEARCH_TEXT_BOX);}
    public void typeInSearchBox(String name) {utils.type(SEARCH_TEXT_BOX, name);}

    public boolean isItemAdded(String name) {
        List<WebElement> items = utils.getElements(ITEM_DESCRIPTION);
        for (int i = 0; i < items.size(); i ++) {
            if (items.get(i).getText().equals(name))
                return true;
        }
        return false;
    }
}
