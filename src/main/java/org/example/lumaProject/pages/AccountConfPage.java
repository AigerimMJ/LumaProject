package org.example.lumaProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountConfPage extends BasePage{
    @FindBy(xpath = "//div[text()='Thank you for registering with Main Website Store.']")
    public WebElement thankYouForReg;

    @FindBy(id="email_address-error")
    public WebElement emailError;

    @FindBy(id="password-error")
    public WebElement passwordError;

    @FindBy(id="password-confirmation-error")
    public WebElement passwordConfError;

    @FindBy(xpath = "//span[text()='Welcome, Aigerim Moldomusaeva!']")
    public WebElement myAccountConfirmation;

    @FindBy(xpath = "//*[@class='message-error error message']")
    public WebElement wrongEmailError;

    @FindBy(xpath = "//div[@class='message-error error message']")
    public WebElement wrongPasswordError;

    @FindBy (xpath = "//span[@data-ui-id='page-title-wrapper']")
    public WebElement purchaseConfirmation;

    @FindBy (xpath = "//*[@class='message-success success message']")
    public WebElement contactUsConfirmation;

    @FindBy(xpath = "//span[@data-ui-id='page-title-wrapper']")
    public WebElement orderAndReturnConfirmation;

    @FindBy (xpath="//*[@class='message-error error message']")
    public WebElement orderAndReturnError;

    @FindBy(xpath = "//span[@class='base']")
    public WebElement privacyAndCookieConfirmation;

    @FindBy(xpath = "//span[@class='base']")
    public WebElement searchTermsConfirmation;

    @FindBy(xpath = "//div[@class='search found']")
    public WebElement advancedSearchConfirmation;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement advanceSearchError;

    @FindBy(xpath = "//h1[@class='page-title']")
    public WebElement menPurchaseConfMessage;

   @FindBy (xpath = "//div[@class='checkout-success']")
    public WebElement gearConfMessage;
}
