package com.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;
import com.openCart.LoginTest;

/*
 * Go to the Login page.
Type Email.
Type password.
Navigate back to the previous page.
navigate again Login page.
Verify the email and password field
 */

public class LoginPageNavigation extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		launchChrome();
		openHomePage();
		LoginTest.openLoginPage();
		loginNavigationTest();
		closeBrowser();
	}

	public static void loginNavigationTest() throws InterruptedException {
		WebElement Email=driver.findElement(By.id("input-email"));
		WebElement Password=driver.findElement(By.id("input-password"));		
		
		String inputEmail="mail@mail.com";
		
		Email.clear();
		Email.sendKeys(inputEmail);
		Thread.sleep(3000);
		
		Password.clear();
		Password.sendKeys("123456");
		Thread.sleep(3000);
		
		//Navigate back to Home page
		driver.navigate().back();
		Thread.sleep(5000);
		
		//back to Login page for Verify
		driver.navigate().forward();
		
		//Relaod page
		driver.navigate().refresh();

		
	}

}
