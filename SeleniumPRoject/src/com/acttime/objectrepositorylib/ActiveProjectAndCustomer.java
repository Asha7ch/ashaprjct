package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveProjectAndCustomer {

	
	@FindBy(xpath="//input[@value='Create New Customer']")
	WebElement createCustomerBtn;
	
	@FindBy(xpath="//input[@value='Create New Project']")
	WebElement createProjectBtn;
	
	
	public void navigateToCreateCustomerPage(){
		createCustomerBtn.click();
	}
	public void navigateToCreateProjectPage(){
		createProjectBtn.click();
	}
}







