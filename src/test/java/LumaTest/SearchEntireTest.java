package LumaTest;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("SearchEntire")


public class SearchEntireTest extends  BaseTest{


    @Epic("Search")
    @Feature("Search functionality")
    @Owner("Aigerim")
    @Severity(SeverityLevel.CRITICAL)
    @Test( description = "search entire test")
    void searchAndOrderProductThroughEntireSearch() throws InterruptedException {
        driver.navigate().to("https://magento.softwaretestingboard.com/");
        WebElement searchField = driver.findElement(By.id("search"));
        searchField.sendKeys("pants");
        elementActions.waitElementToBeDisplayed(searchEntirePage.search);
        searchEntirePage.fillUpAllField();
//       elementActions.clearFieldWithDefaultCredentials(searchEntirePage.quantity, "3");
       searchEntirePage.clickAndFillUpOrderField();
        Assert.assertEquals(driver.findElement(By.xpath("//span[@data-ui-id=\"page-title-wrapper\"]")).getText(), "Shopping Cart");



    }
}
