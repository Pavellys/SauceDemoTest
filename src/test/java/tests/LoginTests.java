package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
public class LoginTests extends BaseTest{
    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.login(USERNAME, PASSWORD);
        loginPage.isPageOpened();
        Assert.assertEquals(loginPage.getURL(), PRODUCTS_URL, "error");
    }
}