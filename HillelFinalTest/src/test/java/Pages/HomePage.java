package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement textSearch (){
        return driver.findElement(By.xpath("//input[@id='content_Search1_Keyword']"));
    }

    public WebElement citySearch (){
        return driver.findElement(By.xpath("//input[@id='content_vacSearch_CityPickerWork_inpCity']"));
    }

    public WebElement searchLink (){
        return driver.findElement(By.xpath("//a[@id='content_vacSearch_lnkSearch']"));
    }

}
