package com.parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ValidateTitle {
	
WebDriver driver;
	
	
	@Test
	public void ValidateTitle() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\snpawar\\OneDrive - Capgemini\\Documents\\SeleniumProject\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		String s = driver.getTitle();
		
		System.out.println(s);
		driver.close();
	}
	
	
	

}
