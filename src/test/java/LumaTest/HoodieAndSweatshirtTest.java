package LumaTest;

import org.testng.annotations.Test;

public class HoodieAndSweatshirtTest extends BaseTest{

    @Test()
    public void addToBusketHoodie() throws InterruptedException {
        driver.navigate().to("https://magento.softwaretestingboard.com/");
        hoodieAndSweatshirtPage.addProductToBusket();

//        hoodieAndSweatshirtPage.clickSizeBtn();
//        hoodieAndSweatshirtPage.clickColorBtn();
//        Thread.sleep(5000);
//        hoodieAndSweatshirtPage.clickAddToCart();


    }
}
