package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTask {
	
	@FindBy(linkText="Projects & Customers")
	WebElement projAndCustomerLnk;
	
	public void navigateToProjectAndCustomerPage(){
		projAndCustomerLnk.click();
	}

}
