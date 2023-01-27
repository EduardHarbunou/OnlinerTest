package browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Browser {
    public static WebDriver driver;

    public void driverInit() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void getURL(String url) {
        driver.get(url);
    }

    public static void waitShowElement(WebElement el) {
        WebDriverWait iWait = new WebDriverWait (driver, Duration.ofSeconds(10));
        iWait.until(ExpectedConditions.visibilityOf(el));
    }

    public void closeDriver() {
        driver.quit();
    }

}
