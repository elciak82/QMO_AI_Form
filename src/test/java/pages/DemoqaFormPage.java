package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstNameXpath;

    @FindBy(css = "#lastName")
    WebElement lastName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastNameXpath;

    @FindBy(css = "#userEmail")
    WebElement userEmail;

    @FindBy(xpath = "//input[@placeholder='name@example.com']")
    WebElement userEmailXpath;

    @FindBy(css = "label[for='gender-radio-1']")
    WebElement male;

    @FindBy(xpath = "//input[@value='Male']/following-sibling::label")
    WebElement maleXpath;

    @FindBy(css = "label[for='gender-radio-2']")
    WebElement female;

    @FindBy(xpath = "//input[@value='Female']/following-sibling::label")
    WebElement femaleXpath;

    @FindBy(css = "label[for='gender-radio-3']")
    WebElement other;

    @FindBy(xpath = "//input[@value='Other']/following-sibling::label")
    WebElement otherXpath;

    @FindBy(css = "#userNumber")
    WebElement userNumber;

    @FindBy(xpath = "//input[@placeholder='Mobile Number']")
    WebElement userNumberXpath;

    @FindBy(css = "#dateOfBirthInput")
    WebElement dateOfBirthInput;

    @FindBy(xpath = "//input[@class='form-control']")
    WebElement dateOfBirthInputXpath;

    @FindBy(css = "#subjectsInput")
    WebElement subjectsInput;

    @FindBy(xpath = "//input[@type='text' and @tabindex='0']")
    WebElement subjectsInputXpath;

    @FindBy(css = ".custom-control.custom-checkbox.custom-control-inline:nth-child(1) label")
    WebElement sports;

    @FindBy(xpath = "//div[@class='custom-control custom-checkbox custom-control-inline']/label[@for='hobbies-checkbox-1']")
    WebElement sportsXpath;

    @FindBy(css = ".custom-control.custom-checkbox.custom-control-inline:nth-child(2) label")
    WebElement reading;

    @FindBy(xpath = "//div[@class='custom-control custom-checkbox custom-control-inline']/label[@for='hobbies-checkbox-2']")
    WebElement readingXpath;

    @FindBy(css = ".custom-control.custom-checkbox.custom-control-inline:nth-child(3) label")
    WebElement music;

    @FindBy(xpath = "//div[@class='custom-control custom-checkbox custom-control-inline']/label[@for='hobbies-checkbox-3']")
    WebElement musicXpath;

    @FindBy(css = "#uploadPicture")
