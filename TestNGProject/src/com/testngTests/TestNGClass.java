package com.testngTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass {
	
	@BeforeSuite
	public void BeforeSuit() {
		System.out.println("BeforeSuit");
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass - Runs before strating class");
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod - Runs before every method");
	}
	
	@Test
	public void Test1() {
		System.out.println("Test1");
	}
	
	@Test
	public void Test2() {
		System.out.println("Test2");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod - Rund after every method");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass - Runs at the end of the class");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest");
	}
	
	@AfterSuite
	public void AferSuit() {
		System.out.println("AfterSuit");
	}
	

}
