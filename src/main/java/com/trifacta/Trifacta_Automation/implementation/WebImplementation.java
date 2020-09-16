package com.trifacta.Trifacta_Automation.implementation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.trifacta.Trifacta_Automation.controller.BrowserController;
import com.trifacta.Trifacta_Automation.controller.WebController;
import com.trifacta.Trifacta_Automation.utils.PropertyRead;



public class WebImplementation {
	public WebDriver driver;
	public WebImplementation(WebDriver driver){
		this.driver= driver;
	}
	
	public WebDriver launchBrowser() {
		this.driver = BrowserController.getInstance();
		return driver;
	}

	
	public void maximiseBrowser() {
		driver.manage().window().maximize();
		System.out.println("Maximizing Browser");
	}

	
	public void url() {
		String url = PropertyRead.getProp_Value("URL");
		System.out.println("Feteching URL"+ url);
		driver.get(url);
	}

	
	public void waits() {
		// TODO Auto-generated method stub
		
	}

	
	public void quitBrowser() {
		driver.quit();
		System.out.println("quiting ");
		
	}

	

	
	public void closeBrowser() {
		driver.close();
		
	}

	
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Implicitly Waiting");
		
	}


	public void takeScreenshot(String name) {
		
		try {
			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("./Screenshots/"+name+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void waitForElementClickable(WebElement W) {
		WebDriverWait wait = new WebDriverWait(driver, 190);
		wait.until(ExpectedConditions.elementToBeClickable(W));
		
	}
	
	

}
