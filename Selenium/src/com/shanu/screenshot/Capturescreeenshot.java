package com.shanu.screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Capturescreeenshot {

	public static WebDriver driver;
	
	@Test
	public void tc_123()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium\\New folder\\Chrome driver\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Assert.assertEquals("Test", "Test123");
		
	}
}
