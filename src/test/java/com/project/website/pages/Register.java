package com.project.website.pages;

import org.openqa.selenium.By;

import drivers.DriverManager;

public class Register {
	
	private By textfirstName = By.id("first_name");
	private By textlastName = By.id("last_name");
	private By textdob = By.id("dob");
	private By textstreet = By.id("street");
	private By textpostal_code = By.id("postal_code");
	private By textstate = By.id("state");
	private By selectcountry = By.id("country");
	private By textphone = By.id("phone");
	private By textemail = By.id("email");
	private By textpassword = By.id("password");
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

	
	

	
}
