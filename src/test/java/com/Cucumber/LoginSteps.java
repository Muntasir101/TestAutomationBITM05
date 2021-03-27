package com.Cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {

	WebDriver driver;
	
	@Given("Open Browser and Navigate to Login Page")
	public void open_browser_and_navigate_to_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");	
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demo.opencart.com/");
	    
		WebElement MyAccount=driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md"));
		MyAccount.click();
		Thread.sleep(4000);
		
		WebElement Login=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
		Login.click();
		Thread.sleep(4000);
	
	}

	@When("Enter valid Email and valid Password")
	public void enter_valid_email_and_valid_password() throws InterruptedException {
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

	@Then("Login Successful")
	public void login_successful() {
		WebElement myAccount=driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]"));
		Assert.assertEquals(true, myAccount.isDisplayed());		
		driver.close();

	}
	
}
