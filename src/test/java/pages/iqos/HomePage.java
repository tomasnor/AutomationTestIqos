package pages.iqos;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.Common;
import pages.Locators;
import utils.Driver;

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
}
