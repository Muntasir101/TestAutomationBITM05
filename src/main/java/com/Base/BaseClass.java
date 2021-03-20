package com.Base;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class BaseClass {

	public static WebDriver driver;
	
	
	public static void launchChrome() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
					
		driver=new ChromeDriver();
	    driver.manage().window().maximize();	    
	    driver.manage().deleteAllCookies();
	}
	
	public static void launchFirefox() {
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");		
	    driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	}
	
	public static void closeBrowser() {
		
		driver.close();
	}
	
	public static void openHomePage() {
		driver.get("https://demo.opencart.com/");
	}
	
	
	public static void Screenshot(WebDriver driver, String name) throws IOException {
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"/Screenshots/"+ name + ".png"),true);

	}
	
	public void PdfGenerate(WebDriver driver, String pdfname) throws DocumentException, MalformedURLException, IOException {
		byte[] input=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		Document doc= new Document();
		String output=System.getProperty("user.dir")+"/PDFReport/"+ pdfname + ".pdf";
		
		FileOutputStream fos=new FileOutputStream(output);
		PdfWriter writer=PdfWriter.getInstance(doc, fos);
		writer.open();
		doc.open();
		
		Image img=Image.getInstance(input);
		img.scaleToFit(PageSize.A4.getWidth()/2, PageSize.A4.getHeight()/2);
		doc.add(img);
		doc.add(new Paragraph(" "));
		
		doc.close();
		writer.close();
				
	}
}
