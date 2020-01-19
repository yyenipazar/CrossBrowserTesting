package com.qa.util;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class OptionsManager {
	
	//get chrome and firefox options
	public static ChromeOptions getChoromeOptions(){
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--start-maximized");//to maximize web page
		//co.addArguments("--headless");//headless test--without browser testing
		co.addArguments("--ignore-certificate-errors");
		co.addArguments("--disable-popup-blocking");
		co.addArguments("--incognito-");//private mode fro chromebrowser
		return co;
		
	}
	public static FirefoxOptions getFirefoxOptions(){
		
		FirefoxOptions fo=new FirefoxOptions();
		FirefoxProfile profile=new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);//instead of "--ignore-certificate-errors" in Chromebrowser
		profile.setAssumeUntrustedCertificateIssuer(false);//if we don't the certificate untrusted or not
		fo.setCapability(FirefoxDriver.PROFILE, profile);//for setup
		fo.addArguments("--headless");
		
		return fo;
	}

}
