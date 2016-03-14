package com.splashid.verificationLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.splashid.genericLib.Driver;

public class AddRecordVerification {
	@FindBy(id="srchrecords")
	private WebElement SearchRecords;
	
	@FindBy(id="editdescriptiondc")
	private WebElement RecordDescription;
	
	public void searchRecord(String RecordTitle,String Description){
		SearchRecords.sendKeys(RecordTitle);
		Driver.driver.findElement(By.partialLinkText(Description)).click();
		Assert.assertEquals(RecordTitle, Description);
	}
	
	

}
