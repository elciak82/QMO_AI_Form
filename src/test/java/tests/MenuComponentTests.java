package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MenuComponent;

public class MenuComponentTests extends BaseTest {

    @Test
    public void elementsTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        MenuComponent menuComponent = new MenuComponent(driver);

        menuComponent.clickOnElements();
        Thread.sleep(2000);

    }

    @Test
    public void formsTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        MenuComponent menuComponent = new MenuComponent(driver);

        menuComponent.clickOnForms();
        Thread.sleep(2000);

    }

    @Test
    public void alertsTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        MenuComponent menuComponent = new MenuComponent(driver);

        menuComponent.clickOnAlerts();
        Thread.sleep(2000);

    }

    @Test
    public void widgetsTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        MenuComponent menuComponent = new MenuComponent(driver);

        menuComponent.clickOnWidgets();
        Thread.sleep(2000);

    }

    @Test
    public void interactionsTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        MenuComponent menuComponent = new MenuComponent(driver);

        menuComponent.clickOnInteractions();
        Thread.sleep(2000);

    }

    @Test
    public void bookTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        MenuComponent menuComponent = new MenuComponent(driver);

        menuComponent.clickOnBook();
        Thread.sleep(2000);

    }


}
