package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CatalogPage extends Browser {

    private final String menuItem = "//span[contains(text(), '%s')]";
    private final String subMenuItem = "//div[contains(@class, 'catalog-navigation-list__aside-title') and contains(text(), '%s')]";
    public void searchAndClickElectronika(String electronika) {
        WebElement categoryElectronika = driver.findElement(By.xpath(String.format(menuItem, electronika)));
        waitShowElement(categoryElectronika);
        categoryElectronika.click();
    }

    public void navigateToTelevidenie(String tel) {
        WebElement telAndVideo = driver.findElement(By.xpath(String.format(subMenuItem, tel)));
        waitShowElement(telAndVideo);
        telAndVideo.click();
    }

}
