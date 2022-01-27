import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
    WebDriver driver;
    @BeforeClass
    @Parameters({"url"})
    void Setup(String app){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(app);
    }
    @Test
    void Logo(){
        WebElement logo=driver.findElement(By.xpath("/html/body/nav/div/div[1]/a/img"));
        Assert.assertTrue(logo.isDisplayed(),"Logo is not Displayed");
        //Assert.assertFalse(logo.isDisplayed());
    }
    @Test
    void Title(){
        String title= driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS",title,"title is different");
    }
    @AfterClass
    void Teardown(){
        driver.quit();
    }
}
