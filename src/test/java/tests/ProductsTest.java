package tests;

import test_data.ExpResConst;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {
    @Test(description = "Checking to adding product in the cart")
    public void addProductToCartTest() {
        productsPage.openPage()
                .addProductToCart(TEST_PRODUCT);
        cartPage.openPage();
        Assert.assertEquals(cartPage.getQuantity(TEST_PRODUCT), ExpResConst.QUANTITY_IN_CART, "Quantity not right");
        Assert.assertEquals(cartPage.getPrice(TEST_PRODUCT), ExpResConst.PRICE_IN_CART, "Price not right");
    }

    @Test(description = "Checking sort panel 'low-high'")
    public void checkingSortPanelLowHigh() {
        productsPage.openPage()
                .changeSortLowHigh();
        Assert.assertEquals(productsPage.checkingFirstProduct(), ExpResConst.FIRST_PRODUCT_HL, "error");
        Assert.assertEquals(productsPage.checkingLastProduct(), ExpResConst.LAST_PRODUCT_HL, "error");
    }

    @Test(description = "Checking sort panel 'high-low'")
    public void checkingSortPanelHighLow() {
        productsPage.openPage()
                .changeSortHighLow();
        Assert.assertEquals(productsPage.checkingLastProduct(), ExpResConst.FIRST_PRODUCT_HL, "error");
        Assert.assertEquals(productsPage.checkingFirstProduct(), ExpResConst.LAST_PRODUCT_HL, "error");
    }

    @Test(description = "Checking sort panel 'Z-A'")
    public void checkingSortPanelZ_A() {
        productsPage.openPage()
                .changeSortZ_A();
        Assert.assertEquals(productsPage.checkingFirstProduct(), ExpResConst.LAST_PRODUCT_AZ, "error");
        Assert.assertEquals(productsPage.checkingLastProduct(), ExpResConst.FIRST_PRODUCT_AZ, "error");
    }

    @Test(description = "Checking sort panel 'A-Z'")
    public void checkingSortPanelA_Z() {
        productsPage.openPage()
                .changeSortA_Z();
        Assert.assertEquals(productsPage.checkingFirstProduct(), ExpResConst.FIRST_PRODUCT_AZ, "error");
        Assert.assertEquals(productsPage.checkingLastProduct(), ExpResConst.LAST_PRODUCT_AZ, "error");
    }

    @Test(description = "Checking of button 'AllItems' in the sidebar")
    public void sideBarCheckingAllItems() {
        productsPage.openPage()
                .clickSideBar()
                .clickAllItemFromSideBar();
        Assert.assertEquals(productsPage.getActualURL(), PRODUCTS_URL);
    }

    @Test(description = "Checking of button 'About' in the sidebar")
    public void sideBarCheckingAbout() {
        productsPage.openPage()
                .clickSideBar()
                .clickAboutFromSideBar();
        Assert.assertEquals(productsPage.getActualURL(), ABOUT_LINK_URL);
    }

    @Test(description = "Checking of button 'Logout' in the sidebar")
    public void sideBarCheckingLogout() {
        productsPage.openPage()
                .clickSideBar()
                .clickLogoutFromSideBar();
        Assert.assertEquals(productsPage.getActualURL(), LOGOUT_LINK_URL);
    }
}