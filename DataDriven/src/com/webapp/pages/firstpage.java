package com.webapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class firstpage {
	
	
	WebDriver driver;
	
	public firstpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(id="user_login")
	WebElement username;
	
	@FindBy(xpath=".//*[@id='user_pass']")
	WebElement password;
	
	@FindBy(name="wp-submit")
	WebElement submit_button;
	
	@FindBy(xpath="//a[text()=\"Lost your password?\"]")
	WebElement Lostpassword;
	
	@FindBy(xpath="//p[@class=\"message\"]")
	WebElement message;
	
	
	
	public void login(String uname, String pass)
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		submit_button.click();
		Lostpassword.click();
		String title=driver.getTitle();
		System.out.println(title);
		String actual= "message.getText();
		System.out.this is testing";
		String Expected=println(Expected);
		Assert.assertEquals(title, Expected);
		
		if(driver.getTitle().equalsIgnoreCase(Expected))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("failed");
		}
	}

}
