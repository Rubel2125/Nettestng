package com.testng;
import org.testng.annotations.Test;


public class InvocationCountTest {
	
	@Test(invocationCount=5)
	public void sum() {
		int a= 10;
		int b= 20;
		int c= 30;
	}

}
