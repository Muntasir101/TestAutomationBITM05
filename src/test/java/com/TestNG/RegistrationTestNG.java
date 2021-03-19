package com.TestNG;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Base.BaseClass;

public class RegistrationTestNG extends BaseClass {

	
	@BeforeTest
	public void config() {
		launchChrome();
		openHomePage();
	}
	
	@Test(description="Valid Registration")
	public void valid_Registration() throws InterruptedException {
		openRegisterPage();
		registration_valid();
	}
	
	@Test(description="Invalid Registration")
	public void inValid_Registration() throws InterruptedException {
		openRegisterPage();
		registration_Invalid();
	}
	
	@AfterTest
	public void closeTest() {
		closeBrowser();
	}
	
	protected static String getSaltString() {
		String SALTCHARS="abcdefghijklmnopurstuvwxyz1234567890_-";
		StringBuilder salt=new StringBuilder();
		Random rnd=new Random();
		
		while(salt.length()<10) {
			int index=(int) (rnd.nextFloat()*SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr=salt.toString();
		return saltStr;
	}
	
	public static void openRegisterPage() throws InterruptedException {
		WebElement MyAccount=driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md"));
		MyAccount.click();
		Thread.sleep(4000);

		WebElement Register=driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a"));
		Register.click();
		Thread.sleep(4000);
	}

	public static void registration_valid() throws InterruptedException {
		
		WebElement FirstName = driver.findElement(By.id("input-firstname"));
		WebElement LastName = driver.findElement(By.id("input-lastname"));
		WebElement EMail = driver.findElement(By.id("input-email"));
		WebElement Telephone = driver.findElement(By.id("input-telephone"));
		WebElement Password = driver.findElement(By.id("input-password"));
		WebElement PasswordConfirm = driver.findElement(By.id("input-confirm"));
		WebElement privacy=driver.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)"));
		WebElement ContinueBtn = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));

				
		FirstName.clear();
		FirstName.sendKeys(getSaltString());
		Thread.sleep(3000);

		LastName.clear();
		LastName.sendKeys("Nishee");
		Thread.sleep(3000);

		EMail.clear();
		EMail.sendKeys(getSaltString()+"@gmail.com");
		Thread.sleep(3000);

		Telephone.clear();
		Telephone.sendKeys("01793320205");
		Thread.sleep(3000);

		Password.clear();
		Password.sendKeys("Ni06#@##");
		Thread.sleep(3000);

		PasswordConfirm.clear();
		PasswordConfirm.sendKeys("Ni06#@##");
		Thread.sleep(3000);
		
		privacy.click();

		ContinueBtn.click();  

	}
	
public static void registration_Invalid() throws InterruptedException {
		
		WebElement FirstName = driver.findElement(By.id("input-firstname"));
		WebElement LastName = driver.findElement(By.id("input-lastname"));
		WebElement EMail = driver.findElement(By.id("input-email"));
		WebElement Telephone = driver.findElement(By.id("input-telephone"));
		WebElement Password = driver.findElement(By.id("input-password"));
		WebElement PasswordConfirm = driver.findElement(By.id("input-confirm"));
		WebElement privacy=driver.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)"));
		WebElement ContinueBtn = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));

				
		FirstName.clear();
		FirstName.sendKeys(getSaltString());
		Thread.sleep(3000);

		LastName.clear();
		LastName.sendKeys("");
		Thread.sleep(3000);

		EMail.clear();
		EMail.sendKeys(getSaltString()+"@gmail.com");
		Thread.sleep(3000);

		Telephone.clear();
		Telephone.sendKeys("01793320205");
		Thread.sleep(3000);

		Password.clear();
		Password.sendKeys("Ni06#@##");
		Thread.sleep(3000);

		PasswordConfirm.clear();
		PasswordConfirm.sendKeys("Ni06#@##");
		Thread.sleep(3000);
		
		privacy.click();

		ContinueBtn.click();  

	}
}
