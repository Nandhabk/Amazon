package com.testng.sele1;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class FileUpload {
	
	public WebDriver driver;
	
  @Test
  
  public void f() throws AWTException {
	  
	  WebElement browse_btn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/input[1]"));  
	  
	  System.out.println(browse_btn.isDisplayed());
	  
	  Actions act = new Actions(driver);
	  
	  act.moveToElement(browse_btn).click().build().perform();
	  
	  //browse_btn.click();
	  
	  String file = "D:\\screenshotgoogle1.jpeg";
	  
	  StringSelection selector = new StringSelection(file);
	  
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selector, null);
	  
	  Robot robot = new Robot();
	  
	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyPress(KeyEvent.VK_V);
	  robot.keyRelease(KeyEvent.VK_CONTROL);
	  robot.keyRelease(KeyEvent.VK_V);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  
	  
	  
  }
  @BeforeMethod
  
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver106\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		
		driver.manage().window().maximize();
	  
  }

  @AfterMethod
  
  public void afterMethod() {
	  
	  
	  
  }

}
