package com.testng.proj;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Radio_button {
	
  @Test(dependsOnMethods = "test3")
  
  public void test1() {
	  
	  System.out.println("Test1");
	  
  }
  
  @Test(priority=3,groups="login")
  
  public void test2() {
	  
	  System.out.println("Test2");
	  
  }
  
  @Test()
  
  public void test3() {
	  
	  int a=0;
	  int b =10;
	  
	  System.out.println(b/a);
	  
  }
  
  @Test(priority=2,groups="login")
  
  public void test4() {
	  
	  System.out.println("Test4");
	  
  }
  
  @Test(priority=1)
  
  public void test5() {
	  
	  System.out.println("Test5");
	  
  }
  
  @BeforeMethod
  
  public void beforeMethod() {
	  
	  System.out.println("Before Method");
	  
  }

  @AfterMethod
  
  public void afterMethod() {
	  
	  System.out.println("After Method");
	  
  }

}
