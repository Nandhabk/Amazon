package com.testng.sele1;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class DownLoadFile {
	
	public WebDriver driver;
	
	public ChromeOptions opt;
	
  @Test
  
  public void f() throws InterruptedException {
	  
	  driver.get("https://chromedriver.storage.googleapis.com/index.html?path=79.0.3945.36/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	  WebElement downloadPDF = driver.findElement(By.xpath("//*[contains(text(),'chromedriver_win32.zip')]"));
	  System.out.println(downloadPDF.isDisplayed());
	  Actions act = new Actions(driver);
	  act.moveToElement(downloadPDF).click().build().perform();
	  //downloadPDF.click();
  }
  @BeforeMethod
  
  public void beforeMethod() {
	  
	  	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver106\\chromedriver.exe");
		
		 opt = new ChromeOptions();
		 
		
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		
		prefs.put("download.prompt_for_download", false);
		
		prefs.put("plugins.always_Open_pdf_externally", true);
		
		opt.setExperimentalOption("prefs", prefs);
		
		driver = new ChromeDriver(opt);
		
		
		
		
		
		
		
	  
  }

  @AfterMethod
  
  public void afterMethod() {
	  
	  
  }

}
