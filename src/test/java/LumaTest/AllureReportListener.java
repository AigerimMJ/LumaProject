package LumaTest;
import io.qameta.allure.Attachment;
import org.example.lumaProject.driverFactory.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AllureReportListener implements ITestListener {
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG () {
        return ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("Starting Test Suite '" + iTestContext.getName() + "'.......");
        iTestContext.setAttribute("WebDriver", Driver.getDriver());
    }
    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("Finished Test Suite '" + iTestContext.getName() + "'");
    }
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Starting Test Method '" + getTestMethodName(iTestResult) + "'");
    }
    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test Method '" + getTestMethodName(iTestResult) + "' is Passed");
    }
    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test Method '" + getTestMethodName(iTestResult) + "' is Failed");
        if (Driver.getDriver() != null) {
            System.out.println("Screenshot has captured for the Test Method '" + getTestMethodName(iTestResult) + "'");
            saveScreenshotPNG();
        }
    }
    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("Test Method '" + getTestMethodName(iTestResult) + "' is Skipped");
    }
    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }
}