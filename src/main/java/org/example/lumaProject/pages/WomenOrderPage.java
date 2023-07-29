package org.example.lumaProject.pages;

import org.example.lumaProject.driverFactory.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenOrderPage extends BasePage {

    @FindBy(xpath = "(//span[text()='Women'])[1]")
    public WebElement womenBtn;
    @FindBy (xpath = "//a[text()='Jackets']")
    public WebElement jackets;

    @FindBy(xpath = "//img[@alt='Augusta Pullover Jacket']")
    public WebElement altPullover;

    @FindBy(xpath = "(//img[@class='product-image-photo'])[1]")
    public WebElement productBtn;

    @FindBy(xpath = "//div[@option-label='S']")
    public WebElement productSizeBtn;

    @FindBy(xpath = "///div[@aria-label='Red']")
    public WebElement color;

    @FindBy(xpath = "//input[@value='1']")
    public WebElement quantity;

    @FindBy(xpath = "//button[@title='Add to Cart']")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//a[@class='action showcart']")

    public WebElement basket;

    @FindBy(xpath = "//button[@class='action primary checkout']")
    public WebElement proceedtoCheckout;
    @FindBy (id ="customer-email")
    public WebElement emailAddress;

    @FindBy (xpath = "//*[@name='firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@name='lastname']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='company']")
    public WebElement companyField;

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
    public WebElement phoneNumber;
    @FindBy(xpath = "//*[@name='ko_unique_2']")
    public WebElement shippingFlatRate;

    @FindBy(xpath = "//span[text()='Next']")
    public WebElement next;

    @FindBy(xpath ="//*[text()='Place Order']")
    public WebElement placeOrder;


    public WomenOrderPage clickWomenBtn (){
        elementActions.scrollToElement(womenBtn);
        elementActions.clickTheButton(womenBtn);
        return this;
    }
    public WomenOrderPage clickJacketsBtn (){
        elementActions.scrollToElement(jackets);
        elementActions.clickTheButton(jackets);
        return this;
    }
    public WomenOrderPage clickAltPulloverBtn (){
        elementActions.scrollToElement(altPullover);
        elementActions.clickTheButton(altPullover);
        return this;
    }

    public WomenOrderPage clickColor(){
        elementActions.clickTheButton(color);
        return this;
    }


    public WomenOrderPage clickProductSizeBtn(){
        elementActions.scrollToElement(productSizeBtn);
        elementActions.clickTheButton(productSizeBtn);
        return this;
    }




    public WomenOrderPage clickQuantityBtn(){
        elementActions.scrollToElement(quantity);
        elementActions.clickTheButton(quantity);
        return this;
    }

    public WomenOrderPage clickAddToCartBtn(){
        elementActions.scrollToElement(addToCartBtn);
        elementActions.clickTheButton(addToCartBtn);
        return this;
    }

    public WomenOrderPage clickBasketBtn() {
        elementActions.scrollToElement(basket);
        elementActions.clickTheButton(basket);
        return this;
    }
    public WomenOrderPage clickProceedToCheckoutBtn() {
        elementActions.scrollToElement(proceedtoCheckout);
        elementActions.clickTheButton(proceedtoCheckout);
        return this;
    }

    public WomenOrderPage fillUpCompany(String companyName){
        elementActions.writeText(companyField, companyName);
        return this;
    }
    public WomenOrderPage fillUpStreetAddress(String street){
        elementActions.writeText(streetAddress, street);
        return this;

    }
    public WomenOrderPage fillUpCity(String chooseCity){
        elementActions.writeText(city, chooseCity);
        return this;
    }

    public WomenOrderPage fillUpZipCode(String zip){
        elementActions.writeText(zipCode, zip);
        return this;

    }

    public WomenOrderPage fillUpPhoneNumber(String phone){
        elementActions.writeText(phoneNumber, phone);
        return this;
    }

    public WomenOrderPage clickShipInFlateBtn(){
        elementActions.clickTheButton(shippingFlatRate);
        return this;
    }

    public WomenOrderPage clickNext(){
        elementActions.clickTheButton(next);
        return this;
    }
  public WomenOrderPage clickPlaceOrderBtn(){
        elementActions.clickTheButton(placeOrder);
        return this;
  }
  public WomenOrderPage fillUpEmailAddress(String email){
        elementActions.writeText(emailAddress, email);
        return this;
  }
    public WomenOrderPage fillUpFirstName(String userFirstName){
        elementActions.writeText(firstName, userFirstName);
        return this;
}

    public WomenOrderPage fillUpLastName(String userLastName) {
        elementActions.writeText(lastName, userLastName);
        return this;

    }}
