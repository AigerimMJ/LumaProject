package org.example.lumaProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrdersAndReturnPage extends BasePage{

    @FindBy (xpath = "//a[text()='Orders and Returns']")
    public WebElement ordersAndReturnBtn;

    @FindBy (id="oar-order-id")
    public WebElement orderId;

    @FindBy(id="oar-billing-lastname")
    public WebElement billingLastName;

    @FindBy(id="quick-search-type-id")
    public WebElement findOrderBy;

    @FindBy(id="oar_email")
    public WebElement email;

    @FindBy(xpath = "//button[@title='Continue']")
    public WebElement continueBtn;


}
