package com.splashid.pageObjectRepoLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.splashid.genericLib.Constants;
import com.splashid.genericLib.Driver;

public class Login {
	@FindBy(id="emailid")
	private WebElement usrNameEdt;
	
	@FindBy (id="btnSubmit")
	private WebElement nxtBtn;
	
	@FindBy (id="password")
	private WebElement pwdEdt;
	
	@FindBy (id="btnPersonal")
	private WebElement sbmtBtn;
	
	public void loginIntoApp(String UserName, String Password)
	{
		Driver.driver.manage().window().maximize();
		Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.driver.get(Constants.url);
		usrNameEdt.sendKeys(UserName);
		nxtBtn.click();
		pwdEdt.sendKeys(Password);
		sbmtBtn.click();
	}
	
}
