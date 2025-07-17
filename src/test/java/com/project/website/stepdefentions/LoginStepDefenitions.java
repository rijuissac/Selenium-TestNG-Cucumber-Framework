package com.project.website.stepdefentions;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.project.website.hooks.TestContext;
import com.project.website.pages.Dashboard;
import com.project.website.pages.SignIn;

import Keywords.WebUI;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.PropertyFileReader;

public class LoginStepDefenitions {
	
	SignIn signInPage;
	Dashboard dashboard;
	
	
	public LoginStepDefenitions()
	{
		System.out.println("In Contructor");
	}
	
	@Given("user navigate to url for login")
	public void user_navigate_to_url_for_login() {
	 
	   WebUI.getUrl(PropertyFileReader.getProperty("URL_LOGIN"));
	   WebUI.waitForPageLoaded();
	   
	}

	@When("^user enters username (.+) and password (.+)$")
	public void user_enters_username_and_password(String username, String password) {
	   
		signInPage = TestContext.getSignInPage();
		signInPage.setEmail(username);
		signInPage.setPassword(password);
	    System.out.println("user:"+ username);
	    System.out.println("password:"+password);
	}

	@When("user clicks on submit")
	public void clicks_on_submit() {
	    // Write code here that turns the phrase above into concrete actions
		//WebUI.doImplicityWait();
		dashboard = signInPage.click_button_submit();
		dashboard = signInPage.click_button_submit();
		//WebUI.doImplicityWait();
		System.out.println("Click on submit");
	    WebUI.waitForPageLoaded();
	}

	@Then("user successfully lands to dashboard page with url {string}")
	public void user_successfully_lands_to_dashboard_page_with_url(String expectedURL) {
	    // Write code here that turns the phrase above into concrete actions
	    WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
	    	wait.until(ExpectedConditions.urlToBe(expectedURL));
				Assert.assertEquals(expectedURL, WebUI.getCurrentURL() );
	    System.out.println("Success");
	}

}
