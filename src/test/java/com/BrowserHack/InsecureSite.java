package com.BrowserHack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Base.BaseClass;

public class InsecureSite extends BaseClass{

	public static void main(String[] args) {
		
		BypassCertificate();
		closeBrowser();
	}
	
	public static void BypassCertificate() {
		System.setProperty("webdriver.chrome.driver", "F:\\Training\\PeopleNTech\\BITM Online 5\\Tools\\chromedriver.exe");				
		ChromeOptions opt=new ChromeOptions();	
		opt.setAcceptInsecureCerts(true);		
		WebDriver driver=new ChromeDriver(opt);	
		
		driver.get("https://cacert.org/");
		
		System.out.println(driver.getTitle());
	}

}
