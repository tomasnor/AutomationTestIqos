package tests.iqos;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Common;
import pages.iqos.AgeVerificationPage;
import tests.TestBase;

public class AgeVerificationTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        AgeVerificationPage.openUrl("https://lt.iqos.com/lt");
    }

    @Test
    public void testAgeVerificationForm() {

        String month = "2";
        String year = "2000";

        AgeVerificationPage.checkIfAgeVerificationFormIsVisible();
        AgeVerificationPage.selectMonthOfBirthOnDropdown(month);
        AgeVerificationPage.selectYearOfBirthOnDropdown(year);
        AgeVerificationPage.clickButtonPatikrinti();
        AgeVerificationPage.checkIfMainPageIsOpened();

    }
}
