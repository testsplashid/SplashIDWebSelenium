package com.splashid.pageObjectRepoLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.splashid.genericLib.Driver;

public class AddRecCatTypBtn {
	@FindBy (xpath="//button[@class='btn btn-simple-blue btn-sm dropdown-toggle']")
	private WebElement addBtn;
	
	public void addRecord()
	{
		addBtn.click();
		WebElement wbsel = Driver.getDriver().findElement(By.id("btnaddnewrcrds244ac"));
		Select sel = new Select(wbsel);
		sel.selectByVisibleText(" Add New Record");
	}
	
	public void addCategory()
	{
		addBtn.click();
		WebElement wbsel = Driver.getDriver().findElement(By.id("add_nw_cat_on"));
		Select sel = new Select(wbsel);
		sel.selectByVisibleText(" Add New Category");
	}
	
	public void addType()
	{
		addBtn.click();
		WebElement wbsel = Driver.getDriver().findElement(By.id("new_type_record_add"));
		Select sel = new Select(wbsel);
		sel.selectByVisibleText(" Add New Type");
	}
}
