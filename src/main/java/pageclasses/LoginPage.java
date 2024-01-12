package pageclasses;

import Utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;

public class LoginPage extends WebTestBase {

    @FindBy(id = "username")
    WebElement userNameTextBox;

    @FindBy(id = "password")
    WebElement passwordTextBox;

    @FindBy(xpath = "//input[@value='Log in']")
    WebElement loginBtn;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void loginWithUser(String username, String password) {
        Util.sendTextIntoBox(userNameTextBox, username);
        Util.sendTextIntoBox(passwordTextBox, password);
        Util.waitElementUntilClickable(loginBtn);
    }
}
