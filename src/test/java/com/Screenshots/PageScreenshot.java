package com.Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Base.BaseClass;

public class PageScreenshot extends BaseClass {
  
	@BeforeTest
	public void config() {
		launchChrome();
		openHomePage();
	}
	
	
	@Test
  public void Screenshot() throws IOException {
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"\\Screenshots\\Page.png"),true);
		
  }
	
	@AfterTest
	public void closeTest() {
		closeBrowser();
	}
	
}
