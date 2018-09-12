package com.test;

import org.testng.annotations.Test;

public class SecondTest {

	@Test
	public void tc_3() throws InterruptedException
	{
		Thread.sleep(10000);
		String actualTitle = NewTest.driver.getTitle();
		System.out.println("Title is  " +   actualTitle);
	
}
}