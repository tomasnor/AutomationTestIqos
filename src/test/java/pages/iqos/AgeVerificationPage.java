package pages.iqos;

import org.openqa.selenium.ElementClickInterceptedException;
import pages.Common;
import pages.Locators;

public class AgeVerificationPage {

    public static void openUrl(String url) {
        Common.openUrl(url);
    }

    public static void selectMonthOfBirthOnDropdown(String value) {
        Common.selectOptionByValue(
                Locators.Iqos.AgeVerificationPage.selectMonth,
                value
        );
    }

    public static void selectYearOfBirthOnDropdown(String value) {
        Common.selectOptionByValue(
                Locators.Iqos.AgeVerificationPage.selectYear,
                value
        );
    }

    public static void clickButtonPatikrinti() {
        Common.clickElement(Locators.Iqos.AgeVerificationPage.buttonPatvirtinti);
    }

    public static boolean checkIfMainPageIsOpened() {
        try {
            Common.clickElement(Locators.Iqos.HomePage.aEshop);
        } catch (ElementClickInterceptedException e) {
            System.out.println("Main page is not opened");
            return false;
        }
        return true;
    }

    public static String readTextInAgeFormAfterEntering() {
        Common.waitForElementToBeVisible(Locators.Iqos.AgeVerificationPage.paragraphAgeGateStep);
        return Common.getTextFromElement(Locators.Iqos.AgeVerificationPage.paragraphAgeGateStep);
    }
}
