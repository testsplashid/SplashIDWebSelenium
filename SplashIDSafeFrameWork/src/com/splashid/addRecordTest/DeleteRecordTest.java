package com.splashid.addRecordTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.splashid.genericLib.Constants;
import com.splashid.genericLib.Driver;
import com.splashid.pageObjectRepoLib.AddRecCatTypBtn;
import com.splashid.pageObjectRepoLib.AddRecord;
import com.splashid.pageObjectRepoLib.Common;
import com.splashid.pageObjectRepoLib.Login;
import com.splashid.pageObjectRepoLib.UserBase;

public class DeleteRecordTest {

	WebDriver driver;
	Login loginPage;
	AddRecord addRecordPage;
	UserBase userBasePage;
	AddRecCatTypBtn addRecCatTypPage ;
	Common comPage;
	
	@BeforeClass
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
	public void deleteRecordTest () throws InterruptedException
	{
		String deleteRecord="TestDes";
		userBasePage.deleteRecord(deleteRecord);
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