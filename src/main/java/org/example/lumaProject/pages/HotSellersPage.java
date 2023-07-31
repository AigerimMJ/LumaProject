package org.example.lumaProject.pages;

import io.qameta.allure.Step;
import org.example.lumaProject.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.LinkedList;
import java.util.List;

public class HotSellersPage extends BasePage {
    @FindBy(id = "search")
    public WebElement searchBtn;

    @FindBy(xpath = "//button[@title='Search']")
    public WebElement search;

    @FindBy(xpath = "//img[@alt='Electra Bra Top']")
    public WebElement electraBraTop;

//    @FindBy(xpath =)
//    public  List <WebElement> sizeList;

//    @Step("find all sizes of electra bra top and add it to list ")
//    public HotSellersPage listOfBraSize() {
//        List<String> expectedSizeList = new LinkedList<>(List.of("XS", "S", "M", "L", "XL"));
//        for (String size : expectedSizeList) {
//            boolean found = false;
////            for (WebElement size1 :sizeList)
//        }
    }
