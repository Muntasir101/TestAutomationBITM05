package com.openCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;

public class LoginTest extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		launchChrome();
		openHomePage();
		openLoginPage();
		TC_01_loginTest_Invalid();
		TC_02_loginTest_Valid();
		closeBrowser();
	}
	
	public static void openLoginPage() throws InterruptedException {
		
		WebElement MyAccount=driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md"));
		MyAccount.click();
		Thread.sleep(4000);
		
		WebElement Login=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
		Login.click();
		Thread.sleep(4000);
		
		String LoginPageTitle= driver.getTitle();
		System.out.println("Title: " + LoginPageTitle);
		
		String LoginURL=driver.getCurrentUrl();
		System.out.println("URL: " + LoginURL);
			
	}
	
	public static void TC_01_loginTest_Invalid() throws InterruptedException {
		WebElement Email=driver.findElement(By.id("input-email"));
		WebElement Password=driver.findElement(By.id("input-password"));		
		WebElement LoginBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));		
		
		Email.clear();
		Email.sendKeys("mail@mail.com");
		Thread.sleep(3000);
		
		Password.clear();
		Password.sendKeys("123456");
		Thread.sleep(3000);
		
		LoginBtn.click();
			
	}
	
	public static void TC_02_loginTest_Valid() throws InterruptedException {
		WebElement Email=driver.findElement(By.id("input-email"));
		WebElement Password=driver.findElement(By.id("input-password"));		
		WebElement LoginBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));		
		
		Email.clear();
		Email.sendKeys("mail11@mail.com");
		Thread.sleep(3000);
		
		Password.clear();
		Password.sendKeys("123456");
		Thread.sleep(3000);
		
		LoginBtn.click();
			
	}

}
