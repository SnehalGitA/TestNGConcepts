package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test(priority=1, description="Login functionality")
	public void LoginTest() {
		
		System.out.println("Test1");
		Assert.assertEquals(false, true);
	}
	
	@Test(priority=2, description="Logout Functionality")
	public void LogoutTest() {
		
		System.out.println("Test2");
		
	}
	
	@Test(priority=3,description="Close Browser Functionality")
	public void CloseTest() {
		
		System.out.println("Test3");
		
	}

}
