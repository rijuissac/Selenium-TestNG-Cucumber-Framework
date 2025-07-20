package com.project.website.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import Keywords.WebUI;
import drivers.DriverManager;
import utils.PropertyFileReader;

public class SignIn {

	private By field_email = By.id("email");
	private By field_password = By.id("password");
	private By button_submit = By.xpath("//input[@class='btnSubmit']");
	private By register_account = By.linkText("Register your account");
	
	public void setEmail(String email)
	{
		DriverManager.getDriver().findElement(field_email).sendKeys(email);
	}
	
	public void setPassword(String password)
	{
		DriverManager.getDriver().findElement(field_password).sendKeys(password);
	}
	
	public Register click_register_account()
	{
		DriverManager.getDriver().findElement(register_account).click();
		return new Register();
	}
	
	public Dashboard click_button_submit()
	{
		System.out.println("READY FOR SUBMIT");
		//DriverManager.getDriver().findElement(button_submit).click();
		Actions action = new Actions(DriverManager.getDriver());
		action.moveToElement(DriverManager.getDriver().findElement(button_submit)).click().build().perform();
		return new Dashboard();
	}
}
