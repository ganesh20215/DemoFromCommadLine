package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;

import java.time.Duration;

public class Util extends WebTestBase {

    public static final long IMPLICITLY_WAIT = 20;
    public static final long PAGE_LOAD_TIME = 20;
    public static final long EXPLICIT_WAIT = 20;
    public static WebDriverWait webDriverWait;

    public static void waitElementUntilClickable(WebElement element){
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static void sendTextIntoBox(WebElement element, String text){
        element.sendKeys(text);
    }

    public static String getTextOfElement(WebElement element){
        return element.getText();
    }

}
