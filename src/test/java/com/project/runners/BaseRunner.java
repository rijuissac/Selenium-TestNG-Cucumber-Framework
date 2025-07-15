package com.project.runners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseRunner extends AbstractTestNGCucumberTests {

	private static final ThreadLocal<String> threadBrowser = new ThreadLocal<>();

    @Parameters("browser")
    @BeforeClass
    public void setupBrowser(String browser) {
        threadBrowser.set(browser.toLowerCase());
    }

    public static String getBrowser() {
        return threadBrowser.get();
    }

    @AfterClass(alwaysRun = true)
    public void clearBrowser() {
        threadBrowser.remove();
    }
}
