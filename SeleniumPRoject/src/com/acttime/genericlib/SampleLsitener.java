package com.acttime.genericlib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleLsitener implements ITestListener{

	@Override
	public void onTestFailure(ITestResult t) {
//		String ftestNAme = t.getMethod().getMethodName();
//		System.out.println("====failed test===>"+ftestNAme);
//		EventFiringWebDriver eDriver = new EventFiringWebDriver
//				    (SampleScreenShotTest.driver);
//		File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
//		File dstFile = new File("./screenshot/"+ftestNAme+".png");
//		         try {
//		FileUtils.copyFile(srcFile, dstFile);
//		         } catch (IOException e) {}
	}
	
	
	@Override
	public void onTestSkipped(ITestResult r) {
		
		
	}
	
	
	
	
	
	
	
	
	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}



	

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
