package com.testng.sele1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Actions1 {
	
	public WebDriver driver;
  @Test
  public void f() {
	  
	  driver.get("https://login.yahoo.com/?.src=search&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&pspid=2114723002&activity=header-signin");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  WebElement checkBox = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/form/div[3]/div[1]/span/input"));
	  
	  System.out.println(checkBox.isDisplayed());
	  
	  System.out.println(checkBox.isSelected());
	  
	  if (checkBox.isSelected()) {
		  
		  Actions act = new Actions(driver);
		  
		  act.moveToElement(checkBox).click().build().perform();
		  
		  //checkBox.click();
		  
		  System.out.println(checkBox.isSelected());
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
