package com.Listeners;

import org.testng.annotations.Test;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import utility.ExtentManager;
import utility.ExtentTestManager;

public class ListeningTest implements ITestListener {
@Test
public void testcheck() {}

@Override
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	//ITestListener.super.onTestStart(result);
	System.out.println(("*** Running test method " + result.getMethod().getMethodName() + "..."));
	ExtentTestManager.startTest(result.getMethod().getMethodName());
}

@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	//ITestListener.super.onTestSuccess(result);
	System.out.println("*** Executed " + result.getMethod().getMethodName() + " test successfully...");
	ExtentTestManager.getTest().log(Status.PASS, "Test passed");
}

@Override
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	//ITestListener.super.onTestFailure(result);
	System.out.println("*** Test execution " + result.getMethod().getMethodName() + " failed...");
	ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
}

@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	//ITestListener.super.onTestSkipped(result);
	System.out.println("*** Test " + result.getMethod().getMethodName() + " skipped...");
	ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped");
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
}

@Override
public void onTestFailedWithTimeout(ITestResult result) {
	// TODO Auto-generated method stub
	//ITestListener.super.onTestFailedWithTimeout(result);
}

@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	//ITestListener.super.onStart(context);
	System.out.println("*** Test Suite " + context.getName() + " started ***");
}

@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	//ITestListener.super.onFinish(context);
	System.out.println(("*** Test Suite " + context.getName() + " ending ***"));
	ExtentTestManager.endTest();
	ExtentManager.getInstance().flush();
}

}
