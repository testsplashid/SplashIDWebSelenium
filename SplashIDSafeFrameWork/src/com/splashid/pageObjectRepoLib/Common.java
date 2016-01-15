package com.splashid.pageObjectRepoLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Common {
	//Sign-out
		@FindBy (xpath ="//span[contains(text(),'Sign Out')]")
		private WebElement sgnOutbtn;
		public void signOut()
		{
			sgnOutbtn.click();
		}

}
