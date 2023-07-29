package org.example.lumaProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrivacyAndCookiePolicyPage extends BasePage{

    @FindBy (xpath = "//a[text()='Privacy and Cookie Policy']")
    public WebElement privacyAndCookiePolicyBtn;

    @FindBy(xpath = "//a[text()='Search Terms']")
    public WebElement searchTermsBtn;

    public PrivacyAndCookiePolicyPage clickPrivacyAndCookieBtn(){
        elementActions.clickTheButton(privacyAndCookiePolicyBtn);
        return this;
    }
    public PrivacyAndCookiePolicyPage clickSearchTermsBtn(){
        elementActions.clickTheButton(searchTermsBtn);
        return this;
    }

}
