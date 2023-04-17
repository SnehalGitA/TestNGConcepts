package com.testng;

import org.testng.annotations.Test;

public class FirstTestNGclass {
	
  @Test
  public void SignIn() {
	  
	  System.out.println("Login to app");
  }
  
  @Test
  public void VerifyTitle() {
	  System.out.println("Verify Page Title");
  }
  
  @Test
  public void SignOut() {
	  System.out.println("Logout the app");
  }
  
}
