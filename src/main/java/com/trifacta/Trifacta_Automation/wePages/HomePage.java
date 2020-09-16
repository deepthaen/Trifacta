package com.trifacta.Trifacta_Automation.wePages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.trifacta.Trifacta_Automation.controller.WebController;
import com.trifacta.Trifacta_Automation.implementation.WebImplementation;
import com.trifacta.Trifacta_Automation.utils.PropertyRead;

public class HomePage extends WebImplementation {
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@data-label='Email']/input")
	public WebElement username;
	
	
	@FindBy(xpath="//*[@data-label='Password']/input")
	public WebElement password;
	
	@FindBy(xpath="(//div[text()='Log in'])[2]")
	public WebElement loginButton;
	
	@FindBy(xpath="//a[text()='Login']")
	public WebElement login_Link;
	
	@FindBy(xpath="//div[@class='m-icon help tricon']")
	public WebElement info_link;
	
	@FindBy(xpath="//div[text()='About Trifacta Wrangler']")
	public WebElement about_link;
	
	@FindBy(xpath="(//h4[text()='About Trifacta Wrangler'])/../../div[3]/p")
	public WebElement version;
	
	@FindBy(xpath="(//button[@class='close tricon'])")
	public WebElement close;
	
	@FindBy(xpath="//div[@data-id='user-avatar']")
	public WebElement user;
	
	@FindBy(xpath="//div[text()='Log out']")
	public WebElement logout;
	
	
	public HomePage clickonInfo() {
		waitForElementClickable(info_link);
		info_link.click();
		return this;
		
	}
	public HomePage clickon_About() {
		waitForElementClickable(about_link);
		takeScreenshot("InfoTab");
		about_link.click();
		return this;
		
	}
	
	public HomePage getProdVersion() {
		
		waitForElementClickable(version);
		takeScreenshot("ProductVersion");
		String text = version.getText();
		System.out.println("*****************************");
		System.out.println("Product Version :: "+text);
		System.out.println("*****************************");
		
		return this;
	}
	public HomePage clickonClose() {
		waitForElementClickable(close);
		close.click();
		return this;
	}
	
	public HomePage clickon_user() {
		waitForElementClickable(user);
		user.click();
		return this;
	}
	public HomePage clickon_Logout() {
		waitForElementClickable(logout);
		takeScreenshot("UserMenu");
		logout.click();
		takeScreenshot("LogoutSuccess");
		return this;
	}
	
	
	
			
			
	
	public HomePage clickonLogin() {
		takeScreenshot("HomePage");
		waitForElementClickable(login_Link);
		login_Link.click();
		
		return this;
	}
	
	

	
	
	public HomePage logintoApplication() {
		waitForElementClickable(username);
		takeScreenshot("LoginPage");
		username.sendKeys(PropertyRead.getProp_Value("USERNAME"));
		password.sendKeys(PropertyRead.getProp_Value("PASSWORD"));
		loginButton.click();
		waitForElementClickable(username);
		takeScreenshot("AfTerLogin");
		return this;
	}
	
	
}
