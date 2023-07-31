package org.example.lumaProject.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchEntirePage extends BasePage{


    @FindBy(id = "search")
    public WebElement searchBtn;

    @FindBy(xpath = "//button[@title='Search']")
    public WebElement search;

    @FindBy(xpath = "//img[@alt='Livingston All-Purpose Tight']")
    public WebElement pants;

    @FindBy(id="option-label-size-143-item-176")
    public WebElement size;

    @FindBy (id="option-label-color-93-item-50")
    public WebElement color;

    @FindBy (name = "qty")
    public WebElement quantity;

    @FindBy (id="product-addtocart-button")
    public WebElement addToCart;
    @FindBy (xpath = "//*[@class='action showcart']")
    public WebElement busket;

    @FindBy (id="top-cart-btn-checkout")
    public WebElement proceedToCheckout;
    @FindBy(xpath="//span[text()='View and Edit Cart']")
    public WebElement viewAndEdit;



    public org.example.lumaProject.pages.SearchEntirePage clickSearchBtn(){
        elementActions.clickTheButton(searchBtn);
        return this;
    }
    public org.example.lumaProject.pages.SearchEntirePage clickSearch(){
        elementActions.clickTheButton(search);
        return this;
    }
    public org.example.lumaProject.pages.SearchEntirePage clickPants(){
        elementActions.clickTheButton(pants);
        return this;

    }
    public org.example.lumaProject.pages.SearchEntirePage clickSizeBtn(){
        elementActions.clickTheButton(size);
        return this;
    }
    public org.example.lumaProject.pages.SearchEntirePage clickColorBtn(){
        elementActions.clickTheButton(color);
        return this;

    }  public org.example.lumaProject.pages.SearchEntirePage clickAddToCartBtn() {
        elementActions.clickTheButton(addToCart);
        return this;
    }


    @Step("fill up the form")
    public org.example.lumaProject.pages.SearchEntirePage fillUpAllField(){
        elementActions.clickTheButton(search)
                .clickTheButton(pants)
                .clickTheButton(size)
                .clickTheButton(color);
        return this;

    }
    public org.example.lumaProject.pages.SearchEntirePage clickAndFillUpOrderField() throws InterruptedException {
        elementActions.clickTheButton(addToCart);
        Thread.sleep(5000);
        elementActions.clickTheButton(busket)
                .clickTheButton(viewAndEdit);
        return this;

    }


}

