package LumaTest;

import org.example.lumaProject.models.Users;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTest extends BaseTest{


    @Test(description = "contact us ")
     void fillUpTheContactUsForm() throws InterruptedException {
          driver.get("https://magento.softwaretestingboard.com/");
          elementActions.clickTheButton(contactUsPage.contactUs)
                  .scrollToElement(driver.findElement(By.id("name")))
                  .writeText(contactUsPage.name, "Aigerim")
                  .writeText(contactUsPage.email, "mold@gmail.com")
                  .writeText(contactUsPage.phoneNumber, "0709992666")
                  .writeText(contactUsPage.comment, "Thank you for everything, I'm so Appreciated")
                  .clickTheButton(contactUsPage.submitBtn);
          Thread.sleep(5000);

        Assert.assertEquals(accountConfPage.contactUsConfirmation.getText(), "Thanks for contacting us with your comments and questions. We'll respond to you very soon.");
      }
}
