package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class CatalogPage extends Browser {

    private final String menuItem = "//span[contains(text(), '%s')]";
    private final String subMenuItem = "//div[contains(@class, 'catalog-navigation-list__aside-title') and contains(text(), '%s')]";

    private final String item = "//div[contains(text(), '%s')]/following-sibling::div//span[contains(text(),'%s')]";

    public void searchAndClickElectronika(String electronika) {
        WebElement categoryElectronika = driver.findElement(By.xpath(String.format(menuItem, electronika)));
//        waitShowElement(categoryElectronika);
        categoryElectronika.click();
    }

    public void navigateToTelevidenie(String telAndVid) {
        Actions actions = new Actions(driver);
        WebElement telAndVideo = driver.findElement(By.xpath(String.format(subMenuItem, telAndVid)));
        waitShowElement(telAndVideo);
        actions.moveToElement(telAndVideo).perform();
    }

    public void searchAndClickTelevizori(String telAndVid, String tel) {
        WebElement televizor = driver.findElement(By.xpath(String.format(item, telAndVid, tel)));
        waitShowElement(televizor);
        televizor.click();
    }
}
