package LumaTest;

import org.testng.annotations.Test;

public class WomenTest2 extends  BaseTest{

    @Test(description = "")
    public void shoppingOptionsVisibilityTest(){
        driver.get("https://magento.softwaretestingboard.com/women/tops-women/tees-women.html");
        womenPage2.listOfSizeVisibility();
    }

    @Test(description = "add tee to wish list")
    public void addingToWishList()  {
        driver.get("https://magento.softwaretestingboard.com/");
        womenPage2.addTopsToWishList("Tees");
    }
}

