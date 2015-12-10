package com.splashid.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Driver {
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		if(Constants.browser.equals("chrome")){
		 	System.setProperty("webdriver.chrome.driver", 
		      "F:\\SeleniumTools\\chromedriver.exe");
		   driver = new ChromeDriver();
		}else{
			driver = new FirefoxDriver();
		}
		
		return driver;
	}
}
