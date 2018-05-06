package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage {

    private WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"fd-f-left\"]"));

    ArrayList<String> listOfFinalStrings;

    String city;

    String companyName;

    String vacancyName;

    String FinalString;


    public  ArrayList<String> listPrinting() {

        for (int i = 0; i < 5; i++) {

            city = list.get(i).findElement(By.xpath("")).getText();

            companyName = list.get(i).findElement(By.xpath("")).getText();

            vacancyName = list.get(i).findElement(By.xpath("")).getText();

            FinalString = city + companyName + vacancyName;

            listOfFinalStrings.add(FinalString);

        }


    }

}
