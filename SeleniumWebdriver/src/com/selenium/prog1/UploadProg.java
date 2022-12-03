package com.selenium.prog1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadProg {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		UploadProg obj = new UploadProg();
		
		obj.uploadprog();

	}
	
	public void uploadprog() throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver106\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//html/body/div/div[2]/div[1]/input[1]"));
		
		System.out.println(element.isDisplayed());
		
		Actions act = new Actions(driver);
		
		act.moveToElement(element).click().build().perform();
		
		//element.click();
		
		String file = "D:\\screenshotgoogle1.jpeg";
		
		StringSelection selection = new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
