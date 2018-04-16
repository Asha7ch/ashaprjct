package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {	
	@FindBy(name="username")
	 private WebElement usernameEdt;
	
	@FindBy(name="pwd")
	private WebElement passwordEdt;
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	
	
	@FindBy(xpath="//span[text()='Username or Password is invalid. Please try again.']")
	private WebElement errorMsg;
	
	
	// ENCAPSLATION
	//provide read accesses to test writer
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}
	public WebElement getPasswordEdt() {
		return passwordEdt;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getErrorMsg() {
		return errorMsg;
	}
	
	
	//overLoading mtd
	public void login(String username, String password){
		usernameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginBtn.click();
	}
	public void login(){
		usernameEdt.sendKeys("admin");
		passwordEdt.sendKeys("manager");
		loginBtn.click();
	}
	
	

}





