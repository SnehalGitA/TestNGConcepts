package com.parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidateLogo {
	
	WebDriver driver;
	
	@Test
	public void ValidateLogo() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\snpawar\\OneDrive - Capgemini\\Documents\\SeleniumProject\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.id("APjFqb"));
//		Assert.assertTrue(logo.isDisplayed(), "Logo Displayed");
		if(logo.isDisplayed()){
			System.out.println("Logo displayed");
		}else {
			System.out.println("Logo Not displayed");
		}
		driver.close();
	}

}
