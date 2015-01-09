package com.cirrosecure.poc;

import htmldom.UIMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.cirrosecure.poc.FunctionLibrary;

import static org.testng.Assert.*;


public class POCTest extends FunctionLibrary{

	FunctionLibrary fl = new FunctionLibrary();
	WebElement we;

	//Will run before every test
	@BeforeMethod
	public void setUp() {		
		fl.open_Browser();
	}

	//Will run after every test
	@AfterMethod
	public void tearDown() {
		fl.close_Browser();		
		fl.quit_Driver();
	}

	//First test
	@Test
	public void LoginTestCase() {
		fl.launch_URL();	
		fl.verify_PageTitle("CirroSecure"); 
		By myLocator = ByXPath.xpath(UIMap.Email_TextBox);
		
		if (fl.isElementPresent(myLocator))
		{
			System.out.println(myLocator.toString());
		}
		//fl.enter_Text(UIMap.Email_TextBox, "harsh@gmail.com");
//		fl.enter_Text(UIMap.Password_TextBox, "Puma#123");	
//		fl.click_Button(UIMap.SignIn_Button);
		/*
		try {
			WebElement we  = fl.waitForPageLoad_referenceElement(UIMap.AddCloudApp_Button);
			fl.verify_PageLoaded(we);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		fl.click_Button(UIMap.SignOut_Button);
		*/
	}
}