package com.selenium.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DropDown obj = new DropDown();
		
		obj.dropdown();

	}
	
	public void dropdown() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver106\\chromedriver.exe");// 1st value is the browser; 2nd value is the path of driver
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:www.facebook.com");
		
		WebElement continueBtn = driver.findElement(By.xpath("//html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		
		System.out.println(continueBtn.isDisplayed());
		
		continueBtn.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   //after selenium 4
		
		//WebElement dateField = driver.findElement(By.xpath("//*[@id='day']"));
		
		//System.out.println(dateField.isDisplayed());
		
		Select dateField = new Select(driver.findElement(By.xpath("//*[@id='day']")));
		
		//WebElement dateField = new Select (dateField);
		
		//dateField.selectByIndex(18);
		//dateField.selectByValue("10");
		dateField.selectByVisibleText("14");
		
		
		
		
	}
	

}
