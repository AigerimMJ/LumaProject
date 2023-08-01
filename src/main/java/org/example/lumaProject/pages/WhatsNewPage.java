package org.example.lumaProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhatsNewPage extends BasePage {

    @FindBy(id = "ui-id-3")
    public WebElement whatsNew;
    @FindBy(xpath = "//img[@alt='Phoebe Zipper Sweatshirt']")
    public WebElement zipperSweatshirt;
    @FindBy(id = "option-label-size-143-item-166")
    public WebElement xsSize;
    @FindBy(id = "option-label-size-143-item-167")
    public WebElement sSize;
    @FindBy(id = "option-label-size-143-item-167")
    public WebElement mSize;
    @FindBy(id = "option-label-size-143-item-169")
    public WebElement lSize;
    @FindBy(id = "option-label-size-143-item-170")
    public WebElement xlSize;
    @FindBy(id = "product-addtocart-button")
    public WebElement addToCart;
    @FindBy(id = "option-label-color-93-item-52")
    public WebElement grayColor;
    @FindBy(id = "option-label-color-93-item-57")
    public WebElement purpleColor;
    @FindBy(id = "option-label-color-93-item-59")
    public WebElement whiteColor;
    @FindBy(xpath = "(//*[@data-bind=\"scope: 'minicart_content'\"])[1]")
    public WebElement busket;

    @FindBy (id="top-cart-btn-checkout")
    public WebElement proceedToCheckout;

    public WhatsNewPage clickAddToCart() {
        elementActions.clickTheButton(addToCart);
        return this;
    }

    public WhatsNewPage clickBusket() {
        elementActions.clickTheButton(busket);
        return this;
    }
    public WhatsNewPage clickProceed() {
        elementActions.clickTheButton(proceedToCheckout);
        return this;
    }
}