package com.testng;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNgPractice {
	
	@Test()
	public void loginTest() {
		Assert.assertFalse(3>1);
		System.out.println("login test");
	}
	@Test(dependsOnMethods="loginTest")
	public void homePageTest2() {
		System.out.println("home page test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePageTest3() {
		System.out.println("home page test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePageTest4() {
		System.out.println("home page test");
	}

}
