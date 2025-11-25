package com.project.runners;

import io.cucumber.testng.CucumberOptions;
import utils.LogUtils;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import drivers.BrowserConfig;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(tags="@regression",features= {"src/test/resources/feature"},
glue= {"com.project.website.stepdefentions","com.project.website.hooks"},
plugin= {"pretty","html:target/report.html","rerun:target/rerun.txt","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunParallelAllScenarios extends BaseRunner {
	
	/* @Parameters("browser")
	    @BeforeClass
	    public void setBrowser(String browser) {
	    	System.out.println("Browser: "+ browser);
	    	BrowserConfig.setBrowser(browser);
	    	System.out.println(BrowserConfig.getBrowser());
	    }

	    @AfterClass
	    public void clearBrowser() {
	    	BrowserConfig.clear();
	    }*/
	
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
	
	@BeforeSuite
	public static void beforeSuite()
	{
		LogUtils.info("====== BEFORE SUITE =======");
		LogUtils.info("====== BEFORE SUITE 1=======");
	}


   
    
}
