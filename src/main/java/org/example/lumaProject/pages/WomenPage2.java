package org.example.lumaProject.pages;

import io.qameta.allure.Step;
import org.example.lumaProject.driverFactory.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import static org.example.lumaProject.driverFactory.Driver.getDriver;

public class WomenPage2 extends BasePage{
    WebDriver driver = getDriver();

        @FindBy(id = "ui-id-4")
        public WebElement woman;

        @FindBy(xpath = "//div[@class=\"categories-menu\"]/ul/li")
        public List<WebElement> topsCategory;
        @FindBy(xpath = "(//ol/li[@class=\"item product product-item\"])[1]")
        public WebElement desireeFitnessTee;
        @FindBy(xpath = "//div[@class=\"product-item-inner\"]/div/div[2]/a")
        public WebElement addToWishList;


        @FindBy(xpath = "//div[@id=\"narrow-by-list\"]/div[2]/div/div/div/a/div")
        public List<WebElement> sizeList;
        @Step("find all elements in size sector and add it in list ")
        public WomenPage2 listOfSizeVisibility() {

            List<String> expectedSizeList = new LinkedList<>(List.of("XS", "S", "M", "L", "XL"));
            for (String expectedSize : expectedSizeList) {
                boolean found = false;
                for (WebElement size : sizeList) {
                    if (size.getText().equals(expectedSize)) {
                        found = true;
                        break;
                    }
                }
                Assert.assertTrue(found, expectedSize);
            }
            return this;
        }

        public WomenPage2 chooseTops(String tops){
            elementActions.clickTheButton(woman);
            for(WebElement top: topsCategory){
                System.out.println(top.getText());
                if (top.getText().contains(tops)) {
                    new WebDriverWait(driver, Duration.ofSeconds(5))
                            .until(ExpectedConditions.elementToBeClickable(top));
                    elementActions.clickTheButton(top);
                }
            }
            return this;
        }
        public WomenPage2 addTopsToWishList(String tops)  {
            chooseTops(tops);
            Actions actions = new Actions(driver);
            actions.moveToElement(desireeFitnessTee).perform();
            elementActions.clickTheButton(addToWishList);
            return this;
        }


    }

