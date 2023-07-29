package org.example.lumaProject.pages;

import org.example.lumaProject.driverFactory.Driver;
import org.example.lumaProject.helper.ElementActions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    public ElementActions elementActions = new ElementActions();
}
