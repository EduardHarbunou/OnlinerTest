package tests;

import org.testng.annotations.Test;
import pages.CatalogPage;
import pages.HomePage;

public class TestOnliner extends BaseTest {
   @Test
   public void openOnliner() {
        HomePage homePage = new HomePage();
        homePage.searchAndClickCatalog("Каталог");
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.searchAndClickElectronika("Электроника");
        catalogPage.navigateToTelevidenie("Телевидение");

    }












}
