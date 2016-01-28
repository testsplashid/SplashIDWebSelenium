package com.splashid.pageObjectRepoLib;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.splashid.genericLib.Driver;

public class AddRecCatTypBtn {
	@FindBy (xpath="//button[@class='btn btn-simple-blue btn-sm dropdown-toggle']")
	private WebElement addBtn;
	
	public void addRecord()
	{	
		addBtn.click();
		Actions act = new Actions(Driver.driver);
		act.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).perform();
		//act.click();
		//act.perform();
		
		//WebElement wb = Driver.getDriver().findElement(By.xpath("//body/div[1]/div/div[3]/div/div/button[@class='btn btn-simple-blue btn-sm dropdown-toggle']"));
		//Actions mouse = new Actions(Driver.getDriver());
		//mouse.moveToElement(wb).click();
		//WebElement wb2 = Driver.getDriver().findElement(By.id("btnaddnewrcrds244ac"));
		//mouse.moveToElement(wb2).click();
		//mouse.build(); // You don't need the sleep after this before calling perform()
		//mouse.perform(); 
		//Driver.getDriver().findElement(By.cssSelector("html.no-js body.header-default.footer-fixed div.navbar.navbar-inverse.navbar-fixed-top div.container div.navbar-tools div.nav.navbar-right div.btn-group.open ul.dropdown-menu li a#btnaddnewrcrds244ac"));
		//Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/ul/li[1]/a"));
	   // Driver.getDriver().findElement(By.id("btnaddnewrcrds244ac")).click();
	//elect sel = new Select(wbsel);
	//el.selectByVisibleText("                                     Add New Record                                 ");
	}
	
	public void addCategory()
	{
		addBtn.click();
		Actions act = new Actions(Driver.driver);
		act.sendKeys(Keys.chord(Keys.DOWN,Keys.DOWN,Keys.ENTER)).perform();
	}
	
	public void addType()
	{
		addBtn.click();
		Actions act = new Actions(Driver.driver);
		act.sendKeys(Keys.chord(Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.ENTER)).perform();;
	}
}
