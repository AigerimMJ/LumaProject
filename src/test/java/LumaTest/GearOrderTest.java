package LumaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearOrderTest extends BaseTest{

    @Test(description = "gear order test")
    void gearOrderTest() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        gearOrderPage.clickGearBtn();
        gearOrderPage.clickFitnessEquipmentBtn();
        gearOrderPage.clickCardioBallBtn();
        WebElement quantityInput = driver.findElement(By.id("qty"));
        quantityInput.clear();
        quantityInput.sendKeys("5");
        gearOrderPage.clickAddToCartBtn();
        Thread.sleep(5000);
        gearOrderPage.clickBasketBtn();
        gearOrderPage.clickProceedToCheckoutBtn();
        gearOrderPage.fillUpTheField(gearOrderPage.emailAddress, "kurmi@gmail.com");
        gearOrderPage.fillUpTheField(gearOrderPage.firstNameInput, "tom");
        gearOrderPage.fillUpTheField(gearOrderPage.lastNameInput, "tim");
        gearOrderPage.fillUpTheField(gearOrderPage.company, "google");
        gearOrderPage.fillUpTheField(gearOrderPage.streetAddress, "djal 66");
        gearOrderPage.fillUpTheField(gearOrderPage.city, "New York");
        WebElement  stateDropDown = driver.findElement(By.xpath("//*[@name='region_id']"));
        Select selectState = new Select(stateDropDown);
        selectState.selectByVisibleText("New York");
        gearOrderPage.fillUpTheField(gearOrderPage.zipCode, "10001");
        WebElement  countryDropDown = driver.findElement(By.xpath("//*[@name='country_id']"));
        Select selectCountry = new Select(countryDropDown);
        selectCountry.selectByIndex(3);
        gearOrderPage.fillUpTheField(gearOrderPage.telephone, "0709992666");
        gearOrderPage.clickRadioBtn();
        gearOrderPage.clickNextBtn();
        Thread.sleep(5000);
        gearOrderPage.clickPlaceOrderBtn();
        Thread.sleep(5000);
        Assert.assertEquals(accountConfPage.gearConfMessage.getText(),
                "We'll email you an order confirmation with details and tracking info.");



    }

}
