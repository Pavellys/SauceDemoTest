import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class SauceDemoTesting {
    WebDriver driver;
    String property = "webdriver.chrome.driver";
    String getProperty = "src\\test\\resources\\chromedriver.exe";
    String sauceDemoURL = "https://www.saucedemo.com/index.html";
    String logIn = "standard_user";
    String password = "secret_sauce";
    String expectedResultLogIn = "https://www.saucedemo.com/inventory.html";

    @BeforeMethod
    public void initTest(){
        System.setProperty(property, getProperty);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(sauceDemoURL);
        driver.findElement(By.id("user-name")).sendKeys(logIn);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

    }
    @Test
    public void sauceDemoLogIn(){
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, expectedResultLogIn, "Do not match URL");
        driver.quit();
    }
    @Test
    public void firstElementCatalogURL(){
        String expectedURL = "https://www.saucedemo.com/inventory-item.html?id=0";
        driver.findElement(By.id("item_0_title_link")).click();
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "URL does not match");
    }
    @Test
    public void firstElementCatalogName(){
        String expectedElementName = "Sauce Labs Bike Light";
        driver.findElement(By.id("item_0_title_link")).click();
        String actualElementName = driver.findElement(By.xpath("//*[@class='inventory_details_name']")).getText();
        Assert.assertEquals(actualElementName, expectedElementName, "Name does not match");
        System.out.println(actualElementName);

    }
    @Test
    public void secondElementCatalogURl(){
        String expectedURL = "https://www.saucedemo.com/inventory-item.html?id=1";
        driver.findElement(By.id("item_1_title_link")).click();
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "URL does not match");

    }
    @Test
    public void secondElementCatalogName(){
        String expectedElementName = "Sauce Labs Bolt T-Shirt";
        driver.findElement(By.id("item_1_title_link")).click();
        String actualElementName = driver.findElement(By.xpath("//*[@class='inventory_details_name']")).getText();
        Assert.assertEquals(actualElementName, expectedElementName, "Name does not match");
        System.out.println(actualElementName);

    }
    @Test
    public void lokk(){
        driver.findElement(By.xpath("//*[@value='lohi']")).click();
    }
    @AfterMethod
    public void quitTest(){
        //driver.quit();
    }
}
