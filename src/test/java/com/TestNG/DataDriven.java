package com.TestNG;

import org.testng.annotations.Test;

import com.Base.BaseClass;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class DataDriven extends BaseClass {
	
	// Option 1
	@DataProvider(name="TestData")
	public Object [][] searchData(){
		Object [][] data=new Object[3][1];
		data [0][0] ="https://google.com";
		data [1][0] ="https://bing.com";
		data [2][0] ="https://bbc.com";	
		return data;
		
	}
	
	// Option 2
	@DataProvider(name="TestData2")
	public Object [][] searchData2(){
		return new Object[][] {
			{"https://demo.opencart.com/"},{"https://edition.cnn.com/"}
		};
	}
	
	@Test(dataProvider="TestData2")
	public void doSearch(String Website) {
		driver.get(Website);
	}
	

	@BeforeTest
	public void config() {
		launchChrome();		
	}
	
	@AfterTest
	public void closeTest() {

		closeBrowser();
	}
	
  
}
