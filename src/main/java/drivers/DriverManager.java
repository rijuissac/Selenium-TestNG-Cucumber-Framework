package drivers;

import java.lang.annotation.Annotation;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.LogUtils;
import utils.PropertyFileReader;
import constants.FrameworkConstants;


public class DriverManager {

	private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();


	public static void createDriverInstance(String browser) {
		
		//System.out.println(BrowserConfig.getBrowser());

		System.out.println("===================================================================="+browser);
		String browser_selected = browser != null ? browser.toUpperCase()
				: PropertyFileReader.getProperty(FrameworkConstants.browser).toUpperCase();
		LogUtils.info("Broweser Selected: " + browser_selected);

		driver.set(ThreadGuard.protect(BrowserFactory.valueOf(browser_selected).createDriver()));
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds( 30));
	}
	
	
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	
	public static void quit()
	{
		 if (DriverManager.getDriver() != null){
	            DriverManager.getDriver().quit();
	        }
	}
}


