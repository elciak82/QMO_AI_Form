package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoqaFormPage;

public class DemoqaFormPageTests extends BaseTest {

    @Test
    public void fillFirstnameFieldTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        DemoqaFormPage demoqaFormPage = new DemoqaFormPage(driver);

        demoqaFormPage.fillFirstNameField("userNameTest");
        Thread.sleep(2000);

    }

    @Test
    public void fillLastnameFieldTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        DemoqaFormPage demoqaFormPage = new DemoqaFormPage(driver);

        demoqaFormPage.fillLastNameField("userLastNameTest");
        Thread.sleep(2000);

    }

    @Test
    public void fillUserEmailFieldTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        DemoqaFormPage demoqaFormPage = new DemoqaFormPage(driver);

        demoqaFormPage.fillUserEmailField("userEmailTest");
        Thread.sleep(2000);

    }

    @Test
    public void clickOnGenderRadioButtonsTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        DemoqaFormPage demoqaFormPage = new DemoqaFormPage(driver);
        demoqaFormPage.clickGenderRadiobutton();
        Thread.sleep(2000);

    }

    @Test
    public void fillUserNumberFieldTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        DemoqaFormPage demoqaFormPage = new DemoqaFormPage(driver);
        demoqaFormPage.fillUserNumberField("123456789");
        Thread.sleep(2000);

    }

    @Test
    public void fillDateOfBirthInputFieldTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        DemoqaFormPage demoqaFormPage = new DemoqaFormPage(driver);
        demoqaFormPage.fillDateOfBirthField();
        Thread.sleep(2000);

    }

    @Test
    public void fillSubjectFieldTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        DemoqaFormPage demoqaFormPage = new DemoqaFormPage(driver);
        demoqaFormPage.fillSubjectsInputField("Subject test");
        Thread.sleep(2000);

    }

    @Test
    public void clickOnHobbiesCheckboxesTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        DemoqaFormPage demoqaFormPage = new DemoqaFormPage(driver);
        demoqaFormPage.clickHobbiesCheckboxes();
        Thread.sleep(2000);

    }

    @Test
    public void clickUploadPictureTest() throws InterruptedException { //nie dziala
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        DemoqaFormPage demoqaFormPage = new DemoqaFormPage(driver);
        demoqaFormPage.clickUploadPictureButton();
        Thread.sleep(5000);

    }

    @Test
    public void fillCurrentAddressTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        DemoqaFormPage demoqaFormPage = new DemoqaFormPage(driver);
        demoqaFormPage.fillCurrentAddressField("Address");
        Thread.sleep(2000);

    }

    @Test
    public void fillStateTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        DemoqaFormPage demoqaFormPage = new DemoqaFormPage(driver);
        demoqaFormPage.fillStateField("State");
        Thread.sleep(2000);

    }

    @Test
    public void fillCityTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        DemoqaFormPage demoqaFormPage = new DemoqaFormPage(driver);
        demoqaFormPage.fillCityField("City");
        Thread.sleep(2000);

    }




}
