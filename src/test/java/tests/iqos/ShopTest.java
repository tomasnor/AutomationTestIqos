package tests.iqos;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.iqos.HomePage;
import pages.iqos.ShopPage;
import tests.TestBase;

public class ShopTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        ShopPage.openUrl("https://lt.iqos.com/lt");
        HomePage.confirmYourAgeToAccessHomePage();
        HomePage.clickLinkEparduotuve();
        HomePage.clickLinkVisosPrekes();
    }

    @DataProvider(name = "addToCartDataProvider")
    public Object[][] dataProviderFunction() {
        return new Object[][]{
                {"https://lt.iqos.com/lt/parduotuve", "lil SOLID 2.0", "Prekė įdėta į"},
                {"https://lt.iqos.com/lt/parduotuve", "IQOS 3 DUO Sistema", "Prekė įdėta į"}
        };
    }

    @Test(dataProvider = "addToCartDataProvider")
    public void testItemAddToCartFunction(String shopPageUrl, String chosenProductName, String expectedTextInMiniCart) {

        String textFromMiniCartAfterProductAdd;
        String productNameInMiniCartAfterAdding;

        ShopPage.checkIfShopPageIsOpened(shopPageUrl);
        ShopPage.clickOnProductWeChooseLink(chosenProductName);
        ShopPage.clickButtonIKrepseli();
        textFromMiniCartAfterProductAdd = ShopPage.checkIfProductWasAddedToCart();
        productNameInMiniCartAfterAdding = ShopPage.checkWhichProductWasAddedToCart();

        Assert.assertTrue(textFromMiniCartAfterProductAdd.contains(expectedTextInMiniCart));
        Assert.assertEquals(productNameInMiniCartAfterAdding, chosenProductName);

    }
}
