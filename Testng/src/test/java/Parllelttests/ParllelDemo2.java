package Parllelttests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParllelDemo2 {
    WebDriver driver;
    @Test
    void LoginTest(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.orangehrm.com/");
        WebElement logo=driver.findElement(By.xpath("/html/body/nav/div/div[1]/a/img"));
        Assert.assertTrue(logo.isDisplayed());

    }
    @Test
    void TitleAssertTest(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.orangehrm.com/");
        String title= driver.getTitle();
        Assert.assertEquals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS",title);

    }
    @AfterMethod
    void Teardown(){
        driver.quit();
    }
}
