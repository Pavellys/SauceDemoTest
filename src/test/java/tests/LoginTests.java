package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginTests extends BaseTest{

    @Test
    public void loginTest(){
        loginPage.openPage()
                .login(USERNAME, PASSWORD);
        loginPage.isPageOpened();
        Assert.assertEquals(loginPage.getURL(), PRODUCTS_URL, "error");
    }
}