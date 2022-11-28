package pages.iqos;

import pages.Common;
import pages.Locators;

public class HomePage {
    public static void openUrl(String url) {
        Common.openUrl(url);

    }

    public static void confirmYourAgeToAccessHomePage() {
        Common.confirmYourAgeToContinue();
    }

    public static void clickLanguageChangeButton() {
        Common.scrollToTheBottomOfPage();
        Common.clickElementWithJs(Locators.Iqos.HomePage.buttonLanguageSwitch);
    }

    public static String readTextFromButtonCurrentLanguage() {
        return Common.getTextFromElement(Locators.Iqos.HomePage.buttonApieIqos);
    }

    public static void clickOptionEnglish() {
        Common.clickElementWithJs(Locators.Iqos.HomePage.aEnglish);
    }

    public static String readTextFromButtonEnglishLanguage() {
        Common.scrollIntoViewOfElement(Locators.Iqos.HomePage.buttonAboutIqos);
        return Common.getTextFromElement(Locators.Iqos.HomePage.buttonAboutIqos);
    }

    public static void clickLinkEparduotuve() {
        Common.clickElementWithJs(Locators.Iqos.HomePage.aEshop);
    }

    public static void clickLinkIqos3DuoLinija() {
        Common.waitForElementToBeVisible(Locators.Iqos.HomePage.aIqos3Duo);
        Common.clickElement(Locators.Iqos.HomePage.aIqos3Duo);
    }

    public static void clickLinkVisosIqos3DuoPrekes() {
        Common.waitForElementToBeVisible(Locators.Iqos.HomePage.aIqos3DuoVisosPrekes);
        Common.clickElement(Locators.Iqos.HomePage.aIqos3DuoVisosPrekes);
    }
}
