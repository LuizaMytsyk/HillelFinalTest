package Tests;

import Pages.HomePage;
import Pages.SearchResultsPage;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class AllTests {


    @Test

    public void SearchInLviv() {


        WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        driver.get("https://rabota.ua/Украина");


        homePage.textSearch().click();
        homePage.textSearch().sendKeys(Keys.BACK_SPACE);
        homePage.textSearch().sendKeys("qa Automation");
        homePage.citySearch().clear();
        homePage.citySearch().sendKeys("Днепр");
        homePage.searchLink().click();

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);

        searchResultsPage.listPrinting();


    }

    }










