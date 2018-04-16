package com.acttime.projectcustTest;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.acttime.genericlib.BaseClass;
import com.acttime.genericlib.FileData;
import com.acttime.genericlib.WebDriverCommonLib;
import com.acttime.objectrepositorylib.ActiveProjectAndCustomer;
import com.acttime.objectrepositorylib.CreateNewCustomer;
import com.acttime.objectrepositorylib.Home;
import com.acttime.objectrepositorylib.Login;
import com.acttime.objectrepositorylib.OpenTask;
import com.sun.javafx.webkit.Accessor.PageAccessor;

public class CustomerProjectTest  extends BaseClass{
	FileData fLib = new FileData();
	WebDriverCommonLib wlib = new WebDriverCommonLib();

	@Test
	public void createCustomerTest() throws InvalidFormatException, IOException, Throwable  { 
		String cNAme = fLib.getExcelData("Sheet2", 1, 2);
    //step 2 : navigate to Task PAge
		Home hPage = PageFactory.initElements(driver, Home.class);
		hPage.navigateToTaskPage();
	//step 3 : navigate to Project and Customer Page
		OpenTask taskPage = PageFactory.initElements(driver, OpenTask.class);
		taskPage.navigateToProjectAndCustomerPage();
	//step 4 : navigate to CreateNewCustomer Page
		ActiveProjectAndCustomer aCustPAge = PageFactory.initElements(driver, ActiveProjectAndCustomer.class);
		aCustPAge.navigateToCreateCustomerPage();
	//step 5 : create Customer	
		CreateNewCustomer cPage = PageFactory.initElements(driver, CreateNewCustomer.class);
		cPage.createCustomer(cNAme);
	}
	
	@Test
	public void createCusomerWithDesp() throws Throwable, IOException, Throwable{
		String cNAme = fLib.getExcelData("Sheet2", 2, 2);
		String cDescp = fLib.getExcelData("Sheet2", 2, 3);
	    //step 2 : navigate to Task PAge
			Home hPage = PageFactory.initElements(driver, Home.class);
			hPage.navigateToTaskPage();
			wlib.waitForPageToLoad();
			
		//step 3 : navigate to Project and Customer Page
			OpenTask taskPage = PageFactory.initElements(driver, OpenTask.class);
			taskPage.navigateToProjectAndCustomerPage();
		//step 4 : navigate to CreateNewCustomer Page
			ActiveProjectAndCustomer aCustPAge = PageFactory.initElements(driver, ActiveProjectAndCustomer.class);
			aCustPAge.navigateToCreateCustomerPage();
		//step 5 : create Customer	
			CreateNewCustomer cPage = PageFactory.initElements(driver, CreateNewCustomer.class);
			cPage.createCustomer(cNAme,cDescp);
	}


}



