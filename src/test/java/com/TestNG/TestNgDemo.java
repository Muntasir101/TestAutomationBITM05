package com.TestNG;

import org.testng.annotations.Test;

// enabled
// description 
// priority 
// invocationCount, invocationTimeOut

public class TestNgDemo {

	@Test(description="Test Demo2 Description")
	public void Demo2() {
		System.out.println("Demo2 Method Executed");
	}

	@Test(description="Test Demo Description")
	public void demo1() {
		System.out.println("Demo Method Executed");
	}
	
	@Test(description="Test Demo3 Description") // Test as Milliseconds  
	public void demo3() {
		System.out.println("Demo3 Method Executed");
	}
	
	
	
}
