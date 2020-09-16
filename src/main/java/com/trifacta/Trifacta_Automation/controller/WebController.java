package com.trifacta.Trifacta_Automation.controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface WebController {
	
	public WebDriver launchBrowser();
	public void maximiseBrowser();
	public void url();
	public void waits();
	void quitBrowser();
	void closeBrowser();
	void implicitWait() ;
	

}
