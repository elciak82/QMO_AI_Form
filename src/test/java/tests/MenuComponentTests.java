package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoqaLoginPage;
import pages.MenuComponent;

public class MenuComponentTests extends BaseTest {

    @Test
    public void elementsTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        MenuComponent menuComponent = new MenuComponent(driver);

        menuComponent.clickOnElements();
        Thread.sleep(3000);

    }



}
