package com.selenium.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
			 * classname obj = new classname();
			 * obj.method name
			 */
		TitleComp obj = new TitleComp();
		
		obj.title();
		
	}
	
	public void title() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver106\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		String Actual_Title = driver.getTitle();
		
		String Expected = "Google";
		
		if(Expected == Actual_Title) {
			
			System.out.println("Title matches");
		}
		
		else {
			
			System.out.println("Title Not Matches");
		}
		
		driver.close();
		
	}

}
