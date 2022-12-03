package com.testng.sele1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class DragandDrop {
	
	// Actions
	
	public WebDriver driver;
	
	public Actions act;
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://demo.guru99.com/test/drag_drop.html");
	  
	  WebElement drag  = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[5]/a"));
	  
	  System.out.println(drag.isDisplayed());
	  
	  System.out.println(drag.getText());
	  
	  WebElement drop = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	  
	  System.out.println(drop.isDisplayed());
	  
	  Thread.sleep(10000);
	  
	  act = new Actions (driver);
	  
	  act.dragAndDrop(drag,drop).build().perform();
	  
	  System.out.println("Drag and drop has been made");
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
