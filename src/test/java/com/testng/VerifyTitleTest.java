package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyTitleTest {
	
	WebDriver dr;
	@BeforeMethod
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/anamulhoque/Downloads/chromedriver");
		dr = new ChromeDriver();
		//dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.get("http://www.google.com");
	}
	
	@Test(priority=1,groups="title")
	public void googleTitleTest() {
		String title = dr.getTitle();
		System.out.println("title");
		
		Assert.assertEquals(title, "Google123", "title is not matched");
	}
	@AfterMethod
	public void closBrowser() {
		dr.quit();
	}


}
