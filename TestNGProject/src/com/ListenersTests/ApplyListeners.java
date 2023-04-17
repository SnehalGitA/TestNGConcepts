package com.ListenersTests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ApplyListeners implements ITestListener{
	
	public void onStart(ITestContext arg) {
		
		System.out.println("onStart  : "+arg.getName());
	}
	
	public void onTestStart(ITestResult arg) {
		System.out.println("OnTestStart  : "+arg.getName());
	}
	
	public void onTestSuccess(ITestResult arg) {
		System.out.println("OnTestSuccess  : "+arg.getName());
	}
	public void onTestFailure(ITestResult arg) {
		System.out.println("OnTestFailure  : "+arg.getName());
	}
	public void onTestSkipped(ITestResult arg) {
		System.out.println("OnTestSkipped  : "+arg.getName());
	}
	
	public void onTestFinish(ITestResult arg) {
		System.out.println("OnTestFinish  : "+arg.getName());
	}
	

}
