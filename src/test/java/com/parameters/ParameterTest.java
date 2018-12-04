package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver dr;
	
	@Test
	@Parameters({"url", "emailid"})
	public void yahooLogIns(String url, String emailid) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/anamulhoque/Downloads/chromedriver");
		dr = new ChromeDriver();
		dr.get(url);
		Thread.sleep(2000);
		dr.findElement(By.xpath("//span[@class='Mstart(2px)']")).click();
		Thread.sleep(3000);
		dr.findElement(By.id("login-username")).sendKeys(emailid);
		dr.findElement(By.id("login-signin")).click();
		
	}
	

}
