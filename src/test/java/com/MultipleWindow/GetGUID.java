package com.MultipleWindow;

import com.Base.BaseClass;

public class GetGUID extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		launchChrome();
		baseURL();
		GUID();
		closeBrowser();

	}
	
	public static void baseURL() throws InterruptedException {
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		Thread.sleep(5000);
	}
	
	public static void GUID() {
		String WindowGUID= driver.getWindowHandle();
		System.out.println(WindowGUID);
				
	}
	

}
