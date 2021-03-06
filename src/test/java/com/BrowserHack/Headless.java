package com.BrowserHack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Base.BaseClass;

public class Headless extends BaseClass{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Training\\PeopleNTech\\BITM Online 5\\Tools\\chromedriver.exe");				
		ChromeOptions opt=new ChromeOptions();
		opt.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(opt);	
		
		driver.get("https://google.com");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
	}
}
