package tests.iqos;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.iqos.AgeVerificationPage;
import tests.TestBase;

public class AgeVerificationTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        AgeVerificationPage.openUrl("https://lt.iqos.com/lt");
    }

    @Test
    public void testAgeVerificationFormPositive() {

        String month = "2";
        String year = "2000";
        boolean isMainPageContentVisible;

        AgeVerificationPage.checkIfAgeVerificationFormIsVisible();
        AgeVerificationPage.selectMonthOfBirthOnDropdown(month);
        AgeVerificationPage.selectYearOfBirthOnDropdown(year);
        AgeVerificationPage.clickButtonPatikrinti();

        isMainPageContentVisible = AgeVerificationPage.checkIfMainPageIsOpened();

        Assert.assertTrue(isMainPageContentVisible);

    }

    @Test
    public void testAgeVerificationFormNegative() {

        String month = "4";
        String year = "2011";
        String expectedTextInAgeGateFormLessThan18 = "skirtus asmenims, vyresniems nei 18 metų.";
        String textInAgeGateFormLessThan18;

        AgeVerificationPage.checkIfAgeVerificationFormIsVisible();

        AgeVerificationPage.selectMonthOfBirthOnDropdown(month);
        AgeVerificationPage.selectYearOfBirthOnDropdown(year);
        AgeVerificationPage.clickButtonPatikrinti();

        textInAgeGateFormLessThan18 = AgeVerificationPage.readTextInAgeFormAfterEntering();

        Assert.assertTrue(textInAgeGateFormLessThan18.contains(expectedTextInAgeGateFormLessThan18));

    }
}
