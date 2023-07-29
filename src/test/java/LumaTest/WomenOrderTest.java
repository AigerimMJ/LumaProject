package LumaTest;

import org.example.enums.LumaSignInCredentials;
import org.example.enums.LumaWomenOrderCredentials;
import org.example.lumaProject.driverFactory.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.enums.LumaCreateAnAccountCredentials.userEmail;
import static org.example.enums.LumaCreateAnAccountCredentials.userPassword;
import static org.example.enums.LumaSignInCredentials.*;
import static org.example.enums.LumaWomenOrderCredentials.*;

public class WomenOrderTest extends BaseTest {

    @Test(description = "Sign in to order product ")
    void signInToOrderProduct() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        womenOrderPage.clickWomenBtn();
        womenOrderPage.clickJacketsBtn();
        womenOrderPage.clickAltPulloverBtn();
        womenOrderPage.clickProductSizeBtn();
        womenOrderPage.clickColor();
//        womenOrderPage.clickAddToCartBtn();
//        Thread.sleep(5000);
//        womenOrderPage.clickBasketBtn();
//
//        womenOrderPage.clickProceedToCheckoutBtn();
//        womenOrderPage.fillUpEmailAddress(womenEmailAddress.getCredentials());
//        womenOrderPage.fillUpFirstName(womenFirstName.getCredentials());
//        womenOrderPage.fillUpLastName(womenLastName.getCredentials());
//        womenOrderPage.fillUpCompany(womenCompany.getCredentials());
//
//        Assert.assertEquals(accountConfPage.purchaseConfirmation.getText(), "Thank you for your purchase!");


    }
}
