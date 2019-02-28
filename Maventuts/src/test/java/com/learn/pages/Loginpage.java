package com.learn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Loginpage {
	
	
	WebDriver driver;
	
	
	public void loginApp(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(xpath="//input[@name=\"emails\"]") WebElement email;
	
	@FindBy(xpath="//input[@name=\"password\"]") WebElement pass;
	
	@FindBy(xpath="//div[@class=\"ui fluid large blue submit button\"]") WebElement login;
	
	
	public void loginToCRM(String emailapp, String passapp)
	
	{
		email.sendKeys(emailapp);
		pass.sendKeys(passapp);
		
		login.click();
		
	}

}
