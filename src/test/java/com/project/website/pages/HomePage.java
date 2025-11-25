package com.project.website.pages;

import org.openqa.selenium.By;

import drivers.DriverManager;

public class HomePage {
	

	    // ======= Locators =======
	    private By loginLink = By.xpath("//a[contains(.,'Sign in')]");
	    private By logo = By.cssSelector("a.navbar-brand");
	    private By contactLink = By.xpath("//a[contains(.,'Contact')]");
	    private By cartButton = By.xpath("//a[contains(@href, '/cart')]");
	   


	    public String getPageTitle() {
	        return DriverManager.getDriver().getTitle();
	    }

	    public boolean isLogoDisplayed() {
	        return DriverManager.getDriver().findElement(logo).isDisplayed();
	    }

	    public SignIn clickLogin() {
	        DriverManager.getDriver().findElement(loginLink).click();
	        return new SignIn();
	    }


	    public void clickContact() {
	        DriverManager.getDriver().findElement(contactLink).click();
	    }

	    public void clickCart() {
	        DriverManager.getDriver().findElement(cartButton).click();
	    }
	
}
