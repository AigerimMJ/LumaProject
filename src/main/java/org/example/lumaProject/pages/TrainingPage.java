package org.example.lumaProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrainingPage extends BasePage{

    @FindBy (xpath = "//span[text()='Training']")
    public WebElement training;

    @FindBy (xpath = "//div[@class='content-heading']")
    public WebElement confMessage;

    public TrainingPage clickTraining(){
        elementActions.clickTheButton(training);
        return this;
    }
}
