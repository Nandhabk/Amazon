package com.testng.proj;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	public WebDriver driver;
	
	//how many tag name called script is present in my application - i will be using keyword called list
	
  @Test
  
  public void f() throws InterruptedException {
	  
	  driver.get("https://www.google.co.in");
	  
	  Thread.sleep(10000);
	  
	  List <WebElement> lst = driver.findElements(By.tagName("a"));
	  
	  System.out.println(lst.size());
	  
	  for(int i=0;i<lst.size();i++) {
		  
		  System.out.println(lst.get(i).getText());
	  }
	  
  }
  
  @BeforeMethod
  
  public void beforeMethod() {
	  
	  System.out.println("Before Method");
	  
	  	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver106\\chromedriver.exe");// 1st value is the browser; 2nd value is the path of driver
		
		 driver = new ChromeDriver();
	  
  }

  @AfterMethod
  
  public void afterMethod() {
	  
	  driver.close();
	  
  }

}
