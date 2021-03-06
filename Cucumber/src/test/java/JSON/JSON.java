package JSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSON {
	public WebDriver driver;
	@BeforeClass
	public void initial_Setup() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterClass
	public void Teardown() {
		driver.quit();
	}
	@DataProvider(name="dp")
	public String[] readJSON() throws IOException, ParseException{
		JSONParser jparser=new JSONParser();
		FileReader reader=new FileReader(".\\C:\\Users\\madhu\\CucumberFrameworkwithFeatures\\Cucumber\\JSONFILES\\Testdata.json");
		Object object=jparser.parse(reader);
		JSONObject jobject=(JSONObject)object;
		JSONArray jarray=(JSONArray) jobject.get("logins");
		String arr[]=new String [jarray.size()];
		for(int i=0;i<jarray.size();i++) {
			JSONObject logins=(JSONObject) jarray.get(i);
			String user=(String) logins.get("id");
			String password=(String) logins.get("pass");
			arr[i]=user+","+password;
		}
		return arr;
	}
	@Test(dataProvider="dp")
	void Login(String data) {
		String  user[]=data.split(",");
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(user[0]);
		driver.findElement(By.id("pass")).sendKeys(user[1]);
		driver.findElement(By.xpath("//*[@id=\"u_0_h_PT\"]")).click();
	}
}
