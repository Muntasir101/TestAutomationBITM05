package com.Demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSize {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Training\\PeopleNTech\\BITM Online 5\\Tools\\chromedriver.exe");		
	    driver=new ChromeDriver();
	  
	    //Browser maximize
	    driver.manage().window().maximize();
	    
	    //Get maximize browser size(width,height)
	  //  int width=driver.manage().window().getSize().getWidth();
	    int width=driver.manage().window().getSize().width;
	    
	   // int height=driver.manage().window().getSize().getHeight();
	    int height=driver.manage().window().getSize().height;
	    
	    System.out.println("Width: "+ width + " Height: " +height);
	    
	    // Delete cookie
	    driver.manage().deleteAllCookies();
	    
	    driver.get("https://google.com");
	    
	    //set specific width and height 
	    driver.manage().window().setSize(new Dimension(1000,500));
	    
	    int Newwidth=driver.manage().window().getSize().width;	    
	    int Newheight=driver.manage().window().getSize().height;
	    System.out.println("New Width: "+ Newwidth + " NewHeight: " +Newheight);
	    
	}

}
