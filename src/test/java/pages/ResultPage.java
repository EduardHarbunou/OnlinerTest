package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultPage extends Browser {
    private final String title = "//span[@data-bind='html: product.extended_name || product.full_name']";
    private final String price = "//span[@data-bind=\"html: $root.format.minPrice($data.prices, 'BYN')\"]";

    public boolean checkProizvoditelResult(String proizvoditelValue) {
        List<WebElement> elements = driver.findElements(By.xpath(title));
        for (WebElement element : elements) {
            if (!element.getText().contains(proizvoditelValue)) {
                return false;
            }
        }
        return true;
    }

    public boolean checkPriceResult(String priceValue) {
        List<WebElement> elements = driver.findElements(By.xpath(price));
        for (WebElement element : elements) {
            String str = element.getText();
            System.out.println(str);
            str = str.substring(0,str.length()-3);
            System.out.println(str);
            str = str.replace(",", ".");
            System.out.println(str);
            double actualPrice = Double.parseDouble(str);
            if (actualPrice > Integer.parseInt(priceValue)) {
                return false;
            }
        }
        return true;
    }



}
