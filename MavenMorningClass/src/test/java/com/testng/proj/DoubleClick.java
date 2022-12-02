package com.testng.proj;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DoubleClick {
	
	public WebDriver driver;
	
	public Actions action;
	
	public Alert alt;
	
  @Test
  
  public void doubleclickbtn() {
	  
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  String ActualTitle = driver.getTitle();
	  
	  String ExpTitle= "bsdhbfi";
	  
	  System.out.println(ActualTitle);
	  
	  Assert.assertEquals(ActualTitle, ExpTitle);
	  
	 /* WebElement dblClickBtn = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
	  
	  System.out.println(dblClickBtn.isDisplayed());
	  
	  action = new Actions(driver);
	  
	  action.doubleClick(dblClickBtn).build().perform();
	  
	  alt = driver.switchTo().alert();
	  
	  System.out.println(alt.getText());
	  
	  alt.accept();*/
	  
	  
  }
  
  @Test(enabled=false)
  
  public void rightclick() throws InterruptedException {
	  
	  driver.get("https://demoqa.com/buttons");
	  
	  WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
	  
	  System.out.println(rightClick.isDisplayed());
	  
	  Thread.sleep(10000);
	  
	  action = new Actions(driver);
	  
	  action.contextClick(rightClick).build().perform();
	  
	  Thread.sleep(10000);
	  
	  WebElement rghtClkMsg = driver.findElement(By.id("rightClickMessage"));
	  
	  System.out.println(rghtClkMsg.isDisplayed());
	  
	  System.out.println(rghtClkMsg.getText());
	  
	  
	  
  }
  
  
  @BeforeMethod
  
  public void beforeMethod() {
	  
	  	System.out.println("Before Method");
	  
	  	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver106\\chromedriver.exe");// 1st value is the browser; 2nd value is the path of driver
		
		 driver = new ChromeDriver();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("After Method");
	  
	  driver.close();
	  
  }

  @BeforeTest
  
  public void beforeTest() {
	  
	  System.out.println("Before Test");
	  
  }

  @AfterTest
  
  public void afterTest() {
	  
	  System.out.println("After Test");
	  
  }

}
