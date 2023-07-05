package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaFormPage extends GenericPage {

    public DemoqaFormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#firstName")
    WebElement firstName;

//    @FindBy(xpath = "//input[@placeholder=\"UserName\"]")
//    WebElement userNameXpath;

    @FindBy(css = "#lastName")
    WebElement lastName;

//    @FindBy(xpath = "//*[@id=\"password\"]")
//    WebElement passwordXpath;

    @FindBy(css = "#userEmail")
    WebElement userEmail;

//    @FindBy(xpath = "//button[text()=\"Login\"]")
//    WebElement loginXpath;

    @FindBy(css = "label[for='gender-radio-1']")
    WebElement male;

//    @FindBy(xpath = "#gender-radio-1")
//    WebElement maleXpath;

    @FindBy(css = "label[for='gender-radio-2']")
    WebElement female;

//    @FindBy(xpath = "#gender-radio-2")
//    WebElement femaleXpath;

    @FindBy(css = "label[for='gender-radio-3']")
    WebElement other;

//    @FindBy(xpath = "#gender-radio-2")
//    WebElement otherXpath;

    @FindBy(css = "#userNumber")
    WebElement userNumber;

//    @FindBy(xpath = "#userNumber")
//    WebElement userNumberXpath;

    @FindBy(css = "#dateOfBirthInput")
    WebElement dateOfBirthInput;

//    @FindBy(xpath = "#userNumber")
//    WebElement dateOfBirthInputXpath;

    @FindBy(css = "#subjectsInput")
    WebElement subjectsInput;

//    @FindBy(xpath = "#userNumber")
//    WebElement subjectsInputXpath;

    public void fillFirstNameField(String text) {
        firstName.sendKeys(text);
        System.out.println(text + " is set for firstName field (css).");
        firstName.clear();
//
//        userNameXpath.sendKeys(name);
//        System.out.println("Test: " + name + " is set for userName field (xpath).");
//        userNameXpath.clear();
    }

    public void fillLastNameField(String text) {
        lastName.sendKeys(text);
        System.out.println(text + " is set for lastname field (css).");
        lastName.clear();

//        passwordXpath.sendKeys(name);
//        System.out.println("Test: " + name + " is set for password field (xpath).");
//        passwordXpath.clear();
    }

    public void fillUserEmailField(String text) {
        userEmail.sendKeys(text);
        System.out.println(text + " is set for userEmail field (css).");
        userEmail.clear();
//
//        userEmail.click();
//        System.out.println("Click on login button (xpath) works.");

    }

    public void clickGenderRadiobutton() {
        male.click();
        System.out.println("Click on male radiobutton (css) works.");

        female.click();
        System.out.println("Click on female radiobutton (css) works.");

        other.click();
        System.out.println("Click on other radiobutton (css) works.");

//        male.click();
//        System.out.println("Click on male radiobutton (css) works.");
//
//        female.click();
//        System.out.println("Click on female radiobutton (css) works.");
//
//        other.click();
//        System.out.println("Click on other radiobutton (css) works.");
    }

    public void fillUserNumberField(String text) {
        userNumber.sendKeys(text);
        System.out.println(text + " is set for userNumber field (css).");
        firstName.clear();
//
//        userNameXpath.sendKeys(name);
//        System.out.println("Test: " + name + " is set for userName field (xpath).");
//        userNameXpath.clear();
    }

    public void fillDateOfBirthField(String text) {
        dateOfBirthInput.sendKeys(text);
        System.out.println(text + " is set for dateOfBirthInput field (css).");
        dateOfBirthInput.clear();
//
//        userNameXpath.sendKeys(name);
//        System.out.println("Test: " + name + " is set for dateOfBirthInput field (xpath).");
//        userNameXpath.clear();
    }

    public void fillSubjectsInputField(String text) {
        subjectsInput.sendKeys(text);
        System.out.println(text + " is set for subjectsInput field (css).");
        subjectsInput.clear();
//
//        userNameXpath.sendKeys(name);
//        System.out.println("Test: " + name + " is set for dateOfBirthInput field (xpath).");
//        userNameXpath.clear();
    }
}
