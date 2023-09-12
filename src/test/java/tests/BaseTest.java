package tests;

import browser.Browser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class BaseTest {

    public Browser browser = new Browser();
    SoftAssert softAssert = new SoftAssert();

    private final String baseURL = "https://www.onliner.by/";

    @BeforeTest
    public void before() {
        browser.driverInit();
        browser.getURL(baseURL);
    }

    @AfterTest
    public void after() {
        browser.closeDriver();
    }
}
