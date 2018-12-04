package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class BaseTest {
	WebDriver dr;
	
	@Test
	public void printmethod1(String b, String r) {
		System.out.println("print method 1");
		if(b.equals("chrome")) {
			if(r.equals("local")) {
				System.setProperty("webdriver.chrome.driver", "/Users/anamulhoque/Downloads/chromedriver/");
				 dr = new ChromeDriver();
			}
		}
		
		
		if(b.equals("firefox")) {
			if(r.equals("local")) {
				System.setProperty("webdriver.chrome.driver", "/Users/anamulhoque/Downloads/chromedriver/");
				 dr = new ChromeDriver();
			}
		}
	}
	
	@Test(dependsOnMethods="printmethod1")
	public void printmethod2() {
		System.out.println("print method 2");
		Assert.assertTrue(3>5);
	}

}
