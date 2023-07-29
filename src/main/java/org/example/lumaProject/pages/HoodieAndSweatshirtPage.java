package org.example.lumaProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HoodieAndSweatshirtPage extends BasePage{

    @FindBy (xpath = "(//span[text()='Women'])[1]")
    public WebElement women;

    @FindBy (xpath = "//a[text()='Hoodies & Sweatshirts']")
    public WebElement hoodiesAndSweatshirts;

    @FindBy (id="option-label-size-143-item-167")
    public WebElement circeHoodedIceFleeceSize;

    @FindBy (id="option-label-color-93-item-53")
    public WebElement circeHoodedIceFleeceColor;

    @FindBy (xpath="(//div[@class=\"product-item-inner\"]/div/div/form/button/span)[1]")
    public WebElement circeHoodedIceFleeceAddToCart;
    @FindBy (xpath = "(//img[@class='product-image-photo'])[2]")
    public WebElement vNeckHoodie;

    @FindBy (id="option-label-size-143-item-166")
    public WebElement vNeckHoodieSize;

    @FindBy (id="option-label-color-93-item-53")
    public WebElement vNeckHoodieColor;

    @FindBy (xpath ="(//button[@title='Add to Cart'])[2]")
    public WebElement vNeckHoodieAddToCart;

    public HoodieAndSweatshirtPage clickSizeBtn(){
        elementActions.clickTheButton(vNeckHoodieSize);
        return this;
    }
    public HoodieAndSweatshirtPage clickColorBtn(){
        elementActions.clickTheButton(vNeckHoodieColor);
        return this;
    }
    public HoodieAndSweatshirtPage clickAddToCart(){
        elementActions.clickTheButton(vNeckHoodieAddToCart);
        return this;
    }


    public HoodieAndSweatshirtPage addProductToBusket(){
        elementActions.clickTheButton(women)
                .clickTheButton(hoodiesAndSweatshirts)
                .clickTheButton(circeHoodedIceFleeceSize)
                .clickTheButton(circeHoodedIceFleeceColor)
                .clickTheButton(circeHoodedIceFleeceAddToCart)
                .moveToElement(vNeckHoodie)
                .clickTheButton(vNeckHoodie)
                .clickTheButton(vNeckHoodieSize)
                .clickTheButton(vNeckHoodieColor)
                .clickTheButton(vNeckHoodieAddToCart);
        return this;
    }



}
