package com.TestCases;

import org.openqa.selenium.support.PageFactory;

import com.base.method.Baseclass;
import com.pages.BookingPage;


public class BookingTest extends Baseclass {

	
	public void BookingTestCase() {
		
		PageFactory.initElements(driver, BookingPage.class);
		BookingPage.userName.sendKeys(properties.getProperty("Username"));
	}
}
