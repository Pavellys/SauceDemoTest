package pages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    @FindBy(xpath = "//*[@class='btn_action checkout_button']")
    WebElement buttonCheckout;
    @FindBy(xpath = "//*[@class='btn_secondary']")
    WebElement buttonContinueShopping;
    String CART_PRICE = "//*[text() = '%s']/ancestor::*[@class='cart_item']//*[@class='inventory_item_price']";
    String CART_QUANTITY = "//*[text() = '%s']/ancestor::*[@class='cart_item']//*[@class='cart_quantity']";


    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void isPageOpened() {
        //TODO: Implement this method
    }

    @Step("Opening Cart Page")
    public CartPage openPage() {
        driver.get(CART_URL);
        return this;
    }

    @Step("Click to Checkout Button")
    public CartPage clickToCheckoutButton() {
        buttonCheckout.click();
        return this;
    }

    @Step("Click to Continue Button")
    public CartPage clickToContinueButton(){
        buttonContinueShopping.click();
        return this;
    }

    @Step("Getting current URL")
    public String getURL() {
        return driver.getCurrentUrl();
    }

    @Step("Getting price in the cart page")
    public String getPrice(String product){
        return driver.findElement(By.xpath(String.format(CART_PRICE, product))).getText();
    }

    @Step("Getting quantity in the cart page")
    public String getQuantity(String product){
        return driver.findElement(By.xpath(String.format(CART_QUANTITY, product))).getText();
    }
}