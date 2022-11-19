package tests.iqos;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.iqos.HomePage;
import tests.TestBase;

import java.util.Objects;

public class HomePageTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        HomePage.openUrl("https://lt.iqos.com/lt");
        HomePage.confirmYourAgeToAccessHomePage();
    }

    @Test
    public void testLanguageSwitchFunction() {
        String buttonApieIqosTextAtCurrentLanguage;
        String buttonApieIqosTextAfterLanguageSwitchToEN;
        String expectedButtonTextAfterSwitchToEn = "About IQOS";

        buttonApieIqosTextAtCurrentLanguage = HomePage.readTextFromButtonCurrentLanguage();
        HomePage.clickLanguageChangeButton();
        HomePage.clickOptionEnglish();
        buttonApieIqosTextAfterLanguageSwitchToEN = HomePage.readTextFromButtonEnglishLanguage();

        Assert.assertFalse(Objects.equals(buttonApieIqosTextAtCurrentLanguage,
                buttonApieIqosTextAfterLanguageSwitchToEN));

        Assert.assertEquals(buttonApieIqosTextAfterLanguageSwitchToEN, (expectedButtonTextAfterSwitchToEn));

    }
}
