package com.mytests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.factory.TLDriverFactory;

public class TestBase {
	
	//to start the system with set and get, we created this page
	public WebDriverWait wait;
	@BeforeMethod
	@Parameters(value={"browser"})
	public void setUp(String browser){
		TLDriverFactory.setTLDriver(browser);
		wait=new WebDriverWait(TLDriverFactory.getTLDriver(), 15);
	}
	@AfterMethod
	public synchronized void teardown(){
		TLDriverFactory.getTLDriver().quit();
	}
	

}
