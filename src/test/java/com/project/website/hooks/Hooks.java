package com.project.website.hooks;

import org.apache.logging.log4j.Logger;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.LogUtils;

public class Hooks {

	void Hooks() {

	}

	@BeforeAll
	public static void beforeAll() {
		LogUtils.info("====== BEFORE ALL =======");

	}

	@Before
	public static void beforeScenario() {
		LogUtils.info("====== BEFORE SCENARIO======");
	}

	@After
	public static void afterScenario()
	{
		LogUtils.info("====== AFTER SCENARIO =======");
	}
	
}
