package LumaTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AdvancedSearchTest extends BaseTest{

     @Test(description = "advanced search with valid credentials")
     public void fillUpAdvancedSearchForm(){
         driver.get("https://magento.softwaretestingboard.com/");
         elementActions.clickTheButton(advancedSearchPage.advancedSearchBtn)
                 .writeText(advancedSearchPage.productName, "radiant tee")
                 .writeText(advancedSearchPage.sku, "WS12")
                 .writeText(advancedSearchPage.description, "radiant tee")
                 .writeText(advancedSearchPage.priceFrom, "20")
                 .writeText(advancedSearchPage.priceTo, "30")
                 .clickTheButton(advancedSearchPage.searchBtn);
         Assert.assertEquals(accountConfPage.advancedSearchConfirmation.getText(), "were found using the following search criteria");
     }

     @Test(description = "advanced search with invalid credentials)")
    public void fillUpAdvancedSearchFormWithInvalidCredentials(){
         driver.get("https://magento.softwaretestingboard.com/");
         elementActions.clickTheButton(advancedSearchPage.advancedSearchBtn)
                 .writeText(advancedSearchPage.productName, "jeans")
                 .writeText(advancedSearchPage.sku, "12345")
                 .writeText(advancedSearchPage.description, "radiant tee")
                 .writeText(advancedSearchPage.priceFrom, "20")
                 .writeText(advancedSearchPage.priceTo, "30")
                 .clickTheButton(advancedSearchPage.searchBtn);
       assertEquals(accountConfPage.advanceSearchError.getText(), "We can't find any items matching these search criteria. Modify your search.");

     }
}
