package org.example.lumaProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

    @FindBy(xpath = "(//li[@class='authorization-link'])[1]")
    public WebElement signInBtn;

    @FindBy(id = "send2")
    WebElement clickSignInBtn;

    @FindBy(id = "email")
    public WebElement enterEmailSign;

    @FindBy(id="pass")
    public WebElement enterPasswordSign;


    @FindBy(xpath = "//a[@class='action remind']")
    public WebElement forgotPasswordBtn;


    public SignInPage clickSecondSignInBtn() {
        elementActions.clickTheButton(clickSignInBtn);
        return this;
    }
    public SignInPage enterEmailToSign(String userEmailToSign){
        elementActions.writeText(enterEmailSign,userEmailToSign );
        return this;
    }
    public SignInPage enterPasswordToSign(String userPasswordToSign) {
        elementActions.writeText(enterPasswordSign, userPasswordToSign);
        return this;
    }
    public SignInPage signInBtn() {
        elementActions.clickTheButton(signInBtn);
        return this;
    }
    public SignInPage forgotYourPasswordBtn(){
        elementActions.clickTheButton(forgotPasswordBtn);
        return this;
    }

}
