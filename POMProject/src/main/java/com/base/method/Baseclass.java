package com.base.method;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.poifs.property.DirectoryProperty.PropertyComparator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class Baseclass {
	
	public static Properties properties = null;
	
	public static WebDriver driver;
	
	Logger logger = Logger.getLogger(Baseclass.class);
	
	public Properties loadPropertyFile() throws IOException {
		
		FileInputStream fir = new FileInputStream("config.properties");
		 properties = new Properties();
		properties.load(fir);
		
		return properties;
	}
	
	
	
@BeforeSuite
public void launchBrowser() throws IOException {
	PropertyConfigurator.configure("log4j.properties");
	loadPropertyFile();
	
	String browser = properties.getProperty("Browser");
	String url = properties.getProperty("URL");
	String driverloaction = properties.getProperty("Driverpath");
	logger.info("begin execution");
	
	if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", driverloaction);
		
		driver = new ChromeDriver();
	} else if (browser.equalsIgnoreCase("firefox")) {
		
		System.setProperty("webdriver.gecko.driver", driverloaction);
		
		driver = new FirefoxDriver();
		logger.info("Browser Started");
	}
	driver.manage().window().maximize();
	driver.get(url);
	
}

}
