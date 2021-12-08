package Stepdeff;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlternateText {
	@Given("I am on pet shop application")
	public void i_am_on_pet_shop_application() {
	    System.out.println("I am on pet shop");
	}

	@Then("I purchased a dog/cat/horse")
	public void i_purchased_a_dog() {
	    System.out.println("I am dog cat horse");
	}

	
	@When("I close the application")
	public void i_close_the_application() {
	    System.out.println("I close application");
	}



}
