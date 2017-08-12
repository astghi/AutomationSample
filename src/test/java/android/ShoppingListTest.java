package android;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.ListScreen;
import screens.SignInScreen;
import utils.AndroidTestDriver;
import utils.CommonUtils;

/**
 * Created by am on 8/12/17.
 */
public class ShoppingListTest extends AndroidTestDriver {

    ListScreen listScreen;
    SignInScreen signInScreen;
    CommonUtils utils;

    @BeforeMethod
    public void setUp(){
        listScreen = new ListScreen(driver);
        signInScreen = new SignInScreen(driver);
        utils = new CommonUtils(driver);
    }

    // TEST #6 from checklist
    // Verify Search by typing the product name.
    @Test
    public void verifyAddingItemToShoppingList() throws InterruptedException {
        if (signInScreen.isSkipButtonBresent()) {
            signInScreen.clickSkipButton();
        }

        listScreen.clickOnSearchBox();
        if (signInScreen.isAlertDialogPresent()) {
            signInScreen.clikUpdateAlertOkButton();
        }
        listScreen.typeInSearchBox("bis");
    }
}
