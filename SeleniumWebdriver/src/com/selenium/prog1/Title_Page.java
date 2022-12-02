package com.selenium.prog1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Title_Page obj = new Title_Page();
		
		obj.title();

	}
	
	public void title() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromeedriver103\\chromedriver.exe");// 1st value is the browser; 2nd value is the path of driver
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:www.facebook.com");
		
		System.out.println(driver.getTitle());
		
		String expectedTitle = "Facebook – log in or sign up";
		
		if(expectedTitle.contentEquals(driver.getTitle())) {
			
			System.out.println("Title Matches");
		}
		
		else {
			
			System.out.println("Title Not matches");
		}
		
		driver.close();
	}

}
