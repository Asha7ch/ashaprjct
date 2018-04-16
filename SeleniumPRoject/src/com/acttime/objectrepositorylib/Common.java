package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Common {
	
	@FindBy(linkText="Logout")
	WebElement logoutLnk;
	
	public void logout(){
		logoutLnk.click();
	}

}






