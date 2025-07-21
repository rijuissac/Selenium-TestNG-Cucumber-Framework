package com.project.website.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import drivers.DriverManager;

public class Register {
	
	private By textfirstName = By.id("first_name");
	private By textlastName = By.id("last_name");
	private By textdob = By.id("dob");
	private By textstreet = By.id("street");
	private By textpostal_code = By.id("postal_code");
	private By textstate = By.id("state");
	private By textcity = By.id("city");
	private By selectcountry = By.id("country");
	private By textphone = By.id("phone");
	private By textemail = By.id("email");
	private By textpassword = By.id("password");
	private By button_register = By.xpath("//button[@class='btnSubmit mb-3']");
	private By error_messages = By.xpath("//div[@class='alert alert-danger mt-3']");
	
	
	public void setTextfirstName(String firstName) {
		DriverManager.getDriver().findElement(textfirstName).sendKeys(firstName);
	}
	public void setTextlastName(String lastName) {
		DriverManager.getDriver().findElement(textlastName).sendKeys(lastName);
	}
	public void setTextdob(String dob) {
		DriverManager.getDriver().findElement(textdob).sendKeys(dob);
	}
	public void setTextstreet(String street) {
		DriverManager.getDriver().findElement(textstreet).sendKeys(street);
	}
	public void setTextpostal_code(String postal_code) {
		DriverManager.getDriver().findElement(textpostal_code).sendKeys(postal_code);	
	}
	public void setTextCity(String city) {
		DriverManager.getDriver().findElement(textcity).sendKeys(city);	
	}
	
	public void setTextstate(String state) {
		DriverManager.getDriver().findElement(textstate).sendKeys(state);;
	}
	public void setSelectcountry(String country) {
		DriverManager.getDriver().findElement(selectcountry).sendKeys(country);
	}
	public void setTextphone(String phone) {
		DriverManager.getDriver().findElement(textphone).sendKeys(phone);
	}
	public void setTextemail(String email) {
		DriverManager.getDriver().findElement(textemail).sendKeys(email);
	}
	public void setTextpassword(String password) {
		DriverManager.getDriver().findElement(textpassword).sendKeys(password);
	}

	public void setTextCountry(String country) {
		
		Select selectCountry = new Select( DriverManager.getDriver().findElement(selectcountry));
		selectCountry.selectByValue(country);
	}
	
	public List<String> getErrorMessages() {
		
		
		List<String> errorMessages = new ArrayList<String>();
		List<WebElement> error_elements = DriverManager.getDriver().findElements(error_messages);	
		for (WebElement error_element : error_elements)
		{
			errorMessages.add(error_element.getText());
		}
		
		return errorMessages;
	}
	
	
	public void register_button_click()
	{
		DriverManager.getDriver().findElement(button_register).click();
	}
	
}
