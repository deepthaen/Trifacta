package com.trifacta.Trifacta_Automation.controller;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.trifacta.Trifacta_Automation.implementation.WebImplementation;

public class BaseTest {

	public WebDriver driver;
	
	WebImplementation control;
	@BeforeMethod
	public void tearUp() {
		control = new WebImplementation(driver);
		driver = control.launchBrowser();
		control.url();
		control.maximiseBrowser();
		control.implicitWait();
	}
	
	@AfterMethod
	public void tearDown() {
		control.closeBrowser();
	}
}
