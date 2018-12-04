package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DataProviderTest {
	WebDriver dr;
	@Test
	public void dp(String id, String pass) {
		dr.findElement(By.id("")).sendKeys(id);
		dr.findElement(By.id("")).sendKeys(pass);
		dr.findElement(By.id("")).click();
	}
	
	

}
