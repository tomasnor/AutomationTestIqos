package pages.iqos;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.Common;
import pages.Locators;
import utils.Driver;

public class CartPage {
    public static void openUrl(String url) {
        Common.openUrl(url);
    }

    public static void checkIfCartPageIsOpened(String url) {
        Common.checkIfWebPageIsLoaded(url);
    }

    public static void clickLinkPasalinti() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement Element = Common.getElement(Locators.Iqos.CartPage.aPasalinti);
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Common.clickElementWithJs(Locators.Iqos.CartPage.aPasalinti);
    }

    public static String readparagraphText() {
        return Common.getTextFromElement(Locators.Iqos.CartPage.h1JusuKrepselis);
    }
}
