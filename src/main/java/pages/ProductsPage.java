package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {
    @FindBy(xpath = "//*[@value='lohi']")
    WebElement productSortPanelLowHigh;
    @FindBy(xpath = "//*[@value='hilo']")
    WebElement productSortPanelHighLow;
    @FindBy(xpath = "//*[@value='za']")
    WebElement productSortPanelZA;
    @FindBy(xpath = "//*[@value='az']")
    WebElement productSortPanelAZ;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/div/button")
    WebElement buttonSideBar;
    @FindBy(id = "inventory_sidebar_link")
    WebElement allItemSideBar;
    @FindBy(id = "about_sidebar_link")
    WebElement aboutSideBar;
    @FindBy(id = "logout_sidebar_link")
    WebElement logoutSideBar;
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    void isPageOpened() {

    }
    public void openPage(){
        driver.get(PRODUCTS_URL);
    }

    public void addProductToCart(String productName) {
        driver.findElement(By.xpath(String.format(ADD_PRODUCT_TO_CART, productName))).click();
    }

    public void changeSortLowHigh() {
        productSortPanelLowHigh.click();
    }

    public void changeSortHighLow() {
        productSortPanelHighLow.click();
    }

    public void changeSortZ_A() {
        productSortPanelZA.click();
    }

    public void changeSortA_Z() {
        productSortPanelAZ.click();
    }

    public String checkingFirstProduct() {
        return driver.findElements(By.xpath(PRODUCTS_ELEMENTS)).get(0).getText();
    }

    public String checkingLastProduct() {
        return driver.findElements(By.xpath(PRODUCTS_ELEMENTS)).get(5).getText();
    }
    public ProductsPage clickSideBar(){
        buttonSideBar.click();
        return this;
    }
    public void clickAllItemFromSideBar(){
        allItemSideBar.click();
    }
    public void clickAboutFromSideBar(){
        aboutSideBar.click();
    }
    public void clickLogoutFromSideBar(){
        logoutSideBar.click();
    }
    public String getActualURL(){
        return driver.getCurrentUrl();
    }
}