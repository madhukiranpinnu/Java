import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

public class sparkextentreport {
    @Test
    void Tester(){
        ExtentReports extentReports=new ExtentReports();
        ExtentSparkReporter spark=new ExtentSparkReporter("index.html");
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("madhu extent reports");
        spark.config().setReportName("madhu");
        extentReports.attachReporter(spark);
        ExtentTest test=extentReports.createTest("Login setup");
        test.info("Started test");
        test.pass("test had passed successfully");
        test.info("url added");
        test.fail("test had failed");
        extentReports.flush();

    }


}
