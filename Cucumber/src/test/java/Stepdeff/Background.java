package Stepdeff;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background {
	@When("I got mazza")
	public void i_got_mazza() {
	    System.out.println("I got mazza");
	}

	@Then("I close store")
	public void i_close_store() {
	    System.out.println("I close the store");

	}

	@When("I got sprite")
	public void i_got_sprite() {
	    System.out.println("I got sprite");
 
	}

	@Then("I close stores")
	public void i_close_stores() {
	    System.out.println("I close the stores");
 
	}
	@Given("I am Cooldrink shop")
	public void i_am_cooldrink_shop() {
	    System.out.println("I am on cooldrink shop");
	}


}
