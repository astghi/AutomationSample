package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by am on 8/12/17.
 */
public class SignInScreen extends AbstractScreen {
    public SignInScreen(WebDriver driver) {
        super(driver);
    }

    private By SKIP_BUTTON = By.id(packageName + ":id/action_skip");
    private By UPDATE_ALERT = By.id(packageName + ":id/alertTitle");
    private By UPDATE_ALERT_OK_BUTTON = By.id(packageName + ":id/button1");

    public void clickSkipButton() {utils.click(SKIP_BUTTON);}
    public void clikUpdateAlertOkButton() { utils.click(UPDATE_ALERT_OK_BUTTON);}

    public boolean isAlertDialogPresent() {return utils.isElementPresent(UPDATE_ALERT);}
    public boolean isSkipButtonBresent() { return utils.isElementPresent(SKIP_BUTTON);}
}
