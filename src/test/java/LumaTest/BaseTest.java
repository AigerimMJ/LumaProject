package LumaTest;


import org.example.lumaProject.config.FakeDataProvider;
import org.example.lumaProject.driverFactory.Driver;
import org.example.lumaProject.helper.ElementActions;
import org.example.lumaProject.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners(AllureReportListener.class)

public abstract class BaseTest {

    public WebDriver driver;
    public ElementActions elementActions;
    public FakeDataProvider fakeDataProvider;
    public CreateAnAccountPage lumaPage;
    public AccountConfPage accountConfPage;
    public WomenOrderPage womenOrderPage;
    public SignInPage signInPage;
    public CreateAnAccountPage createAnAccountPage;
    public ContactUsPage contactUsPage;
    public OrdersAndReturnPage ordersAndReturnPage;
    public PrivacyAndCookiePolicyPage privacyAndCookiePolicyPage;
    public AdvancedSearchPage advancedSearchPage;
    public MenClothesOrderPage menClothesOrderPage;
    public GearOrderPage gearOrderPage;
    public SearchEntirePage searchEntirePage;
    public HoodieAndSweatshirtPage hoodieAndSweatshirtPage;
    public WomenPage2 womenPage2;
    public TrainingPage trainingPage;

    @BeforeClass
    public void setUpBrowser() {

        driver = Driver.getDriver();
        elementActions = new ElementActions();
        fakeDataProvider = new FakeDataProvider();
        lumaPage = new CreateAnAccountPage();
        accountConfPage = new AccountConfPage();
        womenOrderPage = new WomenOrderPage();
        signInPage = new SignInPage();
        createAnAccountPage = new CreateAnAccountPage();
        contactUsPage = new ContactUsPage();
        ordersAndReturnPage = new OrdersAndReturnPage();
        privacyAndCookiePolicyPage = new PrivacyAndCookiePolicyPage();
        advancedSearchPage = new AdvancedSearchPage();
        menClothesOrderPage = new MenClothesOrderPage();
        gearOrderPage = new GearOrderPage();
        searchEntirePage = new SearchEntirePage();
        hoodieAndSweatshirtPage = new HoodieAndSweatshirtPage();
        womenPage2 = new WomenPage2();
        trainingPage = new TrainingPage();

    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();

    }
}
