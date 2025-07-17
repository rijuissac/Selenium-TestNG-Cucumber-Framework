package com.project.website.stepdefentions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import com.project.website.hooks.TestContext;

import Keywords.WebUI;
import constants.FrameworkConstants;
import io.cucumber.java.en.And;

public class RegistrationStepDefenitions {
	
	
	
	@When("user is in home page")
	public void user_is_in_home_page() {
	   
		WebUI.getUrl(FrameworkConstants.URL_HOME);
		
	}

	@When("user clicks on the sign in field")
	public void user_clicks_on_the_sign_in_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user click on Register your account hyperlink")
	public void user_click_on_register_your_account_hyperlink() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to registration url {string}")
	public void user_is_navigated_to_registration_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters registration details")
	public void user_enters_registration_details(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on the Register button")
	public void user_clicks_on_the_register_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("application navigates to login page URL {string}")
	public void application_navigates_to_login_page_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user sees an error message {string}")
	public void user_sees_an_error_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user sees an error message {string} & {string}")
	public void user_sees_an_error_message(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
