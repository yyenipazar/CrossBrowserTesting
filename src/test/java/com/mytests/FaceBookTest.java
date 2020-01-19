package com.mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.factory.TLDriverFactory;

public class FaceBookTest extends TestBase {
	@Test
	public void facebookTitleTest_1(){
		TLDriverFactory.getTLDriver().get("https://www.facebook.com/");
		String title=TLDriverFactory.getTLDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Facebook - Log In or Sign Up");
	}
	@Test
	public void facebookTitleTest_2(){
		TLDriverFactory.getTLDriver().get("https://www.facebook.com/");
		String title=TLDriverFactory.getTLDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Facebook - Log In or Sign Up");
}
}