package com.trifacta.Trifacta_Automation.controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.log4testng.Logger;

public class BrowserController {

	public static WebDriver driver= null;
	public BrowserController() {
		this.driver = getInstance(); 
	}

	public static WebDriver getInstance() {
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver = new ChromeDriver(options());
			System.out.println("Launching Chrome Browser");
		}
		return driver;
	}
	
	public static ChromeOptions  options() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		return option;
		}
}
