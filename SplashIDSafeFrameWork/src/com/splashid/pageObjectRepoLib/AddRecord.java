package com.splashid.pageObjectRepoLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRecord {
	
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
	
	public void addData(String F1, String F2, String F3,String F4,String F5,String F6,String F7,String F8,String F9){
		fieldOne.sendKeys(F1);
		fieldTwo.sendKeys(F2);
		fieldThree.sendKeys(F3);
		fieldFour.sendKeys(F4);
		fieldFive.sendKeys(F5);
		fieldSix.sendKeys(F6);
		fieldSeven.sendKeys(F7);
		fieldEight.sendKeys(F8);
		fieldNine.sendKeys(F9);
	}
	public void saveRecord() {
		saveRecordBtn.click();
	}
	
	public void saveRecordAddAnother() {
		saveRecordAddAnotherBtn.click();
	}
	
}
