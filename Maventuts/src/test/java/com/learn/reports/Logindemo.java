package com.learn.reports;

import org.testng.annotations.Test;

public class Logindemo extends ExtentReport {
	
	@Test
	
	public void loginApp()
	{
		logger=report.createTest("login FB");
		
		System.out.println("Login successfully");
		
		logger.info("Stating app");
		
		logger.pass("Login success");
	}

}
