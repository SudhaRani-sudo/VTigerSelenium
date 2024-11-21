package genericUtility;

//import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener {

	ExtentReports report;
	ExtentTest test;
	javaUtility jUtil=new javaUtility();
	String dateTimeStamp=jUtil.getCalenderDetails("dd-MM-YYYY  hh-mm-ss");
	
	@Override
	public void onTestStart(ITestResult result) {
		
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"execution started");
		
		test= report.createTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"execution passed");
		
		test.log(Status.PASS,methodName+"execution passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"executionFailed");
		
		test.log(Status.FAIL,methodName+"execution failed");
		
		//capturing screenshot when scripts gets failed
		SeleniumUtility sUtil=new  SeleniumUtility();
		
		
		String screenshotName=methodName+dateTimeStamp;
		try {
			String path=sUtil.captureScreenshot(BaseClass.sDriver, screenshotName);
			test.addScreenCaptureFromPath(path);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	@Override
	public void onTestSkipped(ITestResult result) {
		
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"execution skipped");
		
		test.log(Status.SKIP,methodName+"execution skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Suite execution started");
		
		ExtentSparkReporter reporter= new ExtentSparkReporter(".\\Extent Reports\\Report"+dateTimeStamp+".html");
		reporter.config().setDocumentTitle(dateTimeStamp);
		reporter.config().setReportName(dateTimeStamp);
		reporter.config().setTheme(Theme.DARK);
		
		report= new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Base URL", "http://localhost:8888/");
		report.setSystemInfo("Base OS", "Windows");
		report.setSystemInfo("Base Browser", "Chrome");
		report.setSystemInfo("ReporterName", "Sudha");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("Suite execution finished");
		report.flush();
	}

	
}
