package com.acttime.loginTest;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.acttime.genericlib.FileData;
import com.acttime.genericlib.WebDriverCommonLib;
import com.acttime.objectrepositorylib.Login;

public class LoginTest{
	FileData fLib = new FileData();
	WebDriver driver;
	Properties pObj;
	
	@BeforeClass
	public void confifBC() throws Throwable{
		 pObj = fLib.getPropertyObject();
		 driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void verifyInvalidUSernameTest() throws Throwable{
		//reading test data from Excel
		String invalidusername = fLib.getExcelData("Sheet2", 3, 2);
		String errorMsg = fLib.getExcelData("Sheet2", 3, 3);

		driver.get(pObj.getProperty("url"));
		
		Login lpage = PageFactory.initElements(driver, Login.class);
		//enter invalid username 
	   lpage.getUsernameEdt().sendKeys(invalidusername);
	   lpage.getLoginBtn().click();
	   String actMSg = lpage.getErrorMsg().getText();
		//verify Error msg
		Assert.assertEquals(errorMsg, actMSg);
	}
		
	@Test
	public void verifyInvalidPasswordTest() throws Throwable{
		//reading test data from Excel
		String invalidpassword = fLib.getExcelData("Sheet2", 4, 2);
		String errorMsg = fLib.getExcelData("Sheet2", 4, 3);

		
		driver.get(pObj.getProperty("url"));
		
		//enter invalid password
		Login lpage = PageFactory.initElements(driver, Login.class);
         lpage.getPasswordEdt().sendKeys(invalidpassword);
         lpage.getLoginBtn().click();
         
         WebDriverCommonLib wLib = new WebDriverCommonLib();
         wLib.waitForElement(lpage.getErrorMsg());
         
         String actMSg = lpage.getErrorMsg().getText();
         
		//verify Error msg
		Assert.assertEquals(errorMsg, actMSg);
	
	}
	
	@Test
	public void verifyErrorMsgWithOutDataTest() throws InvalidFormatException, IOException, Throwable{
		//reading test data from Excel
		String errorMSg = fLib.getExcelData("Sheet2", 5, 2);
		driver.get(pObj.getProperty("url"));
		
		
		//click on login Button with out data
		Login lpage = PageFactory.initElements(driver, Login.class);
		lpage.getLoginBtn().click();
		
		 String actMSg = lpage.getErrorMsg().getText();
         
		//verify Error msg
	   Assert.assertEquals(errorMSg, actMSg);
	}
	
	@AfterClass
	public void configAc(){
		driver.close();
	}

	

}








