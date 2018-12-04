package com.testng;

import org.openqa.selenium.TimeoutException;
import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
 
	
	@Test(timeOut=1,expectedExceptions=Exception.class)
  public void infintLoopTest() {
		int i=1;
		while(i==1) {
			System.out.println(i);
		}
		
  }
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void intergerTest() {
		String s="100a";
		Integer.parseInt(s);
	}
}
