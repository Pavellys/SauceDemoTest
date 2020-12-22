package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTests extends BaseTest {
    @Test
    public void addProductToCartTest() {
        loginPage.openPage();
        loginPage.login(loginPage.USERNAME, loginPage.PASSWORD);
        productsPage.addProductToCart("Sauce Labs Fleece Jacket");
        cartPage.openPage();
        Assert.assertEquals(cartPage.getQuantity(), "1", "Quantity not right");
        Assert.assertEquals(cartPage.getPrice(), "49.99", "Price not right");
    }
    @Test
    public void checkingSortPanelLowHigh(){
        loginPage.openPage();
        loginPage.login(loginPage.USERNAME, loginPage.PASSWORD);
        productsPage.changeSortLowHigh();
        Assert.assertEquals(productsPage.checkingFirstProduct(), "Sauce Labs Onesie", "error");
        Assert.assertEquals(productsPage.checkingLastProduct(), "Sauce Labs Fleece Jacket", "error");
    }
    @Test
    public void checkingSortPanelHighLow(){
        loginPage.openPage();
        loginPage.login(loginPage.USERNAME, loginPage.PASSWORD);
        productsPage.changeSortHighLow();
        Assert.assertEquals(productsPage.checkingLastProduct(), "Sauce Labs Onesie", "error");
        Assert.assertEquals(productsPage.checkingFirstProduct(), "Sauce Labs Fleece Jacket", "error");
    }
    @Test
    public void checkingSortPanelZ_A(){
        loginPage.openPage();
        loginPage.login(loginPage.USERNAME, loginPage.PASSWORD);
        productsPage.changeSortZ_A();
        Assert.assertEquals(productsPage.checkingFirstProduct(), "Test.allTheThings() T-Shirt (Red)", "error");
        Assert.assertEquals(productsPage.checkingLastProduct(), "Sauce Labs Backpack","error");
    }
    @Test
    public void checkingSortPanelA_Z(){
        loginPage.openPage();
        loginPage.login(loginPage.USERNAME, loginPage.PASSWORD);
        productsPage.changeSortA_Z();
        Assert.assertEquals(productsPage.checkingFirstProduct(), "Sauce Labs Backpack", "error");
        Assert.assertEquals(productsPage.checkingLastProduct(), "Test.allTheThings() T-Shirt (Red)", "error");
    }
}
