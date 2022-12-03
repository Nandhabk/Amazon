package com.testng.sele1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Screenshot {
	
	public WebDriver driver;
  @Test
  public void takescreenshot() {
	  
	  driver.get("https://www.google.co.in");
	  
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  try {
		  
	  //FileUtils.copyDirectory(src, new File("D\\screenshotgoogle.png"));
	  
	  FileUtils.copyFile(src, new File("D://screenshotgoogle2.jpeg"));
	  
	  }
	  
	  catch(Exception e1) {
		  
		  System.out.println(e1);
		  
	  }
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver106\\chromedriver.exe");
		
		 driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

}
