package tests;

import org.testng.annotations.Test;
import pages.CatalogPage;
import pages.HomePage;
import pages.TVPage;

public class TestOnliner extends BaseTest {
   @Test
   public void openOnliner() {
        HomePage homePage = new HomePage();
        homePage.searchAndClickCatalog("Каталог");
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.searchAndClickElectronika("Электроника");
        catalogPage.navigateToTelevidenie("Телевидение");
        catalogPage.searchAndClickTelevizori("Телевидение", "Телевизоры");
        TVPage tvPage = new TVPage();
        tvPage.searchAndClickSamsung("Samsung");
        tvPage.searchAndEnterPriceDo("1500");
        tvPage.searchAndClickSize("1920x1080");
        tvPage.searchAndClickMinDiagonal("40\"");
        tvPage.searchAndClickMaxDiagonal("50\"");
        System.out.println();
    }












}
