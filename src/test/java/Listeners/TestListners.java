package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;


public class TestListners implements ITestListener {
	
	
	 @Override
	    public void onTestStart(ITestResult result) {
	        System.out.println("Test started: " + result.getMethod().getMethodName() );
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("Test success: " + result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        System.out.println("Test failed: " + result.getName());
	        // Take screenshot, log error, etc.
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("Test skipped: " + result.getName());
	    }

}
