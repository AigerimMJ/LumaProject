package LumaTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PrivacyAndCookiePolicyTest extends BaseTest{

    @Test(description = "privacy and cookie policy test")
    public void checkPrivacyAndCookiePolicyBtn(){
        driver.get("https://magento.softwaretestingboard.com/");
        elementActions.clickTheButton(privacyAndCookiePolicyPage.privacyAndCookiePolicyBtn);
        Assert.assertEquals(accountConfPage.privacyAndCookieConfirmation.getText(), "Privacy Policy");
    }

    @Test(description = "Search Terms test")
    public void checkSearchTermsBtn(){
        driver.get("https://magento.softwaretestingboard.com/");
        elementActions.clickTheButton(privacyAndCookiePolicyPage.searchTermsBtn);
        assertEquals(accountConfPage.searchTermsConfirmation.getText(), "Popular Search Terms");

    }
}
