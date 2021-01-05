package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {
    @FindBy(xpath = "//*[@class='btn_action checkout_button']")
    WebElement buttonCheckout;
    @FindBy(xpath = "//*[@class='btn_secondary']")
    WebElement buttonContinueShopping;
    @FindBy(xpath = "//*[text() = 'Sauce Labs Fleece Jacket']/ancestor::*[@class='cart_item']//*[@class='inventory_item_price']")
    WebElement productPrice;
    @FindBy(xpath = "//*[text() = 'Sauce Labs Fleece Jacket']/ancestor::*[@class='cart_item']//*[@class='cart_quantity']")
    WebElement productQuantity;
    @FindBy(className = "subheader")
    WebElement checkOutWait;
    @FindBy(className = "product_label")
    WebElement continueWait;
    public CartPage(WebDriver driver) {
        super(driver);
    }


    public void isPageOpenedContinue() {
        wait.until(ExpectedConditions.visibilityOf(continueWait)).isDisplayed();
    }

    @Override
    public void isPageOpened() {
        wait.until(ExpectedConditions.visibilityOf(checkOutWait)).isDisplayed();
    }
    public void openPage() {
        driver.get(CART_URL);
    }

    public void clickToCheckoutButton() {
        buttonCheckout.click();
    }
    public void clickToContinueButton(){
        buttonContinueShopping.click();
    }
    public String getURL() {
        return driver.getCurrentUrl();
    }
    public String getPrice(){
        return productPrice.getText();
    }
    public String getQuantity(){
        return productQuantity.getText();
    }
}