package com.webapp.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.webapp.pages.firstpage;

public class firstpagetestcase {
	
	@Test
	public void checkuser() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Shanu Data\\Slenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		firstpage page=PageFactory.initElements(driver, firstpage.class); 
		page.login("shanu", "pass123");
	}

}
