package tests.iqos;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.iqos.CartPage;
import pages.iqos.HomePage;
import pages.iqos.ShopPage;
import tests.TestBase;

public class CartTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        CartPage.openUrl("https://lt.iqos.com/lt");
        HomePage.confirmYourAgeToAccessHomePage();
        HomePage.clickLinkEparduotuve();
        HomePage.clickLinkIqos3DuoLinija();
        HomePage.clickLinkVisosIqos3DuoPrekes();
    }

    @DataProvider(name = "removeItemFromCartDataProvider")
    public Object[][] dataProviderFunctionItemDelete() {
        return new Object[][]{
                {"https://lt.iqos.com/lt/krepselis", "IQOS 3 DUO Sistema", "Jūsų krepšelis yra tuščias"}
        };
    }

    @Test(dataProvider = "removeItemFromCartDataProvider")
    public void testItemRemoveFunctionInCart(
            String cartPageUrl, String chosenProductName, String expectedTextAfterItemDelete) {

        String actualTextAfterItemDelete;

        ShopPage.clickOnProductWeChooseLink(chosenProductName);
        ShopPage.clickButtonIKrepseli();
        ShopPage.clickOnCartInMainNav();

        CartPage.checkIfCartPageIsOpened(cartPageUrl);
        CartPage.clickLinkPasalinti();
        actualTextAfterItemDelete = CartPage.readparagraphText();

        Assert.assertEquals(actualTextAfterItemDelete, expectedTextAfterItemDelete);
    }
}
