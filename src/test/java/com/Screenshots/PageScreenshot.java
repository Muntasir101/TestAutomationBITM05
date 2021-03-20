package com.Screenshots;

import java.io.IOException;

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
		Screenshot(driver,"New Image");
		Screenshot(driver,"New Image2");

	}

	@Test
	public void Screenshot2() throws IOException {
		Screenshot(driver,"New Image3");
	}

	@AfterTest
	public void closeTest() {

		closeBrowser();
	}

}
