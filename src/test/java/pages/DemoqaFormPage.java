package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.image.Kernel;

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

    @FindBy(css = ".custom-control.custom-checkbox.custom-control-inline:nth-child(1) label")
    WebElement sports;

//    @FindBy(xpath = "#gender-radio-1")
//    WebElement maleXpath;

    @FindBy(css = ".custom-control.custom-checkbox.custom-control-inline:nth-child(2) label")
    WebElement reading;

//    @FindBy(xpath = "#gender-radio-2")
//    WebElement femaleXpath;

    @FindBy(css = ".custom-control.custom-checkbox.custom-control-inline:nth-child(3) label")
    WebElement music;

//    @FindBy(xpath = "#gender-radio-2")
//    WebElement otherXpath;

//    @FindBy(css = "#uploadPicture")
    @FindBy(css = "[type='file']")
    WebElement uploadPicture;

//    @FindBy(xpath = "#userNumber")
//    WebElement userNumberXpath;

    @FindBy(css = "#currentAddress")
    WebElement currentAddress;

//    @FindBy(xpath = "#userNumber")
//    WebElement dateOfBirthInputXpath;

    @FindBy(css = "#react-select-3-input")
    WebElement state;

//    @FindBy(xpath = "#userNumber")
//    WebElement subjectsInputXpath;

    @FindBy(css = "#react-select-4-input")
    WebElement city;

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
        userNumber.clear();
//
//        userNameXpath.sendKeys(name);
//        System.out.println("Test: " + name + " is set for userName field (xpath).");
//        userNameXpath.clear();
    }

    public void fillDateOfBirthField() {
        dateOfBirthInput.click();
        System.out.println("Click on other dateOfBirthInput (css) works.");
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

    public void clickHobbiesCheckboxes() {
        sports.click();
        System.out.println("Click on sports checkbox (css) works.");

        reading.click();
        System.out.println("Click on reading checkbox (css) works.");

        music.click();
        System.out.println("Click on music checkbox (css) works.");

//        male.click();
//        System.out.println("Click on male radiobutton (css) works.");
//
//        female.click();
//        System.out.println("Click on female radiobutton (css) works.");
//
//        other.click();
//        System.out.println("Click on other radiobutton (css) works.");
    }

    public void clickUploadPictureButton () {
        uploadPicture.isDisplayed();
        System.out.println("Button uploadPicture (css) is displayed.");

    }

    public void fillCurrentAddressField(String text) {
        currentAddress.sendKeys(text);
        System.out.println(text + " is set for currentAddress field (css).");
        currentAddress.clear();
//
//        userNameXpath.sendKeys(name);
//        System.out.println("Test: " + name + " is set for dateOfBirthInput field (xpath).");
//        userNameXpath.clear();
    }

    public void fillStateField(String text) {
        state.sendKeys(text);
        System.out.println(text + " is set for state field (css).");
        state.clear();
//
//        userNameXpath.sendKeys(name);
//        System.out.println("Test: " + name + " is set for dateOfBirthInput field (xpath).");
//        userNameXpath.clear();
    }

    public void fillCityField(String text) {
        state.sendKeys("ncr");
        state.sendKeys(Keys.ENTER);
        city.sendKeys(text);
        System.out.println(text + " is set for city field (css).");
        city.clear();
//
//        userNameXpath.sendKeys(name);
//        System.out.println("Test: " + name + " is set for dateOfBirthInput field (xpath).");
//        userNameXpath.clear();
    }
}
