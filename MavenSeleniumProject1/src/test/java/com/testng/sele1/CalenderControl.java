package com.testng.sele1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class CalenderControl {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("https://www.spicejet.com");
	  
	  
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver106\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		// Thread.sleep(5000);//Explicit Wait
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

}
