package com.project.website.stepdefentions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.util.Map;

import org.testng.Assert;

import com.project.website.hooks.TestContext;
import com.project.website.pages.HomePage;
import com.project.website.pages.Register;
import com.project.website.pages.SignIn;

import Keywords.WebUI;
import constants.FrameworkConstants;
import io.cucumber.java.en.And;

public class RegistrationStepDefenitions {
	
	HomePage homepage;
	SignIn signin;
	Register registerPage;
	TestContext textcontext;
	
	public RegistrationStepDefenitions()
	{
		textcontext = new TestContext();
	}
	
	@When("user is in home page")
	public void user_is_in_home_page() {
	   
		WebUI.getUrl(FrameworkConstants.URL_HOME);
		WebUI.waitForPageLoaded();
		
	}

	@When("user clicks on the sign in field")
	public void user_clicks_on_the_sign_in_field() {
		
		homepage = textcontext.getHomePage();
		signin= homepage.clickLogin();
		WebUI.waitForPageLoaded();
	
	}

	@When("user click on Register your account hyperlink")
	public void user_click_on_register_your_account_hyperlink() {
		WebUI.waitForPageLoaded();
		registerPage =signin.click_register_account();
		
	}

	@Then("user is navigated to registration url {string}")
	public void user_is_navigated_to_registration_url(String expectedURL) {
	   
		Assert.assertEquals(expectedURL, WebUI.getCurrentURL());
	}

	@When("user enters registration details")
	public void user_enters_registration_details(Map<String,String> dataTable) {
	  
		System.out.println("Data Table: "+dataTable.get("firstname"));
		registerPage.setTextfirstName(dataTable.get("firstname"));
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
