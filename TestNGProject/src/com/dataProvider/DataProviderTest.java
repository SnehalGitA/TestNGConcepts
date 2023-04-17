package com.dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderTest {
	
//	@DataProvider(name="LoginCredentials")
//	public Object[][] getData(){
//		Object[][] data = {{"Admin","admin123"},{"Admin1","admin124"},{"Admin2","admin125"}};
//		return data;
//	}
//	
	WebDriver driver;
	
	@Parameters({"browser","url"})
	@BeforeMethod
	public void Login(String browsername, String AppUrl) throws Exception {
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\snpawar\\OneDrive - Capgemini\\Documents\\SeleniumProject\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			}else if (browsername.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver", "C:\\Users\\snpawar\\OneDrive - Capgemini\\Documents\\SeleniumProject\\ChromeDriver\\chromedriver.exe");
				driver = new EdgeDriver();	
			}
			
		driver.get(AppUrl);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}

	@Test(priority=1,dataProvider = "LoginCredentials",dataProviderClass = dataProviderCode.class )
	public void LoginOrange(String Uname, String pwd) throws Throwable {
		driver.findElement(By.name("username")).sendKeys(Uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void Quit() {
		driver.close();
	}
}
