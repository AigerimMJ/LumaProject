package org.example.lumaProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GearOrderPage extends BasePage{

    @FindBy(xpath = "(//span[text()='Gear'])[1]")
    public WebElement gear;

    @FindBy (xpath = "(//a[text()='Fitness Equipment'])[1]")
    public WebElement fitnessEquipment;

    @FindBy(xpath = "//img[@alt='Dual Handle Cardio Ball']")
    public WebElement cardioBall;

    @FindBy(id="qty")
    public WebElement quantity;

    @FindBy(id="product-addtocart-button")
    public WebElement addToCart;

    @FindBy(xpath = "//a[@class='action showcart']")
    public WebElement basket;

    @FindBy(id="top-cart-btn-checkout")
    public WebElement proceedToCheckout;
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

    @FindBy(id="billing-address-same-as-shipping")
    public WebElement checkBox;

    @FindBy(xpath = "//button[@class='action primary checkout']")
    public WebElement placeOrder;

    public GearOrderPage clickGearBtn(){
        elementActions.clickTheButton(gear);
        return this;
    }
    public GearOrderPage clickFitnessEquipmentBtn(){
        elementActions.scrollToElement(fitnessEquipment);
        elementActions.clickTheButton(fitnessEquipment);
        return this;
    }

    public GearOrderPage clickCardioBallBtn(){
        elementActions.scrollToElement(cardioBall);
        elementActions.clickTheButton(cardioBall);
        return this;
    }

    public GearOrderPage clickAddToCartBtn(){
        elementActions.scrollToElement(addToCart);
        elementActions.clickTheButton(addToCart);
        return this;
    }
    public GearOrderPage clickBasketBtn(){
        elementActions.scrollToElement(basket);
        elementActions.clickTheButton(basket);
        return this;
    }
    public GearOrderPage clickProceedToCheckoutBtn(){
        elementActions.scrollToElement(proceedToCheckout);
        elementActions.clickTheButton(proceedToCheckout);
        return this;
    }
    public GearOrderPage fillUpTheField(WebElement element, String txt){
        elementActions.writeText(element, txt);
        return this;
    }
    public GearOrderPage clickRadioBtn() {
        elementActions.scrollToElement(flatRateRadioBtn);
        elementActions.clickTheButton(flatRateRadioBtn);
        return this;
    }
    public GearOrderPage clickNextBtn() {
        elementActions.scrollToElement(next);
        elementActions.clickTheButton(next);
        return this;
    }
    public GearOrderPage clickCheckBoxBtn() {
        elementActions.scrollToElement(checkBox);
        elementActions.clickTheButton(checkBox);
        return this;
    }
    public GearOrderPage clickPlaceOrderBtn() {
        elementActions.scrollToElement(placeOrder);
        elementActions.clickTheButton(placeOrder);
        return this;
    }


}
