package pages.iqos;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Common;
import pages.Locators;
import utils.Driver;

import java.time.Duration;

public class ShopPage {
    public static void openUrl(String url) {
        Common.openUrl(url);
    }

    public static void checkIfShopPageIsOpened(String url) {
        Common.checkIfWebPageIsLoaded(url);
    }

    public static void clickOnProductWeChooseLink(String name) {
        Common.clickElementWithJs(Locators.Iqos.ShopPage.chooseProductByName(name));
    }

    public static void clickButtonIKrepseli() {
        Common.clickElement(Locators.Iqos.ShopPage.buttonIkrepseli);
    }

    public static String checkIfProductWasAddedToCart() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Iqos.ShopPage.h3MiniCart));
        return Common.getTextFromElement(Locators.Iqos.ShopPage.h3MiniCart);

    }

    public static String checkWhichProductWasAddedToCart() {
        return Common.getTextFromElement(Locators.Iqos.ShopPage.h4MiniCart);
    }
}
