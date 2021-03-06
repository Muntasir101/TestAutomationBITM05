package com.MultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import com.Base.BaseClass;

public class SwitchMultipleWindow extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		launchChrome();
		SwitchWindow();


	}
	
	public static void SwitchWindow() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/windows");		
		//parent
		String ParentGUID=driver.getWindowHandle();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> allGUID=driver.getWindowHandles();
		
		//Switch to child
		for(String ChildGUID:allGUID) {
			
			if(!ChildGUID.equals(ChildGUID)) {
				driver.switchTo().window(ChildGUID);
				Thread.sleep(3000);
				driver.navigate().to("https://google.com");
				Thread.sleep(3000);
				
				break;
			}
		}
		
		//Switch to parent
				for(String ChildGUID:allGUID) {
					
					if(!ChildGUID.equals(ChildGUID)) {
						driver.switchTo().window(ParentGUID);	// window name as parameter 			
						Thread.sleep(3000);
						driver.navigate().to("https://bbc.com");
						Thread.sleep(3000);
						
						break;
					}
				}	
		
	}

}
