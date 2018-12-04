package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest22 {

	@BeforeSuite
	public void beforeSuite() {
		System.err.println("setup system property for chrome");
	}

	@BeforeTest
	public void beforeTest() {
		System.err.println("lunch browser");
	}

	@BeforeClass
	public void beforeClass() {
		System.err.println("login app");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.err.println("enter URL");
	}

	@Test
	public void test01() {
		System.err.println("google title test");
	}

	@AfterMethod
	public void afterMethod() {
		System.err.println("logout from app");
	}

	@AfterClass
	public void afterClass() {
		System.err.println("close browser");
	}

	@AfterTest
	public void afterTest() {
		System.err.println("delete all cookies");
	}

	@AfterSuite
	public void afterSuite() {
		System.err.println("generate reports");
	}

}
