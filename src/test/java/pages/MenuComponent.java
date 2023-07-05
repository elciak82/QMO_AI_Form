package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuComponent extends GenericPage {
    public MenuComponent(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div.header-text > span")
    WebElement elements;

    @FindBy(xpath = "//div[@class=\"header-text\"]/span")
    WebElement elementsXpath;


    @Step("Check the username Field")
    public void clickOnElements() {
        elements.click(); //expand
        System.out.println("Click on the Elements (css) works - expand.");
        elements.click(); //collapse
        System.out.println("Click on the Elements (xpath) works - collapse.");

        elementsXpath.click(); //expand
        System.out.println("Click on the Elements (css) works - expand.");
        elementsXpath.click(); //collapse
        System.out.println("Click on the Elements (xpath) works - collapse.");
    }
}