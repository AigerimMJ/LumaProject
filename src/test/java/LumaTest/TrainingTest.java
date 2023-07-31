package LumaTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TrainingTest extends BaseTest{

    @Test(description ="checking training page")
    public void checkingTrainingTest(){
        driver.navigate().to("https://magento.softwaretestingboard.com/");
        trainingPage.clickTraining();
        elementActions.scrollToElement(trainingPage.confMessage);
        Assert.assertEquals(trainingPage.confMessage, "Top Videos");
    }
}
