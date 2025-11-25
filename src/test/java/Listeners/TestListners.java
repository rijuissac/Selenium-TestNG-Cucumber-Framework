package Listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class TestListners implements ITestListener,ISuiteListener {

	static int count_totalTCs = 0;
	static int count_passedTCs = 0;
	static int count_skippedTCs = 0;
	static int count_failedTCs = 0;

	@Override
	public void onTestStart(ITestResult result) {

		count_totalTCs = count_totalTCs + 1;

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		count_passedTCs = count_passedTCs + 1;
	}

	@Override
	public void onTestFailure(ITestResult result) {
		count_failedTCs = count_failedTCs + 1;
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		count_skippedTCs = count_skippedTCs + 1;
	}

	
	@Override
	public void onFinish(ISuite suite)
	{
		System.out.println("-------------------------------------");
		System.out.println("Total Testcases: "+ count_totalTCs);
		System.out.println("-------------------------------------");
	}
	
}
