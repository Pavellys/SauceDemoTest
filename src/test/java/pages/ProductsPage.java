package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{

    public ProductsPage(WebDriver driver){
        super(driver);
    }

    public static final String ADD_PRODUCT_TO_CART = "//*[text() = '%s']/ancestor::*[@class='inventory_item']//button\n";
    public static final String PRODUCTS_ELEMENTS = "//*[@class='inventory_item_name']";
    public static final String PRODUCT_SORT_PANEL_LOW_HIGH = "//*[@value='lohi']";
    public static final String PRODUCT_SORT_PANEL_HIGH_LOW = "//*[@value='hilo']";
    public static final String PRODUCT_SORT_PANEL_Z_A = "//*[@value='za']";
    public static final String PRODUCT_SORT_PANEL_A_Z = "//*[@value='az']";

    public void addProductToCart(String productName){
        driver.findElement(By.xpath(String.format(ADD_PRODUCT_TO_CART, productName))).click();

    }
    public void changeSortLowHigh(){
        driver.findElement(By.xpath(PRODUCT_SORT_PANEL_LOW_HIGH)).click();
    }
    public void changeSortHighLow(){
        driver.findElement(By.xpath(PRODUCT_SORT_PANEL_HIGH_LOW)).click();
    }
    public void changeSortZ_A(){
        driver.findElement(By.xpath(PRODUCT_SORT_PANEL_Z_A)).click();
    }
    public void changeSortA_Z(){
        driver.findElement(By.xpath(PRODUCT_SORT_PANEL_A_Z)).click();
    }
    public String checkingFirstProduct(){
        String firstProduct = driver.findElements(By.xpath(PRODUCTS_ELEMENTS)).get(0).getText();
        return firstProduct;
    }
    public String checkingLastProduct(){
       String lastProduct =  driver.findElements(By.xpath(PRODUCTS_ELEMENTS)).get(5).getText();
       return lastProduct;
    }
}























