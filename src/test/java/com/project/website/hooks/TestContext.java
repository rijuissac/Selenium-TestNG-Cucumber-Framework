package com.project.website.hooks;

import com.project.website.pages.SignIn;

public class TestContext {
	
	public TestContext() {
		
	}
	
	private static SignIn signInPage;

	public static SignIn getSignInPage()
	{
	
		if(signInPage == null) {
			signInPage = new SignIn();
		}
		return signInPage;
	}
	
}
