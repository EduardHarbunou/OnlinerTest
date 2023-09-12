package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TVPage extends Browser {
    private final String proizvoditelSamsung = "//li/label[contains(@class, 'schema-filter__checkbox-item')]/span[contains(@class, 'i-checkbox')]/following-sibling::span[text() = '%s']";
    private final String price = "//input[@class = 'schema-filter-control__item schema-filter__number-input schema-filter__number-input_price' and @placeholder = 'до']";

    private final String razreshenie = "//li/label[contains(@class, 'schema-filter__checkbox-item')]/span[contains(@class, 'i-checkbox')]/input[@type = 'checkbox' and @value = '%s']";

    private final String diagonalMin = "//label[@class= 'schema-filter__checkbox-item']//span[text() = '%s']";

    private final String diagonalMax = "//label[@class= 'schema-filter__checkbox-item']//span[text() = '%s']";
    public void searchAndClickSamsung(String samsung) {
        WebElement proizvodSamsung = driver.findElement(By.xpath(String.format(proizvoditelSamsung, samsung)));
        //waitShowElement(proizvodSamsung);
        proizvodSamsung.click();
    }

    public void searchAndEnterPriceDo(String enteredPrice) {
        WebElement priceDo = driver.findElement(By.xpath(price));
//        waitShowElement(proizvodSamsung);
        priceDo.sendKeys(enteredPrice);
    }

    public void searchAndClickSize(String value) {
//        Actions actions = new Actions(driver);
        WebElement clickRazr = driver.findElement(By.xpath(String.format(razreshenie, value)));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickRazr);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickRazr);
//        actions.moveToElement(clickRazr).click().build().perform();
    }

    public void searchAndClickMinDiagonal(String value) {
//        Actions actions = new Actions(driver);
        WebElement cklickMinRazr = driver.findElement(By.xpath(String.format(diagonalMin, value)));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cklickMinRazr);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", cklickMinRazr);
//        actions.moveToElement(cklickMinRazr).click().build().perform();
    }

    public void searchAndClickMaxDiagonal(String value) {
        Actions actions = new Actions(driver);
        WebElement cklickRazr = driver.findElement(By.xpath(String.format(diagonalMax, value)));
        actions.moveToElement(cklickRazr).click().build().perform();
    }
}
