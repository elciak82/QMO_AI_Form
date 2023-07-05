package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuComponent extends GenericPage {
    public MenuComponent(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".element-group:nth-child(1) .header-text")
    WebElement elements;

    @FindBy(xpath = "//div[contains(@class, 'header-text') and contains(text(), 'Elements')]")
    WebElement elementsXpath;

    @FindBy(css = ".element-group:nth-child(2) .header-text")
    WebElement forms;

    @FindBy(xpath = "//div[contains(@class, 'header-text') and contains(text(), 'Forms')]")
    WebElement formsXpath;

    @FindBy(css = ".element-group:nth-child(3) .header-text")
    WebElement alerts;

    @FindBy(xpath = "//div[contains(@class, 'header-text') and contains(text(), 'Alerts, Frame & Windows')]")
    WebElement alertsXpath;

    @FindBy(css = ".element-group:nth-child(4) .header-text")
    WebElement widgets;

    @FindBy(xpath = "//div[contains(@class, 'header-text') and contains(text(), 'Widgets')]")
    WebElement widgetsXpath;

    @FindBy(css = ".element-group:nth-child(5) .header-text")
    WebElement interactions;

    @FindBy(xpath = "//div[contains(@class, 'header-text') and contains(text(), 'Interactions')]")
    WebElement interactionsXpath;

    @FindBy(css = ".element-group:nth-child(6) .header-text")
    WebElement book;

    @FindBy(xpath = "//div[contains(@class, 'header-text') and contains(text(), 'Book Store Application')]")
    WebElement bookXpath;


    public void clickOnElements() throws InterruptedException {
        elements.click(); //expand
        System.out.println("Click on the Elements (css) works - expand.");
        elements.click(); //collapse
        System.out.println("Click on the Elements (css) works - collapse.");

        Thread.sleep(1000);

        elementsXpath.click(); //expand
        System.out.println("Click on the Elements (xpath) works - expand.");
        elementsXpath.click(); //collapse
        System.out.println("Click on the Elements (xpath) works - collapse.");
    }

    public void clickOnForms() throws InterruptedException {
        forms.click(); //expand
        System.out.println("Click on the Forms (css) works - expand.");
        forms.click(); //collapse
        System.out.println("Click on the Forms (css) works - collapse.");

        Thread.sleep(1000);

        formsXpath.click(); //expand
        System.out.println("Click on the Forms (xpath) works - expand.");
        formsXpath.click(); //collapse
        System.out.println("Click on the Forms (xpath) works - collapse.");
    }

    public void clickOnAlerts() throws InterruptedException {
        alerts.click(); //expand
        System.out.println("Click on the Alerts (css) works - expand.");
        alerts.click(); //collapse
        System.out.println("Click on the Alerts (css) works - collapse.");

        Thread.sleep(1000);

        alertsXpath.click(); //expand
        System.out.println("Click on the Alerts (xpath) works - expand.");
        alertsXpath.click(); //collapse
        System.out.println("Click on the Alerts (xpath) works - collapse.");
    }

    public void clickOnWidgets() throws InterruptedException {
        widgets.click(); //expand
        System.out.println("Click on the Widgets (css) works - expand.");
        widgets.click(); //collapse
        System.out.println("Click on the Widgets (css) works - collapse.");

        Thread.sleep(1000);

        widgetsXpath.click(); //expand
        System.out.println("Click on the Widgets (xpath) works - expand.");
        widgetsXpath.click(); //collapse
        System.out.println("Click on the Widgets (xpath) works - collapse.");
    }

    public void clickOnInteractions() throws InterruptedException {
        interactions.click(); //expand
        System.out.println("Click on the Interactions (css) works - expand.");
        interactions.click(); //collapse
        System.out.println("Click on the Interactions (css) works - collapse.");

        Thread.sleep(1000);

        interactionsXpath.click(); //expand
        System.out.println("Click on the Interactions (xpath) works - expand.");
        interactionsXpath.click(); //collapse
        System.out.println("Click on the Interactions (xpath) works - collapse.");
    }

    public void clickOnBook() throws InterruptedException {
        book.click(); //expand
        System.out.println("Click on the Book (css) works - expand.");
        book.click(); //collapse
        System.out.println("Click on the Book (css) works - collapse.");

        Thread.sleep(1000);

        bookXpath.click(); //expand
        System.out.println("Click on the Book (xpath) works - expand.");
        bookXpath.click(); //collapse
        System.out.println("Click on the Book (xpath) works - collapse.");
    }
}