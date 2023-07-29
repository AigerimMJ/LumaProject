package org.example.lumaProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenClothesOrderPage extends BasePage{

    @FindBy(xpath = "//*[text()='Men']")
    public WebElement menBtn;

    @FindBy(xpath = "(//*[text()='Pants'])[3]")
    public WebElement pantsBtn;

    @FindBy(xpath = "//img[@alt='Zeppelin Yoga Pant']")
    public WebElement orderZeppelinYogaPants;

    @FindBy(id = "option-label-size-143-item-175")
    public WebElement size;

    @FindBy(id = "option-label-color-93-item-53")
    public WebElement color;

    @FindBy(xpath = "//input[@value='1']")
    public WebElement quantity;

    @FindBy(id = "product-addtocart-button")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//div[@data-block='minicart']")
    public WebElement basket;

    @FindBy (xpath = "//div[@data-block='minicart']")
    public WebElement clickBasket;

    @FindBy(xpath = "//button[@class='action primary checkout']")
    public WebElement checkOut;

    @FindBy(id = "customer-email")
    public WebElement emailAddress;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@name='company']")
    public WebElement company;

    @FindBy(xpath = "//input[@name='street[0]']")
    public WebElement streetAddress;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;

    @FindBy(xpath = "//*[@name='region_id']")
    public WebElement stateProvince;

    @FindBy(xpath = "//*[@name='postcode']")
    public WebElement zipCode;

    @FindBy(xpath = "//*[@name='country_id']")
    public WebElement country;

    @FindBy(xpath = "//*[@name='telephone']")
    public WebElement telephone;

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement flatRateRadioBtn;

    @FindBy(xpath = "//*[text()='Next']")
    public WebElement next;

    @FindBy(xpath = "//button[@class='action primary checkout']")
    public WebElement placeOrder;

    public MenClothesOrderPage clickMenBtn(){
        elementActions.scrollToElement(menBtn);
        elementActions.clickTheButton(menBtn);
        return this;
    }
    public MenClothesOrderPage clickPantsBtn() {
        elementActions.scrollToElement(pantsBtn);
        elementActions.clickTheButton(pantsBtn);
        return this;
    }
    public MenClothesOrderPage clickZeppelinYogaPantsBtn() {
        elementActions.scrollToElement(orderZeppelinYogaPants);
        elementActions.clickTheButton(orderZeppelinYogaPants);
        return this;
    }
    public MenClothesOrderPage clickSizeBtn() {
        elementActions.scrollToElement(size);
        elementActions.clickTheButton(size);
        return this;
    }
    public MenClothesOrderPage clickColorBtn() {
        elementActions.scrollToElement(color);
        elementActions.clickTheButton(color);
        return this;
    }
    public MenClothesOrderPage clickAddToCartBtn() {
        elementActions.scrollToElement(addToCartBtn);
        elementActions.clickTheButton(addToCartBtn);
        return this;
    }
    public MenClothesOrderPage clickBusketBtn() {
        elementActions.scrollToElement(basket);
        elementActions.clickTheButton(basket);
        return this;
    }
    public MenClothesOrderPage clickProceedToCheckOutBtn() {
        elementActions.scrollToElement(checkOut);
        elementActions.clickTheButton(checkOut);
        return this;
    }
    public MenClothesOrderPage fillUpTheField(WebElement element, String txt){
        elementActions.writeText(element, txt);
        return this;
    }
    public MenClothesOrderPage clickRadioBtn() {
        elementActions.scrollToElement(flatRateRadioBtn);
        elementActions.clickTheButton(flatRateRadioBtn);
        return this;
    }
    public MenClothesOrderPage clickNextBtn() {
        elementActions.scrollToElement(next);
        elementActions.clickTheButton(next);
        return this;
    }
    public MenClothesOrderPage clickPlaceOrderBtn() {
        elementActions.scrollToElement(placeOrder);
        elementActions.clickTheButton(placeOrder);
        return this;
    }


}
