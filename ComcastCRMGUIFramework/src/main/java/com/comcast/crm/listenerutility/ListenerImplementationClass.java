package com.comcast.crm.listenerutility;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;

public class ListenerImplementationClass extends BaseClass implements ITestListener, ISuiteListener {
	
	public ExtentReports report;
	public static ExtentTest test;
	public ExtentSparkReporter spark;
	
	@Override
	public void onStart(ISuite suite) {
		
		System.out.println("Report configuration");
		// spark report config
		String time = new Date().toString().replace(" ", "_").replace(":", "_");
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReport/report_"+time+".html");
		spark.config().setDocumentTitle("CRM Test suite results");
		spark.config().setReportName("CRM Report");
		spark.config().setTheme(Theme.DARK);

		// add Env information and create test
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "windows-10");
		report.setSystemInfo("BROWSER", "CHROME-100");

	}
	
	@Override
	public void onFinish(ISuite suite) {
		
		System.out.println("Report backUP");
		report.flush();

	}
	
	@Override
	public void onTestFailure(ITestResult result) {

String testName = result.getMethod().getMethodName();
		
		TakesScreenshot eDriver =(TakesScreenshot)BaseClass.sdriver;
		String filepath = eDriver.getScreenshotAs(OutputType.BASE64);
		
		String time = new Date().toString().replace(" ", "_").replace(":", "_");
		test.addScreenCaptureFromBase64String(filepath, testName+"_"+time);
		 test.log(Status.FAIL, result.getMethod().getMethodName()+"==> FAILED <==");
	
		
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		
	//	System.out.println("===========>" + result.getMethod().getMethodName() + "<=====START=====");
		 test = report.createTest(result.getMethod().getMethodName());
		 UtilityClassObject.setTest(test);
		 test.log(Status.INFO, result.getMethod().getMethodName()+"==> STARTED <==");	
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
//		System.out.println("===========>" + result.getMethod().getMethodName() + "<=====END=====");
		 test.log(Status.PASS, result.getMethod().getMethodName()+"==> COMPLETED <==");

	
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}
}
