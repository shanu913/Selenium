package com.learn.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learn.pages.BaseClass;
import com.learn.pages.Loginpage;

public class LoginTest extends BaseClass {
	
	@Test
	
	public void loginApp() throws InterruptedException
	{
		
		logger=report.createTest("Login to page");
		Loginpage loginPage=PageFactory.initElements(driver, Loginpage.class);
		
		logger.info("Starting app");
		
		loginPage.loginToCRM("test@gmail.com", "123456");
		
		logger.pass("login success");
		
		
		//System.out.println(driver.getCurrentUrl());

}
	
	
}