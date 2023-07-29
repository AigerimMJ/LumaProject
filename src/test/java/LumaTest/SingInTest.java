package LumaTest;
import org.example.enums.LumaSignInCredentials;
import org.testng.annotations.Test;
import static org.example.enums.LumaSignInCredentials.*;
import static org.testng.AssertJUnit.assertEquals;

public class SingInTest extends BaseTest {

    @Test(description = "Sign in with valid credentials")
    void signInWithValidCredentials() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        signInPage.signInBtn();
        signInPage.enterEmailToSign(LumaSignInCredentials.userEmailToSign.getCredential());
        signInPage.enterPasswordToSign(userPasswordToSign.getCredential());
        signInPage.clickSecondSignInBtn();
        assertEquals(accountConfPage.myAccountConfirmation.getText(),"Welcome, Aigerim Moldomusaeva!");
        Thread.sleep(5000);
    }
    @Test (description = "Sign in with invalid email address")
    void signInWithInvalidEmailAddress() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        signInPage.signInBtn();
        signInPage.enterEmailToSign(invalidEmailToSign.getCredential());
        signInPage.enterPasswordToSign(userPasswordToSign.getCredential());
        signInPage.clickSecondSignInBtn();
        assertEquals(accountConfPage.wrongEmailError.getText(),"The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.");
        Thread.sleep(5000);

    }
    @Test (description = "Sign in with invalid password")
    void signInWithInvalidPassword() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        signInPage.signInBtn();
        signInPage.enterEmailToSign(userEmailToSign.getCredential());
        signInPage.enterPasswordToSign(invalidPasswordToSign.getCredential());
        signInPage.clickSecondSignInBtn();
        assertEquals(accountConfPage.wrongPasswordError.getText(),"The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.");
        Thread.sleep(5000);
    }

//    @Test(description = "Forgot password")
//    void forgotPasswordTest(){
//        driver.get("https://magento.softwaretestingboard.com/");
//        signInPage.signInBtn();
//        signInPage.forgotYourPasswordBtn();



    }


