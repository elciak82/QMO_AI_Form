package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoqaLoginPage;

public class LoginPageTests extends BaseTest {

    @Test
    public void fillUsernameFieldTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        DemoqaLoginPage demoqaLoginPage = new DemoqaLoginPage(driver);

        demoqaLoginPage.fillUserNameField("userNameTest");
        Thread.sleep(3000);

    }

    @Test
    public void fillUPasswordFieldTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        DemoqaLoginPage demoqaLoginPage = new DemoqaLoginPage(driver);

        demoqaLoginPage.fillPasswordField("passwordTest");
        Thread.sleep(3000);

    }

    @Test
    public void loginButtonTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        DemoqaLoginPage demoqaLoginPage = new DemoqaLoginPage(driver);

        demoqaLoginPage.clickLoginButton();
        Thread.sleep(3000);

    }

    @Test
    public void newUserButtonTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        DemoqaLoginPage demoqaLoginPage = new DemoqaLoginPage(driver);

        demoqaLoginPage.clickNewUserButton();
        Thread.sleep(3000);

    }


}
