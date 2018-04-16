package com.acttime.genericlib;


import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.acttime.objectrepositorylib.Common;
import com.acttime.objectrepositorylib.Login;

public class BaseClass {
	//Object declaration
	public  static WebDriver driver;
	FileData fLib = new FileData();
    Properties pObj;
	@BeforeClass
	public void configBc() throws Throwable{
		System.out.println("=====launch browser======");
		pObj=fLib.getPropertyObject();
		String bNAme = pObj.getProperty("browser");
		if(bNAme.equals("firefox")){
		  driver = new FirefoxDriver();
		}else if(bNAme.equals("ie")){
			System.setProperty("webdriver.ie.driver", 
					       "./resource/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else if(bNAme.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", 
					       "./resource/chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
	
	@BeforeMethod
	public void configBM(){
		System.out.println("login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(pObj.getProperty("url"));
		
	     Login lPage = PageFactory.initElements(driver, Login.class);
	     lPage.login("admin", "manager");
	}
	@AfterMethod
	public void configAM(){
		System.out.println("logout");
		Common cPage = PageFactory.initElements(driver, Common.class);
		cPage.logout();
	}
	@AfterClass
	public void configAC(){
		System.out.println("=======close browser========");
		driver.close();
	}

}
