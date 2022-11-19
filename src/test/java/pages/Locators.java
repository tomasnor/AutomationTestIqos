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
    }
}
