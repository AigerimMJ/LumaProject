package org.example.lumaProject.pages;

import org.example.lumaProject.helper.ElementActions;
import org.example.lumaProject.models.Users;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage{


    @FindBy(xpath = "//a[text()='Contact Us']")
    public WebElement contactUs;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "telephone")
    public WebElement phoneNumber;
    @FindBy(id = "comment")
    public WebElement comment;

    @FindBy(xpath = "//button[@class='action submit primary']")
    public WebElement submitBtn;

    public Users fillUpContactUsForm(Users users){
        elementActions.clickTheButton(contactUs)
                .writeText(name, users.userFirstName)
                .writeText(email, users.userEmail)
                .writeText(phoneNumber, users.userMobileNumber)
                .writeText(comment, users.comment)
                .clickTheButton(submitBtn);
        return users;


    }

}

