package pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Iqos {
        public static class AgeVerificationPage {

            public static By selectMonth = By.xpath("//select[@id='age_gate_month']");
            public static By selectYear = By.xpath("//select[@id='age_gate_year']");
            public static By buttonPatvirtinti = By.xpath("//a[@id='age-gate-check']");
            public static By headerMainPage = By.xpath("//header[@id='header']");
            public static By paragraphAgeGateStep = By.xpath("//p[@class='age-gate-step-text']");
        }

        public static class HomePage {
            public static By buttonLanguageSwitch = By.xpath(
                    "//button[@data-toggle='#language-list-1']" +
                            "/span[@class='c-language-switcher__list__ico c-footer__lang-list__ico']");
            public static By buttonApieIqos = By.xpath("//a[@data-name='Apie IQOS']");
            public static By aEnglish = By.xpath(
                    "//div[@id='language-wrapper-1']//a[@href='https://lt.iqos.com/en']");
            public static By buttonAboutIqos = By.xpath("//a[@data-name='About IQOS']");
            public static By aEshop = By.xpath("//a[@data-nav_taxonomy='E-shop']");
            public static By aIqos3Duo = By.xpath("//a[contains(text(),'IQOS 3 DUO')]");
            public static By aIqos3DuoVisosPrekes =
                    By.xpath("//a[@href='https://lt.iqos.com/lt/parduotuve/3-duo' " +
                            "and @class='c-nav4__third__item__link']");
        }

        public static class ShopPage {

            public static By h4MiniCart = By.xpath("//div[@class='prod-desc']/h4");
            public static By aCartMainNav = By.xpath("//a[@href='https://lt.iqos.com/lt/krepselis'" +
                    " and @class='c-nav4__icon header-icon-cart header-icon js-cart-icon']");

            public static By chooseProductByName(String name) {
                return By.xpath(
                        String.format("//h3[@data-ca-title=\"%s\"]", name));
            }

            public static By buttonIkrepseli = By.xpath("//button[contains(text(),\"Į Krepšelį\")]");
            public static By h3MiniCart = By.xpath("//div[@id='minicart']/header/h3");
        }

        public static class CartPage {
            public static By aPasalinti = By.xpath("//a[@class=' emph delete-cart-item']");
            public static By h1JusuKrepselis = By.xpath("//div[@class='content-wrapper']/h1");
        }
    }
}
