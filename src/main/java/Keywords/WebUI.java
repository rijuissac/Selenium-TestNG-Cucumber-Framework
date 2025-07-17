package Keywords;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import constants.FrameworkConstants;
import utils.LogUtils;
import utils.PropertyFileReader;
import drivers.DriverManager;

public class WebUI {
	
	
	public static void getUrl(String URL)
	{
		DriverManager.getDriver().get(URL);
		
	}

	public static String getCurrentURL() {
		
		return DriverManager.getDriver().getCurrentUrl();
	}
	
	
	public static void doImplicityWait()
	{
		System.out.println("Before Impplcit wait time:" + LocalDateTime.now());
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(FrameworkConstants.WAIT_PAGE_LOADED));
		System.out.println("After Impplcit wait time:" + LocalDateTime.now());
	}
	
	
	public static void waitForPageLoaded() {
        
		System.out.println("Current URL:"+ DriverManager.getDriver().getCurrentUrl());
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.WAIT_PAGE_LOADED));
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();

        // wait for Javascript to loaded
        ExpectedCondition<Boolean> jsLoad = driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");

        //Get JS is Ready
        boolean jsReady = js.executeScript("return document.readyState").toString().equals("complete");

        System.out.println("JsReady: "+jsReady);
        //Wait Javascript until it is Ready!
        if (!jsReady) {
            //LogUtils.info("Javascript in NOT Ready!");
            //Wait for Javascript to load
            try {
                wait.until(jsLoad);
            } catch (Throwable error) {
            	LogUtils.error("Timeout waiting for page load. (" + FrameworkConstants.WAIT_PAGE_LOADED + "s)");
                Assert.fail("Timeout waiting for page load. (" + FrameworkConstants.WAIT_PAGE_LOADED + "s)");
            }
        }
    }

}
