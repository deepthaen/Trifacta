package com.trifacta.Trifacta_Automation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trifacta.Trifacta_Automation.controller.BaseTest;
import com.trifacta.Trifacta_Automation.controller.WebController;
import com.trifacta.Trifacta_Automation.implementation.WebImplementation;
import com.trifacta.Trifacta_Automation.wePages.HomePage;

public class ProductVersionTest extends BaseTest {

	HomePage home;

	
	@Test
	public void productVersion() {
		home = new HomePage(driver);
		home.clickonLogin()
		.logintoApplication()
		.clickonInfo().clickon_About()
		.getProdVersion().clickonClose()
		.clickon_user().clickon_Logout();
	}



	














}
