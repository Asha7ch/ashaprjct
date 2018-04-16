package com.acttime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {
	
	public void waitForPageToLoad(){
		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void waitForElement(WebElement expElemnet){
		
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(expElemnet));
	}
	
	public void select(WebElement wbelemnet , String visibleText){
		Select sel = new Select(wbelemnet);
		sel.selectByVisibleText(visibleText);
	}

}
