package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends Browser {

    private final String categoryLocator = "//div[@class='g-middle']//h2//a[contains(text(),'%s')]";
    public void searchAndClickCatalog(String category) {
        WebElement category_el = driver.findElement(By.xpath(String.format(categoryLocator, category)));
        waitShowElement(category_el);
        category_el.click();
    }
}


