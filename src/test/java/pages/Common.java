package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.iqos.AgeVerificationPage;
import utils.Driver;

public class Common {

    public static void openUrl(String url) {
        Driver.setDriver();
        Driver.getDriver().get(url);
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void close() {
        Driver.close();
    }

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void sendKeysToElement(By locator, String keys) {
        getElement(locator).sendKeys(keys);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    public static String getElementAttributeValue(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }

    public static void selectOptionByValue(By locator, String value) {
        WebElement element = getElement(locator);
        Select selectElement = new Select(element);
        selectElement.selectByValue(value);
    }


    public static void confirmYourAgeToContinue() {
        String month = "2";
        String year = "2000";

        AgeVerificationPage.checkIfAgeVerificationFormIsVisible();
        AgeVerificationPage.selectMonthOfBirthOnDropdown(month);
        AgeVerificationPage.selectYearOfBirthOnDropdown(year);
        AgeVerificationPage.clickButtonPatikrinti();
        AgeVerificationPage.checkIfMainPageIsOpened();
    }
}
