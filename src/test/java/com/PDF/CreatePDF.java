package com.PDF;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.itextpdf.text.DocumentException;

public class CreatePDF extends BaseClass {

	@BeforeTest
	public void config() {
		launchChrome();
		
	}


	@Test
	public void CustomPDF() throws IOException, DocumentException {

		driver.get("https://google.com");
		PdfGenerate(driver,"Google Test Report");
	}


	@AfterTest
	public void closeTest() {

		closeBrowser();
	}
}
