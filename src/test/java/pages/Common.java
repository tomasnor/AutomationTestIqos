package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.iqos.AgeVerificationPage;
import utils.Driver;

import java.time.Duration;

public class Common {

    public static void openUrl(String url) {
        Driver.setDriver();
        Driver.getDriver().get(url);
    }

    public static void close() {
        Driver.close();
    }

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    public static void selectOptionByValue(By locator, String value) {
        WebElement element = getElement(locator);
        Select selectElement = new Select(element);
        selectElement.selectByValue(value);
    }

    public static void confirmYourAgeToContinue() {
        String month = "2";
        String year = "2000";

        AgeVerificationPage.selectMonthOfBirthOnDropdown(month);
        AgeVerificationPage.selectYearOfBirthOnDropdown(year);
        AgeVerificationPage.clickButtonPatikrinti();
    }

    public static void checkIfWebPageIsLoaded(String url) {
        JavascriptExecutor j = (JavascriptExecutor) Driver.getDriver();
        j.executeScript("return document.readyState")
                .toString().equals("complete");

        String s = Driver.getDriver().getCurrentUrl();

        if (s.equals(url)) {
            System.out.println("Page Loaded");
            System.out.println("Current Url: " + s);
        } else {
            System.out.println("Page did not load");
        }
    }

    public static void clickElementWithJs(By locator) {
        WebElement element = getElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()", element);

    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void scrollToTheBottomOfPage() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    public static void scrollIntoViewOfElement(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement Element = Common.getElement(locator);
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }
}
