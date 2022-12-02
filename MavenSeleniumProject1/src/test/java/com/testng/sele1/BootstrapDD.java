package com.testng.sele1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class BootstrapDD {
	
	public WebDriver driver;
  @Test
  public void f() {
	  
	  driver.get("https://www.icicibank.com/Personal-Banking/account-deposit/iwish/index.page?ITM=nli_cms_iWish_sitecapture_Internet_Banking_openaniWishnowbtn");
	  
	  WebElement dropDownCurrency = driver.findElement(By.xpath("//html/body/div[1]/header/div/div[1]/div/nav[2]/div/div[2]/div[1]/a"));	  
	  System.out.println(dropDownCurrency.isDisplayed());
	  
	  dropDownCurrency.click();
	  
	  //String currenyValue = "SGD";
	  
	  //driver.navigate().refresh();
	  
	  //List<WebElement> cur = driver.findElements(By.xpath("//div[contains(@class,'css-1dbjc4n r-14lw9ot r-z2wwpe r-1rjd0u6 r-1g94qm0 r-h3f8nf r-u8s1d r-8fdsdq')]/div/div/div"));
	  List<WebElement> cur = driver.findElements(By.xpath("//div[contains(@class,'personal-list')]/ul/li"));
	  
	  System.out.println(cur.size());
	  
	 /* try {
	  
	   for (WebElement values : cur ) {
		  
		  System.out.println(values.getText());
		  
		  if (values.getText().contentEquals("SGD")) {
			  
			  values.click();
			  
			  break;
		  }
	   }
	  }

	  
	   
	   catch (StaleElementReferenceException e1) {
		   
		   for (WebElement values : cur ) {
				  
				  System.out.println(values.getText());
				  
				  if (values.getText().contentEquals("SGD")) {
					  
					  values.click();
					  
					  break;
				  }
	   }
	   }*/
	  
	  
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
	  //driver.close();
  }

}
