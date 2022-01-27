import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Assertions {
    WebDriver driver;
    static ExtentReports report;
    static ExtentTest test;
    @BeforeClass
    void Setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        report= new ExtentReports("C:\\Users\\madhu\\CucumberFrameworkwithFeatures\\Testng\\report\\report.html",false);
        test=report.startTest("Madhu Extent Demo");

        driver.get("https://www.orangehrm.com/");
    }
    @Test
    void Logo(){
        test.log(LogStatus.INFO,"Testcase validation started");
        WebElement logo=driver.findElement(By.xpath("/html/body/nav/div/div[1]/a/img"));
        Assert.assertTrue(logo.isDisplayed(),"Logo is not Displayed");
        //Assert.assertFalse(logo.isDisplayed());
        test.log(LogStatus.PASS,"pass");
    }
    @Test
    void Title() throws IOException {
        test.log(LogStatus.INFO,"Testcase validate title");
        String title= driver.getTitle();
        System.out.println(title);
        test.log(LogStatus.WARNING,"you are validating title");
        Assert.assertEquals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS",title,"title is different");
        test.log(LogStatus.FAIL,test.addScreenCapture(CaptureScreenshot(driver)));
    }
    @AfterClass
    void Teardown(){
        driver.quit();
        report.endTest(test);
        report.flush();
    }

    public static String CaptureScreenshot(WebDriver driver) throws IOException {
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destination=new File("C:\\Users\\madhu\\CucumberFrameworkwithFeatures\\Testng\\test-output\\Image\\Testing"+System.currentTimeMillis()+".png");
        FileUtils.copyFile(src,destination);
        String absolutepath=destination.getAbsolutePath();
        return absolutepath;
    }
}
