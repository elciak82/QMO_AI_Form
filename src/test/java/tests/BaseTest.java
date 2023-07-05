package tests;

import helpers.Configuration;
import helpers.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.MenuComponent;


public class BaseTest {
    public WebDriver driver;
    public MenuComponent menuComponent;
    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void setUp() {
        driver = Driver.initializeWebDriver();
        driver.get(Configuration.getConfiguration().getSiteURL());
        menuComponent = new MenuComponent(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

