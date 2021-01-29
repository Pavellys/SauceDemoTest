package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import utils.AllureUtils;

public class CartTest extends BaseTest{
    @Test(description = "Checking of button 'checkout'")
    public void buttonCheckout(){
        cartPage.openPage()
                .clickToCheckoutButton();
        checkoutPage.waitForPageCheckOutOpened();
        Assert.assertEquals(cartPage.getURL(), CHECKOUT_URL,"error");
        AllureUtils.takeScreenshot(driver);
    }
    @Test(description = "Checking of button 'continue'")
    public void buttonContinueShopping(){
        cartPage.openPage()
                .clickToContinueButton();
        checkoutPage.waitForPageContinueOpened();
        Assert.assertEquals(cartPage.getURL(), PRODUCTS_URL,"error");
        AllureUtils.takeScreenshot(driver);
    }
}