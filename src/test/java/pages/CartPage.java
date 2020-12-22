package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    public final String BUTTON_CHECKOUT = "//*[@class='btn_action checkout_button']";
    public final String BUTTON_CONTINUE_SHOPPING = "//*[@class='btn_secondary']";

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get("https://www.saucedemo.com/cart.html");
    }

    public String getQuantity() {
        return driver.findElement(By.xpath("//*[@class='cart_quantity']")).getText();
    }

    public String getPrice() {
        return driver.findElement(By.xpath("//*[@class='inventory_item_price']")).getText();
    }

    public void clickToCheckoutButton(String path) {
        driver.findElement(By.xpath(path)).click();
    }
}
