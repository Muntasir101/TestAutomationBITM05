package com.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;

public class AllAboutAlert extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		launchChrome();
		baseURL();
//		NormalJSAlert();
//		ConfirmJSAlert();
//		PromptJSAlert();
//		closeBrowser();
	}

	public static void baseURL() {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}

	public static void NormalJSAlert() throws InterruptedException {
		WebElement NormalAlertBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
		NormalAlertBtn.click();

		//Get Alert Message
		String AlertMessage=driver.switchTo().alert().getText();
		System.out.println(AlertMessage);
		
		Thread.sleep(3000);
		//click on OK
		driver.switchTo().alert().accept();
	}

	public static void ConfirmJSAlert() throws InterruptedException {
		WebElement ConfirmAlertBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
		ConfirmAlertBtn.click();

		String AlertMessage=driver.switchTo().alert().getText();
		System.out.println(AlertMessage);
		
		Thread.sleep(3000);
		//click on Cancel
		driver.switchTo().alert().dismiss();
	}
	
	public static void PromptJSAlert() throws InterruptedException {
		WebElement PromptJSAlertBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
		PromptJSAlertBtn.click();
		
		String AlertMessage=driver.switchTo().alert().getText();
		System.out.println(AlertMessage);

		Thread.sleep(3000);
		
		//Write some text on Alert		
		String text="Test Automation";
		driver.switchTo().alert().sendKeys(text);
		Thread.sleep(3000);
				
		//click on Cancel
		driver.switchTo().alert().accept();
	}



}
