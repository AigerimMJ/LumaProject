package LumaTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WhatsNewTest extends  BaseTest{

    @Test(description = " ordering product with all sizes and colors")
    public void orderProductWithAllSizesColors() throws InterruptedException {
        driver.navigate().to("https://magento.softwaretestingboard.com/");
        elementActions.clickTheButton(whatsNewPage.whatsNew);
        elementActions.clickTheButton(whatsNewPage.zipperSweatshirt);
        elementActions.clickTheButton(whatsNewPage.xsSize);
        elementActions.clickTheButton(whatsNewPage.grayColor);
        whatsNewPage.clickAddToCart();
        elementActions.clickTheButton(whatsNewPage.sSize);
        elementActions.clickTheButton(whatsNewPage.whiteColor);
        Thread.sleep(5000);
        elementActions.clickTheButton(whatsNewPage.addToCart);
        elementActions.clickTheButton(whatsNewPage.mSize);
        elementActions.clickTheButton(whatsNewPage.purpleColor);
        Thread.sleep(5000);
        whatsNewPage.clickAddToCart();
        elementActions.clickTheButton(whatsNewPage.lSize);
        elementActions.clickTheButton(whatsNewPage.grayColor);
        whatsNewPage.clickAddToCart();
        elementActions.clickTheButton(whatsNewPage.xlSize);
        elementActions.clickTheButton(whatsNewPage.purpleColor);
        Thread.sleep(5000);
        whatsNewPage.clickAddToCart();
        whatsNewPage.clickBusket();
        whatsNewPage.clickProceed();
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Shipping Address']")).isDisplayed());



    }
}
