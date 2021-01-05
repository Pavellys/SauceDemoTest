package constants;

public interface Constants  {
    String SAUCE_DEMO_URL = "https://www.saucedemo.com";
    String PRODUCTS_URL = SAUCE_DEMO_URL + "/inventory.html";
    String CART_URL = SAUCE_DEMO_URL + "/cart.html";
    String CHECKOUT_URL = SAUCE_DEMO_URL + "/checkout-step-one.html";
    String ABOUT_LINK_URL = "https://saucelabs.com/";
    String LOGOUT_LINK_URL = SAUCE_DEMO_URL + "/index.html";
    String PRODUCTS_ELEMENTS = "//*[@class='inventory_item_name']";
    String ADD_PRODUCT_TO_CART = "//*[text() = '%s']/ancestor::*[@class='inventory_item']//button\n";
}
