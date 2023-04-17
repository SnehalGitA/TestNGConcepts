package com.testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {
	
	@BeforeClass
	public void BeforeClassTest2() {
		System.out.println("Before class - Test2");
	}
	
	@Test(priority=1)
	public void Test2M1() {
		System.out.println("First method in Test2");
	}
	
	@Test(priority=2, enabled=true)
	public void Test2M2() {
		System.out.println("Second method in Test2");
		Assert.assertEquals(false, true);
	}

	
	@Test(dependsOnMethods = {"Test2M1","Test2M2"})  //depends on Test2M1 and Test2M2
	public void Test2M3() {
		System.out.println("Third method in Test2"); //This will not run as Test2M2 will fail
	}

	@Test(enabled = false)  //to disable the test case. This will not run as not included (disabled)
	public void Test2M4() {
		System.out.println("Fourth method in Test2");
	}
	
	@AfterClass
	public void AfterClassTest2() {
		System.out.println("After class - Test2");
	}

}
