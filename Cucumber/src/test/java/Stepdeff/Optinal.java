package Stepdeff;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Optinal {
	@Given("I am on candy shop")
	public void i_am_on_candy_shop() {
	    System.out.println("I am on candie shop");
	}


	

	@Then("I had bought {int} candie(s)")
	public void i_had_bought_candies(Integer int1) {
		System.out.println("I bought  candie/s shop"); 
	}


	
}
