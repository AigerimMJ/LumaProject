package org.example.lumaProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccountPage extends BasePage {



    @FindBy(xpath = "(//a[text()='Create an Account'])[1]")
    WebElement createAnAccount;

    @FindBy(id = "firstname")
    WebElement userFirstNameInput;

    @FindBy(id = "lastname")
    WebElement userLastNameInput;

    @FindBy(id = "is_subscribed")
    WebElement signUpForNewsLetter;

    @FindBy(id = "email_address")
    WebElement userEmailAddress;

    @FindBy(id = "password")
    WebElement userPassword;

    @FindBy(id = "password-confirmation")
    WebElement userPasswordConfirmation;

    @FindBy(xpath = "(//*[text()='Create an Account'])[3]")
    WebElement createAnAccountBtn;





    public CreateAnAccountPage clickCreateAnAccountBtn() {
        elementActions.clickTheButton(createAnAccount);
        return this;
    }

    public CreateAnAccountPage enterFirstName(String firstName) {
        elementActions.writeText(userFirstNameInput, firstName);
        return this;
    }

    public CreateAnAccountPage enterLastName(String lastName) {
        elementActions.writeText(userLastNameInput, lastName);
        return this;
    }

    public CreateAnAccountPage clickSignUpForNewsletterBtn() {
        elementActions.clickTheButton(signUpForNewsLetter);
        return this;
    }

    public CreateAnAccountPage enterEmail(String email) {
        elementActions.writeText(userEmailAddress, email);
        return this;
    }

    public CreateAnAccountPage enterUserPassword(String password) {
        elementActions.writeText(userPassword, password);
        return this;
    }

    public CreateAnAccountPage enterUserPasswordConfirmation(String passwordConfirmation) {
        elementActions.writeText(userPasswordConfirmation, passwordConfirmation);
        return this;
    }

    public CreateAnAccountPage clickCreateBnt() {
        elementActions.clickTheButton(createAnAccountBtn);
        return this;
    }


    }

