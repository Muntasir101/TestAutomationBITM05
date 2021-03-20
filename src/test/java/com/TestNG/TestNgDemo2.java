package com.TestNG;

import java.io.IOException;

import org.testng.annotations.Test;


public class TestNgDemo2 {
	

	@Test(description="Test Demo4 Description")
	public void Demo4() throws IOException {
		System.out.println("Demo4 Method Executed");
	}

	@Test(description="Test Demo5 Description")
	public void demo5() {
		System.out.println("Demo5 Method Executed");
	}
	
	@Test(description="Test Demo6 Description")   
	public void demo6() {
		System.out.println("Demo6 Method Executed");
	}
	
	
	
}
