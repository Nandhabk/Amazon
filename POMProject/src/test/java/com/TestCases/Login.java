package com.TestCases;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.base.method.Baseclass;
import com.pages.LoginPage;

public class Login extends Baseclass {
	
	@Test
	
	public void LoginMethod() {
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.userName.sendKeys(properties.getProperty("Username"));
	}

}
