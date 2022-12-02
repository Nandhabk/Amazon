package com.selenium.prog1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;

public class Login {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Login obj = new Login();
		
		obj.gmail();

	}
	
	public void gmail()   {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromeedriver103\\chromedriver.exe");// 1st value is the browser; 2nd value is the path of driver
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/?.src=ym&lang=en-GB&done=https%3A%2F%2Fin.mail.yahoo.com%2F%3Fguce_referrer%3DaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8%26guce_referrer_sig%3DAQAAAMCeXutHIy5_ALfExGnVi-pTe81hhgHxpK2o7_6dSfygW5P4ija3IjdoecVZj379dcCZ3W7z1S0705iD1ESGkZU_RKgtMpwjmAQCWGT69g0CLT3U7JtCONafbPUO1qD63GLsTDF0u2INT1Rrj2l-YcCDWVumbfrGggceVnZBYUqs");
		
		driver.manage().window().maximize();
		
		// all the elements in the page will be called as webelement
		
		WebElement userName = driver.findElement(By.id("login-username"));
		
		System.out.println(userName.isDisplayed());
		
		userName.sendKeys("nanthasep07");
		
		//driver.findElement(By.id("login-username")).sendKeys("nanthasep07");
		
		// to verify signed in check box is enabled or not
		
		//Thread.sleep(10000);
		
		WebElement checkBox = driver.findElement(By.xpath("//*[contains(@id,'persistent')]"));
		
		//System.out.println(checkBox.isDisplayed());
		
		System.out.println(checkBox.isSelected());
		
		if (checkBox.isSelected()) {
			
			Actions act = new Actions(driver);    // initialize of Actions
			
			act.moveToElement(checkBox).click().build().perform();
			
			//checkBox.click();
		}
		
		System.out.println(checkBox.isSelected());
		
		WebElement nextBtn1 = driver.findElement(By.id("login-signin"));
		
		System.out.println(nextBtn1.isDisplayed());
		
		nextBtn1.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   //after selenium 4
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		//Thread.sleep(10000);   //explicit wait
		
		WebElement passWord = driver.findElement(By.id("login-passwd"));
		
		System.out.println(passWord.isDisplayed());
		
		
		
		
	}

}
