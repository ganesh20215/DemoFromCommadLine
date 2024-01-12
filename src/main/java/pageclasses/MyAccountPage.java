package pageclasses;

import Utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;

public class MyAccountPage extends WebTestBase {

    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement myAccountElement;

    public MyAccountPage(){
        PageFactory.initElements(driver, this);
    }

    public String getTextOfMyAccountElement(){
        return Util.getTextOfElement(myAccountElement);
    }
}
