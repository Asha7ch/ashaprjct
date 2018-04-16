package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCustomer {
	@FindBy(name="name")
	WebElement customerNAmeEdt;
	
	@FindBy(name="description")
	WebElement customerDespEdt;
	
	@FindBy(name="createCustomerSubmit")
	WebElement createCstomerBtn;

	public void createCustomer(String customerNAme){
		customerNAmeEdt.sendKeys(customerNAme);
		createCstomerBtn.click();		
	}
	public void createCustomer(String customerNAme,String descp){
		customerNAmeEdt.sendKeys(customerNAme);
		customerDespEdt.sendKeys(descp);
		createCstomerBtn.click();	
		
	}
	
	
}
