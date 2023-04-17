package com.dataProvider;

import org.testng.annotations.DataProvider;

public class dataProviderCode {

	
	@DataProvider(name="LoginCredentials")
	public Object[][] getData(){
		Object[][] data = {{"Admin","admin123"},{"Admin1","admin124"},{"Admin2","admin125"}};
		return data;
	}
	
}
