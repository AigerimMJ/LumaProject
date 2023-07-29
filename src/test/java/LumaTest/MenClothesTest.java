package LumaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class MenClothesTest extends BaseTest{
    @Test(description = "men's clothes order test")
    void fillUpTheMenOrderField() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        menClothesOrderPage.clickMenBtn();
        menClothesOrderPage.clickPantsBtn();
        menClothesOrderPage.clickZeppelinYogaPantsBtn();
        menClothesOrderPage.clickSizeBtn();
        menClothesOrderPage.clickColorBtn();
        menClothesOrderPage.clickAddToCartBtn();
        Thread.sleep(5000);
        menClothesOrderPage.clickBusketBtn();
        menClothesOrderPage.clickProceedToCheckOutBtn();
        menClothesOrderPage.fillUpTheField(menClothesOrderPage.emailAddress, "kurmanaliev@gmail.com");
        menClothesOrderPage.fillUpTheField(menClothesOrderPage.firstNameInput,"Emirhan" );
        menClothesOrderPage.fillUpTheField(menClothesOrderPage.lastNameInput, "Ilgizovich");
        menClothesOrderPage.fillUpTheField(menClothesOrderPage.company, "Google");
        menClothesOrderPage.fillUpTheField(menClothesOrderPage.streetAddress, "Chodronova 13");
        menClothesOrderPage.fillUpTheField(menClothesOrderPage.city, "Bishkek");
        WebElement  stateDropDown = driver.findElement(By.xpath("//*[@name='region_id']"));
        Select selectState = new Select(stateDropDown);
        selectState.selectByVisibleText("Colorado");
        menClothesOrderPage.fillUpTheField(menClothesOrderPage.zipCode, "10001");
        WebElement  countryDropDown = driver.findElement(By.xpath("//*[@name='country_id']"));
        Select selectCountry = new Select(countryDropDown);
        selectCountry.selectByIndex(7);
        menClothesOrderPage.fillUpTheField(menClothesOrderPage.telephone, "0709992666");
        menClothesOrderPage.clickRadioBtn();
        menClothesOrderPage.clickNextBtn();
        Thread.sleep(5000);
        menClothesOrderPage.clickPlaceOrderBtn();
        Thread.sleep(5000);
//        Assert.assertEquals(accountConfPage.menPurchaseConfMessage.getText(), "Thank you for your purchase!");








    }

}
