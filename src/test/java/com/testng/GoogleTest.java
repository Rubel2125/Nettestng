package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class GoogleTest {
	

	
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
	}
	
	@Test(priority=3,groups="logo")
	public void googleLogoTest() {
		boolean b=dr.findElement(By.id("hplogo")).isDisplayed();
	}
	
	@Test(priority=2,groups="link")
	public void mailLinkTest() {
		boolean b=dr.findElement(By.linkText("Gmail")).isDisplayed();
	}
	@Test(priority=4,groups="test")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(priority=5,groups="test")
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(priority=6,groups="test")
	public void test3() {
		System.out.println("test3");
	}
	
	@AfterMethod
	public void closBrowser() {
		dr.quit();
	}

}
