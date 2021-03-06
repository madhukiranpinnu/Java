package Hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hooks {
	public WebDriver driver=null;
	@Before(value="@madhu",order=0)
	public void BeforeApp() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Before(value="@madhu",order=1)
	public void Before() {
		driver.manage().window().fullscreen();
	}
	@Before(value="@madhu",order=2)
	public void Before1() {
		driver.manage().window().maximize();
	}
	@After(order=0)
	public void AfterApp() {
		driver.quit();
	}
	@After(order=1)
	public void AfterApp1() {
		System.out.println("app1");
	}
	@After(order=2)
	public void AfterApp2() {
		System.out.println("app2");
	}
	@BeforeStep
	public void BeforeStep() {
		System.out.println("Before steps");
	}
	@AfterStep
	public void AfterSteps() {
		System.out.println("After steps");
	}
	@Given("I am on fb page")
	public void i_am_on_fb_page() {
	    driver.get("https://www.facebook.com/");
	}

	@Then("I had given id")
	public void i_had_given_id() {
	    driver.findElement(By.id("email")).sendKeys("7013918149");
	}
	@Then("I had given pass")
	public void i_had_given_pass() {
	    driver.findElement(By.id("pass")).sendKeys("madhu@123");
	}
	@Then("I am on homepage")
	public void i_am_on_homepage() throws InterruptedException {
	    Thread.sleep(3000);
	}



}
