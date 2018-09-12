package com.webapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	WebDriver driver;
	
	By username=By.id("user_login");
	By password=By.xpath(".//*[@id='user_pass']");
	By loginbutton=By.name("wp-submit");
	
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeusername(String uid)
	{
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typepassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clicklogin()
	{
		driver.findElement(loginbutton).click();
	}

}
