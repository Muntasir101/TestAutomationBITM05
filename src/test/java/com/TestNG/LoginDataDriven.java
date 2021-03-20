package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Base.BaseClass;

public class LoginDataDriven extends BaseClass {
	
	@DataProvider(name="TestData")
	public Object [][] searchData(){
		
		Object [][] data=new Object[4][2];
		
		data [0][0] ="email1@invalid.com";
		data [0][1]="123456";

		data [1][0] ="email2@invalid.com";
		data [1][1]="123456";
		
		data [2][0] ="email3@invalid.com";
		data [2][1]="123456";
		
		data [3][0] ="email@mail.com";
		data [3][1]="12345678";
		
		return data;		
	}
	
	@BeforeTest
	public void config() {
		launchChrome();	
	}
	
	
	@Test(dataProvider="TestData")
	public void LoginTest(String email, String password) throws InterruptedException {		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		WebElement Email=driver.findElement(By.id("input-email"));
		WebElement Password=driver.findElement(By.id("input-password"));		
		WebElement LoginBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));		
		
		Email.clear();
		Email.sendKeys(email);
		Thread.sleep(3000);
		
		Password.clear();
		Password.sendKeys(password);
		Thread.sleep(3000);
		
		LoginBtn.click();
	}
		
	
	@AfterTest
	public void closeTest() {

		closeBrowser();
	}
}
