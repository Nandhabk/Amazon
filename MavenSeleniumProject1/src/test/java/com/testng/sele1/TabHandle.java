package com.testng.sele1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class TabHandle {
	
	public WebDriver driver;
	
  @Test
  
  public void f() {
	  
	  driver.get("https://demo.guru99.com/popup.php");
	  
	  driver.manage().window().maximize();
		
		WebElement clickHere = driver.findElement(By.xpath("/html/body/p/a"));
		
		System.out.println(clickHere.isDisplayed());
		
		System.out.println(driver.getTitle());
		
		clickHere.click();
		
		Set <String> tab=driver.getWindowHandles();
		
		Iterator<String> li= tab.iterator();   //iterator = 0; parent tab =1; child =2		
		
		String parentWindow = li.next(); // tab1
		
		String childWindow = li.next();  // tab2
		
		String childwindow1 = li.next();
		
		driver.switchTo().window(childWindow);
	
		System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getCurrentUrl());
		
		//driver.close();
		
		driver.quit();
	  
	  
	  
	  
  }
  
  @BeforeMethod
  
  public void beforeMethod() {
	  
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver106\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--disable-notifications");
		
		 driver = new ChromeDriver(opt);
	  
  }

  @AfterMethod
  
  public void afterMethod() {
	  
	  
  }

}
