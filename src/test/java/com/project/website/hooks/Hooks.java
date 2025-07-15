package com.project.website.hooks;

import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.Parameters;

import com.project.runners.BaseRunner;

import drivers.BrowserConfig;
import drivers.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.LogUtils;
import utils.PropertyFileReader;

public class Hooks {

	void Hooks() {

	}

	@BeforeAll
	public static void beforeAll() {
		LogUtils.info("====== BEFORE ALL =======");
		LogUtils.info("Loading Property File");

		PropertyFileReader.loadPropertyFile();
		LogUtils.info("");
		
	}

	@Before
	public static void beforeScenario() {
		LogUtils.info("====== BEFORE SCENARIO======");
		System.out.println(BaseRunner.getBrowser());
		DriverManager.createDriverInstance(BaseRunner.getBrowser());
	}

	@After
	public static void afterScenario()
	{
		LogUtils.info("====== AFTER SCENARIO =======");
		DriverManager.quit();
	}
	
}
