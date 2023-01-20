package tests;

import browser.Browser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public Browser browser = new Browser();

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
