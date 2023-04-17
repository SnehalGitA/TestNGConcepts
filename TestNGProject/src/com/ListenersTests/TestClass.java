package com.ListenersTests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.ListenersTests.ApplyListeners.class)
public class TestClass {
	
	@Test(priority = 1)
	public void PassTest(){
		System.out.println("Pass");
	}
	
	@Test(priority = 2)
	public void FailTest(){
		System.out.println("Fail");
		Assert.assertEquals(false, true);
	}
	
	@Test(priority = 3)
	public void SkipTest(){
		System.out.println("Skip");
		throw new SkipException("Skipped Exception");
	}

}
