package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
public class CardTests extends BaseTest{
    @Test
    public void buttonCheckout(){
        CartPage cartPage = new CartPage(driver);
        cartPage.openPage();
        cartPage.clickToCheckoutButton();
        cartPage.isPageOpened();
        Assert.assertEquals(cartPage.getURL(), CHECKOUT_URL,"error");
    }
    @Test
    public void buttonContinueShopping(){
        CartPage cartPage = new CartPage(driver);
        cartPage.openPage();
        cartPage.clickToContinueButton();
        cartPage.isPageOpenedContinue();
        Assert.assertEquals(cartPage.getURL(), PRODUCTS_URL,"error");
    }
}