package com.grouping;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups= {"Smoke"})
	public void T1() {
		System.out.println("T1- Smoke");
	}
	
	@Test(groups= {"Regression"})
	public void T2() {
		System.out.println("T2 - Regression");
	}
	
	@Test(groups= {"Sanity"})
	public void T3() {
		System.out.println("T3 - Sanity");
	}
	
	@Test(groups= {"Smoke","Sanity"})
	public void T4() {
		System.out.println("T4 - Smoke & Sanity");
	}
	
	@Test(groups= {"Smoke","Regression"})
	public void T5() {
		System.out.println("T5 - Smoke & Regression");
	}
	
	@Test(groups= {"Smoke","Sanity","Regression"})
	public void T6() {
		System.out.println("T6 - Smoke , Sanity, Regression");
	}

}
