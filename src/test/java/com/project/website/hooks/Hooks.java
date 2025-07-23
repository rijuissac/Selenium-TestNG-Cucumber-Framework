package com.project.website.hooks;

import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;
import com.project.runners.BaseRunner;

import Report.ExtentManager;
import drivers.BrowserConfig;
import drivers.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utils.LogUtils;
import utils.PropertyFileReader;

public class Hooks {

	private static TestContext testcontext;
	static String browser_selected;
	
	Hooks(TestContext testContext) {
		this.testcontext = new TestContext();
	}
	
	

	@BeforeAll
	public static void beforeAll() {
		LogUtils.info("====== BEFORE ALL =======");
		LogUtils.info("Loading Property File");

		PropertyFileReader.loadPropertyFile();
		LogUtils.info("");
		
	}

	@Before
	public static void beforeScenario(Scenario scenario) {
		LogUtils.info("====== BEFORE SCENARIO======");
		System.out.println(BaseRunner.getBrowser());
		browser_selected = DriverManager.createDriverInstance(BaseRunner.getBrowser());
		
		ExtentTest extentTest = ExtentManager.getExtentReports()
	            .createTest(scenario.getName() + " [" + browser_selected + "]");
	        ExtentManager.setTest(extentTest);
	        extentTest.assignCategory(browser_selected);
	}

	@After
	public static void afterScenario(Scenario scenario)
	{
		LogUtils.info("====== AFTER SCENARIO =======");
		 ExtentTest test = ExtentManager.getTest();
	        if (scenario.isFailed()) {
	            test.fail("Scenario failed: " + scenario.getName());
	            // Optionally attach screenshot
	        } else {
	            test.pass("Scenario passed: " + scenario.getName());
	        }
	        ExtentManager.removeTest();
		
		DriverManager.quit();
	}
	
	@AfterAll
	public static void afterAll() {
		 ExtentManager.getExtentReports().flush();
	}
}
