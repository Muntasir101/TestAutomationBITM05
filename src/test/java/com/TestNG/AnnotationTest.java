package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AnnotationTest {
	
  @Test
  public void test() {
	  System.out.println("Test Method Executed.");
  }
   
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod Executed.");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod Executed.");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass Executed.");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass Executed.");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest Executed.");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest Executed.");
  }

}
