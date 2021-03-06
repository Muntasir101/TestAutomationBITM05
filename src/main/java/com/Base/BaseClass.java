package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;
	
	
	public static void launchChrome() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
					
		driver=new ChromeDriver();
	    driver.manage().window().maximize();	    
	    driver.manage().deleteAllCookies();
	}
	
	public static void launchFirefox() {
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");		
	    driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	}
	
	public static void closeBrowser() {
		
		driver.close();
	}
	
	public static void openHomePage() {
		driver.get("https://demo.opencart.com/");
	}
	
}
