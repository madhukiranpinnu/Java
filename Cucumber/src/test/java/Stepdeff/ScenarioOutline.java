package Stepdeff;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ScenarioOutline {
	@Given("I am on FB page also")
	public void i_am_on_fb_page_also() {
	    System.out.println("I am on FB page");
	}
	@Then("I enter (.*) and (.*)")
	public void i_enter_madhu_and_kiran(String user,String pass) {
	    System.out.println(user);
	    System.out.println(pass);
	}
	@Then("I close browser")
	public void i_close_browser() {
	    System.out.println("closed");
	}



}
