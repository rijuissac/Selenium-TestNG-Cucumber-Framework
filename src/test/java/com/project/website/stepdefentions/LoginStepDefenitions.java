package com.project.website.stepdefentions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefenitions {
	
	
	@Given("user navigate to  url")
	public void user_navigate_to_url() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Navigated to URL");
	}

	@When("^user enters username (.+) and password (.+)$")
	public void user_enters_username_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user:"+ username);
	    System.out.println("password:"+password);
	}

	@When("clicks on submit")
	public void clicks_on_submit() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Click on submit");
	}

	@Then("user sucessfully lands to dashboard page")
	public void user_sucessfully_lands_to_dashboard_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Success");
	}

}
