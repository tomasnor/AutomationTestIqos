package pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Iqos {
        public static class AgeVerificationPage {

            public static By selectMonth = By.xpath("//select[@id='age_gate_month']");
            public static By selectYear = By.xpath("//select[@id='age_gate_year']");
            public static By buttonPatvirtinti = By.xpath("//a[@id='age-gate-check']");
            public static By mainPage = By.xpath("//main[@class='page-main ']");
        }

        public static class HomePage {
            public static By buttonLanguageSwitch = By.xpath("//button[@data-toggle='#language-list-1']" +
                    "/span[@class='c-language-switcher__list__ico c-footer__lang-list__ico']");
            public static By buttonApieIqos = By.xpath("//a[@data-name='Apie IQOS']");
            public static By aEnglish = By.xpath(
                    "//div[@id='language-wrapper-1']//a[@href='https://lt.iqos.com/en']");
            public static By buttonAboutIqos = By.xpath("//a[@data-name='About IQOS']");
        }
    }
}
