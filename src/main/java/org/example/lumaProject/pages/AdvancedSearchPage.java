package org.example.lumaProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdvancedSearchPage extends BasePage{

    @FindBy (xpath = "(//a[@data-action='advanced-search'])[2]")
    public WebElement advancedSearchBtn;

    @FindBy(id="name")
    public WebElement productName;

    @FindBy(id="sku")
    public WebElement sku;

    @FindBy(id="description")
    public WebElement description;

    @FindBy (id="short_description")
    public WebElement shortDescription;

    @FindBy(id="price")
    public WebElement priceFrom;

    @FindBy(id="price_to")
    public WebElement priceTo;

    @FindBy(xpath = "//button[@class='action search primary']")
    public WebElement searchBtn;

    public AdvancedSearchPage clickAdvanceedSerachBtn(){
        elementActions.clickTheButton(advancedSearchBtn);
        return this;
    }
    public AdvancedSearchPage fillUpProductName(String productName2){
        elementActions.writeText(productName, productName2);
        return this;
    }
    public AdvancedSearchPage fillUpSkuNumber(String skuNumber){
        elementActions.writeText(sku,skuNumber );
        return this;
    }
    public AdvancedSearchPage fillUpDescription(String descriptionIfo){
        elementActions.writeText(description, descriptionIfo);
        return this;
    }
    public AdvancedSearchPage fillUpShortDescription(String descriptionInfo){
        elementActions.writeText(shortDescription, descriptionInfo);
        return this;
    }
    public AdvancedSearchPage fillUpPriceFrom(String priceFromInfo){
        elementActions.writeText(priceFrom,priceFromInfo );
        return this;
    }
    public AdvancedSearchPage fillUpPriceTo(String priceToInfo){
        elementActions.writeText(priceTo, priceToInfo);
        return this;
    }
    public AdvancedSearchPage clickSearchBtn(){
        elementActions.clickTheButton(searchBtn);
        return this;
    }
}
