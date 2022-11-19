package pages.iqos;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import pages.Common;
import pages.Locators;

public class AgeVerificationPage {
    public static void openUrl(String url) {
        Common.openUrl(url);
    }

    public static void checkIfAgeVerificationFormIsVisible() {
        Common.getElement(By.id("agree-question"));
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

    public static void checkIfMainPageIsOpened() {
        Common.getElement(Locators.Iqos.AgeVerificationPage.mainPage);
    }
}
