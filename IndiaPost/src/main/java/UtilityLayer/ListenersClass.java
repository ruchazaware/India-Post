package UtilityLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ListenersClass extends BaseClass implements ITestListener{
	ExtentReports  extentReports;
	ExtentTest extenttest;

	@Override
	public void onStart(ITestContext context) {
		extentReports =new ExtentReports();
		ExtentSparkReporter abc =new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\a1.html");
		extentReports.attachReporter(abc);
		
	}
	@Override
	public void onTestStart(ITestResult result) {
String methodname= result.getMethod().getMethodName();
		
		extenttest = extentReports.createTest(methodname);	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extenttest.log(Status.PASS, result.getMethod().getMethodName());		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		extenttest.log(Status.FAIL, result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extenttest.log(Status.SKIP, result.getMethod().getMethodName());
	}

	

	@Override
	public void onFinish(ITestContext context) {
		extentReports.flush();
	}

}
