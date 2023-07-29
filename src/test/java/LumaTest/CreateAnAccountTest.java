package LumaTest;

import com.github.javafaker.Faker;
import org.example.enums.LumaCreateAnAccountCredentials;
import org.example.lumaProject.models.Users;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.enums.LumaCreateAnAccountCredentials.*;
import static org.testng.AssertJUnit.assertEquals;

public class CreateAnAccountTest extends BaseTest {
    Faker faker = new Faker();
    Users user = Users.builder().userFirstName(userName.getCredential()).userLastName(lastName.getCredential()).userEmail(userEmail.getCredential()).userPassword(userPassword.getCredential()).userPassword(confirmationPassword.getCredential()).build();
    Users user1 = Users.builder().userFirstName("Aigerim").userLastName(lastName.getCredential()).userEmail(userEmail.getCredential()).userPassword(userPassword.getCredential()).userPassword(confirmationPassword.getCredential()).build();

    @Test(description = "Create an account with valid credentials")
    void createAnAccountTest() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        lumaPage.clickCreateAnAccountBtn();
        lumaPage.enterFirstName(LumaCreateAnAccountCredentials.userName.getCredential());
        lumaPage.enterLastName(lastName.getCredential());
        lumaPage.clickSignUpForNewsletterBtn();
        lumaPage.enterEmail(userEmail.getCredential());
        lumaPage.enterUserPassword(LumaCreateAnAccountCredentials.userPassword.getCredential());
        lumaPage.enterUserPasswordConfirmation(confirmationPassword.getCredential());
        lumaPage.clickCreateBnt();
        Assert.assertEquals(accountConfPage.thankYouForReg.getText(), "Thank you for registering with Main Website Store.");
        Thread.sleep(5000);

    }
//    @Test(description = "Create an account with valid credentials")
//    void createAnAccountTest1() throws InterruptedException {
//        driver.get("https://magento.softwaretestingboard.com/");
//        lumaPage.clickCreateAnAccountBtn();
//        lumaPage.enterFirstName(user1.userFirstName);
//        lumaPage.enterLastName(lastName.getCredential());
//        lumaPage.clickSignUpForNewsletterBtn();
//        lumaPage.enterEmail(userEmail.getCredential());
//        lumaPage.enterUserPassword(LumaLoginCredentials.userPassword.getCredential());
//        lumaPage.enterUserPasswordConfirmation(confirmationPassword.getCredential());
//        lumaPage.clickCreateBnt();
//        Assert.assertEquals(accountConfPage.thankYouForReg.getText(), "Thank you for registering with Main Website Store.");
//        Thread.sleep(5000);


    @Test(description = "Create an account with invalid email")
    void createAnAccountWithInvalidEmail() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        lumaPage.clickCreateAnAccountBtn();
        lumaPage.enterFirstName(LumaCreateAnAccountCredentials.userName.getCredential());
        lumaPage.enterLastName(lastName.getCredential());
        lumaPage.clickSignUpForNewsletterBtn();
        lumaPage.enterEmail(userInvalidEmail.getCredential());
        lumaPage.enterUserPassword(LumaCreateAnAccountCredentials.userPassword.getCredential());
        lumaPage.enterUserPasswordConfirmation(confirmationPassword.getCredential());
        lumaPage.clickCreateBnt();
        Assert.assertEquals(accountConfPage.emailError.getText(), "Please enter a valid email address (Ex: johndoe@domain.com).");
        Thread.sleep(5000);
    }

    @Test(description = "Create an account with invalid password only letters")
    void createAnAccountWithInvalidPasswordOnlyLetters() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        lumaPage.clickCreateAnAccountBtn();
        lumaPage.enterFirstName(LumaCreateAnAccountCredentials.userName.getCredential());
        lumaPage.enterLastName(lastName.getCredential());
        lumaPage.clickSignUpForNewsletterBtn();
        lumaPage.enterEmail(userEmail.getCredential());
        lumaPage.enterUserPassword(userInvalidPasswordLetters.getCredential());
        lumaPage.enterUserPasswordConfirmation(confirmationPassword.getCredential());
        lumaPage.clickCreateBnt();
        Assert.assertEquals(accountConfPage.passwordError.getText(), "Minimum of different classes of characters in password is 3. Classes of characters: Lower Case, Upper Case, Digits, Special Characters.");
        Thread.sleep(5000);


    }

    @Test(description = "Create an account with invalid password only digits")
    void createAnAccountWithInvalidPasswordOnlyDigits() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        lumaPage.clickCreateAnAccountBtn();
        lumaPage.enterFirstName(LumaCreateAnAccountCredentials.userName.getCredential());
        lumaPage.enterLastName(lastName.getCredential());
        lumaPage.clickSignUpForNewsletterBtn();
        lumaPage.enterEmail(userEmail.getCredential());
        lumaPage.enterUserPassword(userInvalidPasswordDigits.getCredential());
        lumaPage.enterUserPasswordConfirmation(confirmationPassword.getCredential());
        lumaPage.clickCreateBnt();
        Assert.assertEquals(accountConfPage.passwordError.getText(), "Minimum of different classes of characters in password is 3. Classes of characters: Lower Case, Upper Case, Digits, Special Characters.");
        Thread.sleep(5000);
    }

    @Test(description = "Create an account with invalid password without UpperCase ")
    void createAnAccountWithInvalidPasswordwithoutUpperCase() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        lumaPage.clickCreateAnAccountBtn();
        lumaPage.enterFirstName(LumaCreateAnAccountCredentials.userName.getCredential());
        lumaPage.enterLastName(lastName.getCredential());
        lumaPage.clickSignUpForNewsletterBtn();
        lumaPage.enterEmail(userEmailWithoutUpperCaseToUse.getCredential());
        lumaPage.enterUserPassword(userInvalidPasswordWithoutUpperCase.getCredential());
        lumaPage.enterUserPasswordConfirmation(userInvalidPasswordWithoutUpperCaseConf.getCredential());
        lumaPage.clickCreateBnt();
        Assert.assertEquals(accountConfPage.thankYouForReg.getText(), "Thank you for registering with Main Website Store.");
        Thread.sleep(5000);
    }


    @Test(description = "Create an account with invalid confirmation password")
    void createAnAccountWithInvalidConfPassword() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        lumaPage.clickCreateAnAccountBtn();
        lumaPage.enterFirstName(LumaCreateAnAccountCredentials.userName.getCredential());
        lumaPage.enterLastName(lastName.getCredential());
        lumaPage.clickSignUpForNewsletterBtn();
        lumaPage.enterEmail(userEmail.getCredential());
        lumaPage.enterUserPassword(userPassword.getCredential());
        lumaPage.enterUserPasswordConfirmation(passwordConfError.getCredential());
        lumaPage.clickCreateBnt();
        Assert.assertEquals(accountConfPage.passwordConfError.getText(), "Please enter the same value again.");
        Thread.sleep(5000);
    }

}