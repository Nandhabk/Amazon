package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingPage {
	@FindBy(id = "login-username")
	public static WebElement userName;
	
	@FindBy(id = "login-signin")
	public static WebElement nextUsername;
	

}
