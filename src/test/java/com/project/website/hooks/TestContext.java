package com.project.website.hooks;

import com.project.website.pages.HomePage;
import com.project.website.pages.SignIn;

public class TestContext {
	
	public TestContext() {
		
	}
	
	private SignIn signInPage;
	private HomePage homepage;

	public  SignIn getSignInPage()
	{
	
		if(signInPage == null) {
			signInPage = new SignIn();
		}
		return signInPage;
	}

	public HomePage getHomePage() {
		if(homepage == null) {
			homepage = new HomePage();
		}
		return homepage;

	}
	
}
