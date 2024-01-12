package pageclasses;

import Utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;

public class HomePage extends WebTestBase {

    @FindBy(xpath = "//a[@class='user-controls__ul__li__a']")
    WebElement loginOrRegisterElement;

    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement closeFirstAd;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }


    public void clickOnLoginOrRegisterElement(){
        Util.waitElementUntilClickable(closeFirstAd);
        Util.waitElementUntilClickable(loginOrRegisterElement);
    }
}
