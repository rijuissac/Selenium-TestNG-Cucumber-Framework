package com.project.website.stepdefentions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.project.website.hooks.TestContext;
import com.project.website.pages.HomePage;
import com.project.website.pages.Register;
import com.project.website.pages.SignIn;

import Keywords.WebUI;
import constants.FrameworkConstants;
import drivers.DriverManager;
import io.cucumber.java.en.And;

public class RegistrationStepDefenitions {

	HomePage homepage;
	SignIn signin;
	Register registerPage;
	TestContext textcontext;

	public RegistrationStepDefenitions() {
		textcontext = new TestContext();
	}

	@When("user is on the home page")
	public void user_is_on_the_home_page() {

		WebUI.getUrl(FrameworkConstants.URL_HOME);
		WebUI.waitForPageLoaded();

	}

	@When("user clicks on the Sign in link")
	public void user_clicks_on_the_sign_in_field() {

		homepage = textcontext.getHomePage();
		signin = homepage.clickLogin();
		WebUI.waitForPageLoaded();

	}

	@When("user clicks on the Register your account hyperlink")
	public void user_click_on_register_your_account_hyperlink() {
		WebUI.waitForPageLoaded();
		registerPage = signin.click_register_account();

	}

	@Then("user should be navigated to the registration URL {string}")
	public void user_is_navigated_to_registration_url(String expectedURL) {

		Assert.assertEquals(expectedURL, WebUI.getCurrentURL());
	}

	@When("user enters registration details:")
	public void user_enters_registration_details(Map<String, String> dataTable) {

		if (dataTable.containsKey("firstname")) {
			registerPage.setTextfirstName(dataTable.get("firstname"));
		}
		registerPage.setTextlastName(dataTable.get("lastname"));
		registerPage.setTextdob(dataTable.get("dob"));
		registerPage.setTextstreet(dataTable.get("street"));
		registerPage.setTextpostal_code(dataTable.get("postalCode"));
		registerPage.setTextCity(dataTable.get("city"));
		registerPage.setSelectcountry(dataTable.get("country"));
		if (dataTable.containsKey("phone")) {
			registerPage.setTextphone(dataTable.get("phone"));
		}
		if (dataTable.containsKey("email")) {
			registerPage.setTextemail(dataTable.get("email"));
		}
		registerPage.setTextstate(dataTable.get("state"));
		registerPage.setTextpassword(dataTable.get("password"));
	}

	@When("user clicks on the Register button")
	public void user_clicks_on_the_register_button() {
		// Write code here that turns the phrase above into concrete actions
		registerPage.register_button_click();
	}

	@Then("user should be navigated to the login page URL {string}")
	public void application_navigates_to_login_page_url(String expectedURL) {
		WebUI.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(expectedURL));

		Assert.assertEquals(WebUI.getCurrentURL(), expectedURL);
	}

	@Then("user should see error messages:")
	public void user_sees_an_error_message(List<String> expected_error_list) {

		List<String> expected_error_list_sortable = new ArrayList<String>();

		expected_error_list_sortable.addAll(expected_error_list);

		List<String> acutal_error_messages = registerPage.getErrorMessages();
		Collections.sort(acutal_error_messages);
		Collections.sort(expected_error_list_sortable);

		Assert.assertEquals(acutal_error_messages, expected_error_list_sortable);

	}

}
