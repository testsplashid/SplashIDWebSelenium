package com.splashid.pageObjectRepoLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;

import com.splashid.genericLib.Driver;

public class UserBase{
	
	//SplashID Safe Menu- Records Homepage	
	@FindBy (xpath="//span[contains(text(),'SplashID Safe')]")
	private WebElement splashIdSafebtn;
	
	//Dashboard Menu
	@FindBy (xpath="//span[contains(text(),'Dashboard')]")
	private WebElement dashBoardbtn;
	
	//Backup Menu
	@FindBy (xpath ="//span[contains(text(),'SplashID Backup')]")
	private WebElement backUpbtn;
	
	//Accounts page menu
	@FindBy (xpath ="//span[contains(text(),'Account')]")
	private WebElement accntbtn;
	
	//Edit Categories menu
	@FindBy (xpath ="//span[contains(text(),'Edit Categories')]")
	private WebElement edtCatbtn;
	
	//Edit Type menu
	@FindBy (xpath ="//span[contains(text(),'Edit Types')]")
	private WebElement edtTypbtn;
	
	//Duplicate-Records button
	@FindBy (xpath="//button[@class='defaultrecbtns_dup btn btn-simple-blue btn-sm editable-submit']")
	private WebElement dupicateRecord;
	
	//Delete Record
	@FindBy (xpath="//button[@class='btn btn-simple-red btn-sm editable-cancel']")
	private WebElement deleteRecord;
	
	@FindBy(xpath= "//*[@id='editdescriptiondc']")
	private WebElement vfieldOne;
	
	@FindBy(id="editfieldValue2dc")
	private WebElement vfieldTwo;

	@FindBy(id="editfieldValue3dc")
	private WebElement vfieldThree;
	
	@FindBy(id="editfieldValue4dc")
	private WebElement vfieldFour;
	
	@FindBy(id="editfieldValue5dc")
	private WebElement vfieldFive;
	
	@FindBy(id="editfieldValue6dc")
	private WebElement vfieldSix;
	
	@FindBy(id="editfieldValue7dc")
	private WebElement vfieldSeven;
	
	@FindBy(id="editfieldValue8dc")
	private WebElement vfieldEight;
	
	@FindBy(id="editfieldValue9dc")
	private WebElement vfieldNine;
	
	public void duplicatRecords()
	{
		dupicateRecord.click();
	}
	
	public void deleteRecords()
	{
		deleteRecord.click();
	}
	public void navigateToRecordsHomePage()
	{
		splashIdSafebtn.click();
	}
	
	public void navigateToDashboard()
	{
		dashBoardbtn.click();
	}
	
	public void navigateToBackup(){
		backUpbtn.click();
	}
	
	public void navigateToAccountsPage()
	{
		accntbtn.click();
	}
	
	public void navigateToEdtCatPage()
	{
		edtCatbtn.click();
	}
	
	public void navigateToEdtTypePage()
	{
		edtTypbtn.click();
	}
	
	
	public void AddRecordVerification(String S1, String S2, String S3,String S4,String S5,String S6,String S7,String S8,String S9) throws InterruptedException {
		Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.driver.navigate().refresh();
		Driver.driver.findElement(By.id("srchrecords")).sendKeys(S1);
		Driver.driver.findElement(By.xpath("//table/tbody/tr/td/b[contains(text(),'TestDescription')]")).click();
		Thread.sleep(8000);
		Assert.assertEquals(vfieldOne.getText(), S1);
		Assert.assertEquals(vfieldTwo.getText(), S2);
		Assert.assertEquals(vfieldThree.getText(), S3);
		Assert.assertEquals(vfieldFour.getText(), S4);
		Assert.assertEquals(vfieldFive.getText(), S5);
		Assert.assertEquals(vfieldSix.getText(), S6);
		Assert.assertEquals(vfieldSeven.getText(), S7);
		
		Assert.assertEquals(vfieldEight.getText(), S8);
		Assert.assertEquals(vfieldNine.getText(), S9);
}
	
}
