package android;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.ListScreen;
import screens.SignInScreen;
import utils.AndroidTestDriver;
import utils.CommonUtils;
import static org.testng.Assert.assertTrue;


import java.io.IOException;

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
    public void verifyAddingItemToShoppingList() throws InterruptedException, IOException {
        if (signInScreen.isSkipButtonBresent()) {
            signInScreen.clickSkipButton();
        }
        Thread.sleep(4000);
        if (signInScreen.isAlertDialogPresent()) {
            signInScreen.clikUpdateAlertOkButton();
        }
        listScreen.clickOnSearchBox();
        listScreen.typeInSearchBox("Biscuit");
        utils.sendKeyEvent(66);
        assertTrue(!listScreen.isItemAdded("Biscuit"), "Item is not added");
    }
}
