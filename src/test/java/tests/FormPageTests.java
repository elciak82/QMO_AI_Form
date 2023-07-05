package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoqaFormPage;

public class FormPageTests extends BaseTest {

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
    public void fillGenderRadioButtonsTest() throws InterruptedException {
        String title = menuComponent.getPageTitle();
        Assert.assertEquals(title, "DEMOQA");

        DemoqaFormPage demoqaFormPage = new DemoqaFormPage(driver);
        Thread.sleep(2000);
        demoqaFormPage.clickGenderRadiobutton();
        Thread.sleep(2000);

    }




}
