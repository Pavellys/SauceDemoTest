package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CardTests extends BaseTest{
    @Test
    public void buttonCheckout(){
        loginPage.openPage();
        loginPage.login(loginPage.USERNAME, loginPage.PASSWORD);
        cartPage.openPage();
        cartPage.clickToCheckoutButton(cartPage.BUTTON_CHECKOUT);
        Assert.assertEquals(loginPage.getURL(), "https://www.saucedemo.com/checkout-step-one.html","error");
    }
    @Test
    public void buttonContinueShopping(){
        loginPage.openPage();
        loginPage.login(loginPage.USERNAME, loginPage.PASSWORD);
        cartPage.openPage();
        cartPage.clickToCheckoutButton(cartPage.BUTTON_CONTINUE_SHOPPING);
        Assert.assertEquals(loginPage.getURL(), "https://www.saucedemo.com/inventory.html","error");
    }
}
