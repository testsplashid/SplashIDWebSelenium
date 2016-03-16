package com.splashid.pageObjectRepoLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.splashid.genericLib.Driver;
import com.thoughtworks.selenium.Selenium;

public class AddRecord {
	@FindBy (id= "editcategoryName")
	private WebElement CategorySelect;
	
	@FindBy (id= "select2-drop")
	private WebElement TypeSelect;
	
	@FindBy(id= "editdescriptionnew")
	private WebElement fieldOne;
	
	@FindBy(id="editfieldValue2new")
	private WebElement fieldTwo;

	@FindBy(id="editfieldValue3new")
	private WebElement fieldThree;
	
	@FindBy(id="editfieldValue4new")
	private WebElement fieldFour;
	
	@FindBy(id="editfieldValue5new")
	private WebElement fieldFive;
	
	@FindBy(id="editfieldValue6new")
	private WebElement fieldSix;
	
	@FindBy(id="editfieldValue7new")
	private WebElement fieldSeven;
	
	@FindBy(id="editfieldValue8new")
	private WebElement fieldEight;
	
	@FindBy(id="editfieldValue9new")
	private WebElement fieldNine;
	
	@FindBy(id="srrncrds902tfc")
	private WebElement saveRecordBtn;
	
	@FindBy(id="srrncrds902tfc_addanother")
	private WebElement saveRecordAddAnotherBtn;
	
	@FindBy(id="srchrecords")
	private WebElement SearchRecords;
	
	public void addData(String Cat,String Typ,String F1, String F2, String F3,String F4,String F5,String F6,String F7,String F8,String F9) throws InterruptedException{
		Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(8000);
		
		Driver.driver.findElement(By.id("s2id_editcategoryName")).click();
		Select select = new Select(Driver.driver.findElement(By.id("editcategoryName")));
		select.selectByVisibleText(Cat);
		
		Driver.driver.findElement(By.id("s2id_editSelcttype")).click();
		//Select Typselect = new Select(Driver.driver.findElement(By.id("editSelcttype")));
		Driver.driver.findElement(By.xpath(".//*[@id='select2-drop']/div/input")).sendKeys(Typ);
		//select.selectByVisibleText(Typ);
		Actions act1 = new Actions(Driver.driver);
		act1.sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ENTER)).perform();
	    Thread.sleep(8000);
		//select.deselectAll();
		//select.selectByVisibleText(Typ);
		
		fieldOne.sendKeys(F1);
		fieldTwo.sendKeys(F2);
		fieldThree.sendKeys(F3);
		fieldFour.sendKeys(F4);
		fieldFive.sendKeys(F5);
		fieldSix.sendKeys(F6);
		fieldSeven.sendKeys(F7);
		Actions act2= new Actions(Driver.driver);
		act2.sendKeys(Keys.chord(Keys.TAB,Keys.TAB)).perform();
		fieldEight.sendKeys(F8);
		act2.sendKeys(Keys.chord(Keys.TAB,Keys.TAB)).perform();
		fieldNine.sendKeys(F9);
		act2.sendKeys(Keys.chord(Keys.TAB,Keys.TAB)).perform();
	}
	public void saveRecord() {
		saveRecordBtn.click();
	}
	
	public void saveRecordAddAnother() {
		saveRecordAddAnotherBtn.click();
	}
	
	

}