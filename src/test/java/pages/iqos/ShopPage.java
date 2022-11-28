package pages.iqos;

import pages.Common;
import pages.Locators;

public class ShopPage {
    public static void openUrl(String url) {
        Common.openUrl(url);
    }

    public static void checkIfShopPageIsOpened(String url) {
        Common.checkIfWebPageIsLoaded(url);
    }

    public static void clickOnProductWeChooseLink(String name) {
        Common.scrollIntoViewOfElement(Locators.Iqos.ShopPage.chooseProductByName(name));
        Common.clickElementWithJs(Locators.Iqos.ShopPage.chooseProductByName(name));
    }

    public static void clickButtonIKrepseli() {
        Common.clickElement(Locators.Iqos.ShopPage.buttonIkrepseli);
    }

    public static String checkIfProductWasAddedToCart() {
        Common.waitForElementToBeVisible(Locators.Iqos.ShopPage.h3MiniCart);
        return Common.getTextFromElement(Locators.Iqos.ShopPage.h3MiniCart);
    }

    public static String checkWhichProductWasAddedToCart() {
        return Common.getTextFromElement(Locators.Iqos.ShopPage.h4MiniCart);
    }

    public static void clickOnCartInMainNav() {
        Common.waitForElementToBeVisible(Locators.Iqos.ShopPage.h3MiniCart);
        Common.clickElementWithJs(Locators.Iqos.ShopPage.aCartMainNav);
    }
}
