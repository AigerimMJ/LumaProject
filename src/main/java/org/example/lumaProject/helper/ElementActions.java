package org.example.lumaProject.helper;

import org.example.lumaProject.driverFactory.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementActions {
    public ElementActions waitButtonToBeClickable(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }
    public ElementActions waitElementToBeDisplayed(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15)).
                until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public ElementActions clickTheButton(WebElement element) {
        waitButtonToBeClickable(element);
        highlightElement(element);
        scrollToElement(element);
        element.click();
        return this;
    }

    public ElementActions writeText(WebElement element, String txt) {
        waitElementToBeDisplayed(element);
        scrollToElement(element);
        element.sendKeys(txt);
        return this;
    }

    public ElementActions scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        return this;
    }

    public ElementActions moveToElement(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
        return this;

    }

    public ElementActions writeTextWithEnter(WebElement element, String txt) {
        waitElementToBeDisplayed(element);
        element.sendKeys(txt, Keys.ARROW_DOWN);
        element.sendKeys(Keys.ENTER);
        return this;

    }

    public ElementActions clickWithJS(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", element);
        return this;
    }

    public ElementActions highlightElement(WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "border: 2px solid red");
        return this;
    }
    public ElementActions clearFieldWithDefaultCredentials(WebElement element, String txt){
        element.clear();
        element.sendKeys(txt);
        return this;

    }

}
