package pages.iqos;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Common;
import pages.Locators;
import utils.Driver;

import java.time.Duration;

public class HomePage {
    public static void openUrl(String url) {
        Common.openUrl(url);

    }

    public static void confirmYourAgeToAccessHomePage() {
        Common.confirmYourAgeToContinue();
    }

    public static void clickLanguageChangeButton() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Common.clickElement(Locators.Iqos.HomePage.buttonLanguageSwitch);
    }

    public static String readTextFromButtonCurrentLanguage() {
        return Common.getTextFromElement(Locators.Iqos.HomePage.buttonApieIqos);
    }

    public static void clickOptionEnglish() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Common.clickElement(Locators.Iqos.HomePage.aEnglish);
    }

    public static String readTextFromButtonEnglishLanguage() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement Element = Common.getElement(Locators.Iqos.HomePage.buttonAboutIqos);
        js.executeScript("arguments[0].scrollIntoView();", Element);
        return Common.getTextFromElement(Locators.Iqos.HomePage.buttonAboutIqos);
    }

    public static void clickLinkEparduotuve() {
        Common.clickElement(Locators.Iqos.HomePage.aEshop);
    }

    public static void clickLinkVisosPrekes() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Iqos.HomePage.aVisosPrekes));
        Common.clickElement(Locators.Iqos.HomePage.aVisosPrekes);
    }
}
