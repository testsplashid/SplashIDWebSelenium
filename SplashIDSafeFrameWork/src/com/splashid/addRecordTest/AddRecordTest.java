package com.splashid.addRecordTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.splashid.genericLib.Constants;
import com.splashid.genericLib.Driver;
import com.splashid.pageObjectRepoLib.AddRecCatTypBtn;
import com.splashid.pageObjectRepoLib.AddRecord;
import com.splashid.pageObjectRepoLib.Common;
import com.splashid.pageObjectRepoLib.Login;
import com.splashid.pageObjectRepoLib.UserBase;
import com.splashid.verificationLib.AddRecordVerification;

public class AddRecordTest {
	
	WebDriver driver;
	Login loginPage;
	AddRecord addRecordPage;
	UserBase userBasePage;
	AddRecCatTypBtn addRecCatTypPage ;
	Common comPage;
	AddRecordVerification recordVerification;
	
	@org.testng.annotations.BeforeClass
	public void configureBeforeClass(){
		driver = Driver.getDriver();
		loginPage = PageFactory.initElements(driver, Login.class);
		comPage = PageFactory.initElements(driver, Common.class);
		addRecordPage = PageFactory.initElements(driver, AddRecord.class);
		addRecCatTypPage = PageFactory.initElements(driver, AddRecCatTypBtn.class);
		userBasePage = PageFactory.initElements(driver, UserBase.class);
	}
	
	@BeforeMethod
	public void configBeforeMethod(){
		String UserName = Constants.UserName;
		String Password = Constants.Password;
		loginPage.loginIntoApp(UserName,Password);
	}
	
	@Test
	public void addNewRecordTest() throws InterruptedException{
		//Step 1: Navigate to Add record page
		addRecCatTypPage.addRecord();
		//Step 2: Fill in the details
		addRecordPage.addData("Business","Combinations","TestDescription","T2", "T3", "T4","T5","T6","T7","T8", "T9");
		//JavascriptExecutor jse = (JavascriptExecutor)Driver.driver;
		//jse.executeScript("scroll(0, 250)");
		addRecordPage.saveRecord();
		Thread.sleep(8000);
	}
	
	@Test
	public void verifyNewRecordAddedTest()
	{
		recordVerification.searchRecord("TestDescription", "TestDescription");
	}
	@AfterMethod
	public void configAfterMethod(){
		comPage.signOut();
	}
	
	@org.testng.annotations.AfterClass
	public void configAfterClass(){
		driver.quit();
	}
	
	

}
