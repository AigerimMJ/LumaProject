package LumaTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrdersAndReturnTest extends  BaseTest{

    @Test(description = "orders and return form with valid credentials")
    void fillUpOrdersAndReturnForm(){
        driver.get("https://magento.softwaretestingboard.com/");
        elementActions.clickTheButton(ordersAndReturnPage.ordersAndReturnBtn)
                .scrollToElement(driver.findElement(By.id("oar-order-id")))
                .writeText(ordersAndReturnPage.orderId, "000016655")
                .writeText(ordersAndReturnPage.billingLastName, "Moldomusaeva")
                .writeText(ordersAndReturnPage.email,"moldomusaevaaigerimm@gmail.com")
                .clickTheButton(ordersAndReturnPage.continueBtn);
        Assert.assertEquals(accountConfPage.orderAndReturnConfirmation.getText(), "Order # 000016655");
    }
    @Test(description = "orders and return form with invalid credentials")
    void fillUpOrdersAndReturnFormWithInvalidCredentials(){
        driver.get("https://magento.softwaretestingboard.com/");
        elementActions.clickTheButton(ordersAndReturnPage.ordersAndReturnBtn)
                .scrollToElement(driver.findElement(By.id("oar-order-id")))
                .writeText(ordersAndReturnPage.orderId, "452c")
                .writeText(ordersAndReturnPage.billingLastName, "Moldomusaeva")
                .writeText(ordersAndReturnPage.email,"moldomusaevaaigerimm@gmail.com")
                .clickTheButton(ordersAndReturnPage.continueBtn);
       Assert.assertEquals(accountConfPage.orderAndReturnError.getText(), "You entered incorrect data. Please try again.");

    }
}
