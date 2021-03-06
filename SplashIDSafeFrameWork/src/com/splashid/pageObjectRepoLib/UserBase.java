package com.splashid.pageObjectRepoLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
		Actions mouseHoverDes = new Actions(Driver.driver);
		WebElement we = Driver.driver.findElement(By.id("editdescriptiondc"));
		mouseHoverDes.moveToElement(we).build().perform();
		//Driver.driver.findElement(By.xpath("//*[@id='crnsrrv2ce399g']/div[16]/div")).click();
		Actions scrollDownRecordDetails = new Actions(Driver.driver);
		//scrollDownRecordDetails.moveToElement();
		scrollDownRecordDetails.sendKeys(Keys.chord(Keys.DOWN,Keys.ARROW_DOWN)).perform();
		Assert.assertEquals(vfieldEight.getText(), S8);
		Assert.assertEquals(vfieldNine.getText(), S9);
}
	public void editRecord(String edtDescription) throws InterruptedException
	{
		Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Driver.driver.navigate().refresh();
		Driver.driver.findElement(By.id("srchrecords")).sendKeys("TestDes");
		Driver.driver.findElement(By.xpath("//table/tbody/tr/td/b[contains(text(),'TestDescription')]")).click();
		Driver.driver.findElement(By.id("editdescriptiondc")).click();
		Thread.sleep(4000);
		Driver.driver.findElement(By.id("editdescription")).clear();
		Driver.driver.findElement(By.id("editdescription")).sendKeys(edtDescription);
		Driver.driver.findElement(By.xpath("//button[@class='svsrnrcrdsc btn btn-primary btn-sm editable-submit']")).click();
		Thread.sleep(4000);
		
	}
	
	public void editRecorVerification(String editedString) throws InterruptedException
	{
		Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.driver.navigate().refresh();
		Driver.driver.findElement(By.id("srchrecords")).sendKeys("TestDes");
		Driver.driver.findElement(By.xpath("//table/tbody/tr/td/b[contains(text(),'TestDescription')]")).click();
		Thread.sleep(4000);
		Assert.assertEquals(vfieldOne.getText(), editedString);
	}
	
	public void deleteRecord(String deleteRecord) throws InterruptedException
	{
		Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.driver.findElement(By.id("srchrecords")).sendKeys("TestDes");
		Driver.driver.findElement(By.xpath("//table/tbody/tr/td/b[contains(text(),'TestDescriptionEdit')]")).click();
		Driver.driver.findElement(By.xpath("//button[@class='btn btn-simple-red btn-sm editable-cancel']")).click();
		Driver.driver.findElement(By.xpath("//button[@id='cnfrmdlt_dups']")).click();
		Thread.sleep(4000);
	}
	
}
