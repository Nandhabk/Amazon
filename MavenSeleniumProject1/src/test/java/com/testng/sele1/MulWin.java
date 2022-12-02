package com.testng.sele1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class MulWin {
	
	public WebDriver driver;
	public WebDriver driver1;
	
  @Test
  public void f() {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.co.in");
	  
	  
  }
  
  @Test
  public void f1() {
	  driver1 = new ChromeDriver();
	  driver1.get("https://www.facebook.com");
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver106\\chromedriver.exe");
		
		
		
		 
		 
		 
  }

  @AfterMethod
  public void afterMethod() {
  }

}
