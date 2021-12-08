package Stepdeff;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class First {
	@Given("I had open eclipse")
	public void i_had_open_eclipse() {
	   System.out.println("I had open eclipse") ;
	}

	@Then("I had written code")
	public void i_had_written_code() {
		System.out.println("I had written code") ;
	}
	@When("I close application")
	public void i_close_application() {
		System.out.println("I had close application") ; 
	}



}
