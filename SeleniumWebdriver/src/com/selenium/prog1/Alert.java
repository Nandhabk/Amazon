package com.selenium.prog1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Alert obj = new Alert();
		
		obj.alert_handle();
	}

	
	public void alert_handle() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver106\\chromedriver.exe");// 1st value is the browser; 2nd value is the path of driver
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_personalb_personal_login_btn&_gl=1*dnlstw*_ga*MTg2NTk0NTc2OS4xNjUzMTExMDM4*_ga_SKB78GHTFV*MTY2NTQ1MjgyOS4xLjEuMTY2NTQ1Mjg2MC4yOS4wLjA.");
		
		WebElement proceedArroy = driver.findElement(By.xpath("//*[@id=\"user-id-goahead\"]"));
		
		System.out.println(proceedArroy.isDisplayed());
		
		proceedArroy.click();
		
		WebElement loginLocator = driver.findElement(By.id("VALIDATE_CREDENTIALS2"));
		
		System.out.println(loginLocator.isDisplayed());
		
		loginLocator.click();
		
		Thread.sleep(10000);
		
		org.openqa.selenium.Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.accept();
		
		//alt.sendKeys("hvbsdhv");
		
		//alt.dismiss();
		
		driver.close();
	}
}
