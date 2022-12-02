package com.selenium.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListProg obj = new ListProg();
		
		obj.tag_a();

	}
	
	public void tag_a() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver106\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		driver.manage().window().maximize();
		
		//WebElement tag = driver.findElement(By.xpath(""));
		
		 List<WebElement> tagname_a = driver.findElements(By.tagName("a"));
		 
		 System.out.println(tagname_a.size());
		 
		 int p=0;
		 
		 /*
		  * for(intialise; compare; increment or decrement){
		  * statement;
		  * }
		  */
		 
		 for(int i=0; i<tagname_a.size(); i++) {
			 
			/*
			 * 0;0<26;
			 * 1;1<26;
			 * 2;2<26;
			 * ;
			 * ;
			 * ;
			 * 26;26<26
			 */
		  
		 
		 
		 /*
		  * tagname_a(0).getText();
		  * tagname_a(1).getText();
		  * tagname_a(2).getText();
		  */
		 // starting ! - not equals to 
		 if(!tagname_a.get(i).getText().isBlank()) {
			 
			 System.out.println(tagname_a.get(i).getText());
			 p=p+1;
			 
		 }
		 
		 }
		 
		 System.out.println("Total tag without blank Text :"+ p);
		 
		 driver.close();
	}
	
	public void tag_b() {
		
	}

}
