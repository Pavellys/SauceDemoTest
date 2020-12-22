package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest{
    @Test
    public void loginTest(){
        loginPage.openPage();
        loginPage.login(loginPage.USERNAME, loginPage.PASSWORD);
        Assert.assertEquals(loginPage.getURL(), "https://www.saucedemo.com/inventory.html", "error");
    }
}
