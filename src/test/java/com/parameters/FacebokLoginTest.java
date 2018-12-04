package com.parameters;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebokLoginTest {
	WebDriver dr;
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/anamulhoque/Downloads/chromedriver");
		dr = new ChromeDriver();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.get("http://www.facebook.com");
		
	}
	@DataProvider(name="getTestData")
	public Object[][] getTestData() throws IOException {
		Object[][] data=new Object[7][2];
		data = UtilTest.getTestData("/Users/anamulhoque/eclipse-workspace/TestNGAnotation/src/test/java/com/parameters/FaceBookdata.xlsx");
		return data;
	}
	
	
	@Test(dataProvider="getTestData")
	public void facebookLoginTest(String id, String pass) {
		dr.findElement(By.id("email")).sendKeys(id.toString());
		dr.findElement(By.id("pass")).sendKeys(pass.toString());
		
		//dr.findElement(By.id("")).click();
		
	}
/*	@Test
	public void open() {
		System.out.println("hi");
	}*/
	
	
	@AfterMethod
	public void tearDown() {
		
		dr.quit();
	}
}