//    @FindBy(css = "[type='file']")
    WebElement uploadPicture;

    @FindBy(xpath = "//div[@class='form-file']/input[@type='file']")
    WebElement uploadPictureXpath;

    @FindBy(css = "#currentAddress")
    WebElement currentAddress;

    @FindBy(xpath = "//div[@id='currentAddress-wrapper']/div[@class='col-md-9 col-sm-12']/textarea")
    WebElement currentAddressXpath;

    @FindBy(css = "#react-select-3-input")
    WebElement state;

    @FindBy(xpath = "//div[@id='state']//input")
    WebElement stateXpath;

    @FindBy(css = "#react-select-4-input")
    WebElement city;

    @FindBy(xpath = "//div[@id='city']//input")
    WebElement cityXpath;

    @FindBy(css = "button#submit")
    WebElement submit;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitXpath;

    public void fillFirstNameField(String text) {
        firstName.sendKeys(text);
        System.out.println(text + " is set for firstName field (css).");
        firstName.clear();

        firstNameXpath.sendKeys(text);
        System.out.println(text + " is set for firstName field (xpath).");
        firstNameXpath.clear();
    }

    public void fillLastNameField(String text) {
        lastName.sendKeys(text);
        System.out.println(text + " is set for lastname field (css).");
        lastName.clear();

        lastNameXpath.sendKeys(text);
        System.out.println(text + " is set for lastname field (xpath).");
        lastNameXpath.clear();
    }

    public void fillUserEmailField(String text) {
        userEmail.sendKeys(text);
        System.out.println(text + " is set for userEmail field (css).");
        userEmail.clear();

        userEmailXpath.sendKeys(text);
        System.out.println(text + " is set for userEmail field (xpath).");
        userEmailXpath.clear();

    }

    public void clickGenderRadiobutton() {
        male.click();
        System.out.println("Click on male radiobutton (css) works.");

        female.click();
        System.out.println("Click on female radiobutton (css) works.");

        other.click();
        System.out.println("Click on other radiobutton (css) works.");

        maleXpath.click();
        System.out.println("Click on male radiobutton (xpath) works.");

        femaleXpath.click();
        System.out.println("Click on female radiobutton (xpath) works.");

        otherXpath.click();
        System.out.println("Click on other radiobutton (xpath) works.");
    }

    public void fillUserNumberField(String text) {
        userNumber.sendKeys(text);
        System.out.println(text + " is set for userNumber field (css).");
        userNumber.clear();

        userNumberXpath.sendKeys(text);
        System.out.println(text + " is set for userNumber field (xpath).");
        userNumberXpath.clear();
    }

    public void fillDateOfBirthField() {
        dateOfBirthInput.click();
        System.out.println("Click on other dateOfBirthInput (css) works.");
        userNumber.click();

        dateOfBirthInputXpath.click();
        System.out.println("Click on other dateOfBirthInput (xpath) works.");
    }

    public void fillSubjectsInputField(String text) {
        subjectsInput.sendKeys(text);
        System.out.println(text + " is set for subjectsInput field (css).");
        subjectsInput.clear();

        subjectsInputXpath.sendKeys(text);
        System.out.println(text + " is set for subjectsInput field (xpath).");
        subjectsInputXpath.clear();
    }

    public void clickHobbiesCheckboxes() {
        sports.click();
        System.out.println("Click on sports checkbox (css) works.");

        reading.click();
        System.out.println("Click on reading checkbox (css) works.");

        music.click();
        System.out.println("Click on music checkbox (css) works.");

        sportsXpath.click();
        System.out.println("Click on male checkbox (xpath) works.");

        readingXpath.click();
        System.out.println("Click on female checkbox (xpath) works.");

        musicXpath.click();
        System.out.println("Click on other checkbox (xpath) works.");
    }

    public void uploadPictureButtonIsDisplayed () {
        uploadPicture.isDisplayed();
        System.out.println("Button uploadPicture (css) is displayed.");

        uploadPictureXpath.isDisplayed();
        System.out.println("Button uploadPicture (xpath) is displayed.");

    }

    public void fillCurrentAddressField(String text) {
        currentAddress.sendKeys(text);
        System.out.println(text + " is set for currentAddress field (css).");
        currentAddress.clear();

        currentAddressXpath.sendKeys(text);
        System.out.println(text + " is set for currentAddress field (xpath).");
        currentAddressXpath.clear();
    }

    public void fillStateField(String text) {
        state.sendKeys(text);
        System.out.println(text + " is set for state field (css).");
        state.clear();

        stateXpath.sendKeys(text);
        System.out.println(text + " is set for state field (xpath).");
        stateXpath.clear();
    }

    public void fillCityField(String text) {
        state.sendKeys("ncr");
        state.sendKeys(Keys.ENTER);
        city.sendKeys(text);
        System.out.println(text + " is set for city field (css).");
        city.clear();

        stateXpath.sendKeys("ncr");
        stateXpath.sendKeys(Keys.ENTER);
        cityXpath.sendKeys(text);
        System.out.println(text + " is set for city field (xpath).");
        cityXpath.clear();
    }

    public void clickOnSubmitButton() throws InterruptedException {
        submit.click();
        System.out.println("Click on submit button (css) works.");
        driver.navigate().refresh();

        submitXpath.click();
        System.out.println("Click on submit button (xpath) works.");
        driver.navigate().refresh();
    }
}
