package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageclasses.HomePage;
import pageclasses.LoginPage;
import pageclasses.MyAccountPage;
import testbase.WebTestBase;

public class LoginTest extends WebTestBase {

    public static HomePage homePage;
    public static LoginPage loginPage;
    public static MyAccountPage myAccountPage;

    LoginTest() {
        super();
    }

    @BeforeMethod
    public void preCondition() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
    }

    @Test(description = "Verify login functionality with valid username and valid password")
    public void verifyLoginWithValidUsernameAndPassword() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnLoginOrRegisterElement();
        loginPage.loginWithUser(prop.getProperty("username"), prop.getProperty("password"));
        softAssert.assertEquals(myAccountPage.getTextOfMyAccountElement(), "MY ACCOUNT", "My Account text should be matched");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
