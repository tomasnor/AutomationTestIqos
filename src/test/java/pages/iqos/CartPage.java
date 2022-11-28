package pages.iqos;

import pages.Common;
import pages.Locators;

public class CartPage {
    public static void openUrl(String url) {
        Common.openUrl(url);
    }

    public static void checkIfCartPageIsOpened(String url) {
        Common.checkIfWebPageIsLoaded(url);
    }

    public static void clickLinkPasalinti() {
        Common.scrollIntoViewOfElement(Locators.Iqos.CartPage.aPasalinti);
        Common.clickElementWithJs(Locators.Iqos.CartPage.aPasalinti);
    }

    public static String readparagraphText() {
        return Common.getTextFromElement(Locators.Iqos.CartPage.h1JusuKrepselis);
    }
}
