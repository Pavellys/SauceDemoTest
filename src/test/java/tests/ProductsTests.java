package tests;
import constants.ExpResConst;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ProductsPage;
public class ProductsTests extends BaseTest {
    @Test
    public void addProductToCartTest() {
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);
        productsPage.openPage();
        productsPage.addProductToCart("Sauce Labs Fleece Jacket");
        cartPage.openPage();
        Assert.assertEquals(cartPage.getQuantity(), ExpResConst.QUANTITY_IN_CART, "Quantity not right");
        Assert.assertEquals(cartPage.getPrice(), ExpResConst.PRICE_IN_CART, "Price not right");
    }
    @Test
    public void checkingSortPanelLowHigh(){
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.openPage();
        productsPage.changeSortLowHigh();
        Assert.assertEquals(productsPage.checkingFirstProduct(), ExpResConst.FIRST_PRODUCT_HL, "error");
        Assert.assertEquals(productsPage.checkingLastProduct(), ExpResConst.LAST_PRODUCT_HL, "error");
    }
    @Test
    public void checkingSortPanelHighLow(){
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.openPage();
        productsPage.changeSortHighLow();
        Assert.assertEquals(productsPage.checkingLastProduct(), ExpResConst.FIRST_PRODUCT_HL, "error");
        Assert.assertEquals(productsPage.checkingFirstProduct(), ExpResConst.LAST_PRODUCT_HL, "error");
    }
    @Test
    public void checkingSortPanelZ_A(){
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.openPage();
        productsPage.changeSortZ_A();
        Assert.assertEquals(productsPage.checkingFirstProduct(), ExpResConst.LAST_PRODUCT_AZ, "error");
        Assert.assertEquals(productsPage.checkingLastProduct(), ExpResConst.FIRST_PRODUCT_AZ,"error");
    }
    @Test
    public void checkingSortPanelA_Z(){
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.openPage();
        productsPage.changeSortA_Z();
        Assert.assertEquals(productsPage.checkingFirstProduct(), ExpResConst.FIRST_PRODUCT_AZ, "error");
        Assert.assertEquals(productsPage.checkingLastProduct(), ExpResConst.LAST_PRODUCT_AZ, "error");
    }
    @Test
    public void sideBarCheckingAllItems(){
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.openPage();
        productsPage.clickSideBar()
                .clickAllItemFromSideBar();
        Assert.assertEquals(productsPage.getActualURL(), PRODUCTS_URL);
    }
    @Test
    public void sideBarCheckingAbout(){
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.openPage();
        productsPage.clickSideBar()
                .clickAboutFromSideBar();
        Assert.assertEquals(productsPage.getActualURL(), ABOUT_LINK_URL);
    }
    @Test
    public void sideBarCheckingLogout(){
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.openPage();
        productsPage.clickSideBar()
                .clickLogoutFromSideBar();
        Assert.assertEquals(productsPage.getActualURL(), LOGOUT_LINK_URL);
    }
}