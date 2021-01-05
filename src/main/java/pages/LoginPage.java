package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    @FindBy(id = "user-name")
    WebElement usernameInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(id = "login-button")
    WebElement loginButton;
    @FindBy(className = "product_label")
    WebElement productLabel;
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @Override
    public void isPageOpened() {
        wait.until(ExpectedConditions.visibilityOf(productLabel));
    }
    public ProductsPage login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
        return new ProductsPage(driver);
    }
    public void openPage() {
        driver.get(SAUCE_DEMO_URL);
    }
    public String getURL() {
        return driver.getCurrentUrl();
    }
}