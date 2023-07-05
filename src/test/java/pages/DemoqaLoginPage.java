package pages;

import helpers.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaLoginPage extends Header {

    public DemoqaLoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#userName")
    WebElement userName;

    @FindBy(xpath = "//input[@placeholder=\"UserName\"]")
    WebElement userNameXpath;

    @FindBy(css = "input[placeholder=\"Password\"]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"password\"]") //does not work
    WebElement passwordXpath;

    @FindBy(css = "#login")
    WebElement login;

    @FindBy(xpath = "//button[text()=\"Login\"]")
    WebElement loginXpath;


    @FindBy(css = ".buttonWrap > .button:last-child > .btn")
    WebElement newUser;

    @FindBy(xpath = "//button[@id=\"newUser\"]")
    WebElement newUserXpath;

    @Step("Check the username Field")
    public void fillUserNameField(String name) {
        userName.sendKeys(name);
        userName.clear();

        userNameXpath.sendKeys(name);
        userNameXpath.clear();
    }

    @Step("Check the password Field")
    public void fillPasswordField(String name) {
        password.sendKeys(name);
        password.clear();

        passwordXpath.sendKeys(name);
        passwordXpath.clear();
    }

    @Step("Check the login button")
    public void clickLoginButton() {
        login.click();
        driver.navigate().refresh();
        loginXpath.click();

    }

    @Step("Check the new user button")
    public void clickNewUserButton() {
        newUser.click();
        driver.navigate().back();
        newUserXpath.click();

    }
}
