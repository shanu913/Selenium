package com.webapp.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.webapp.pages.Loginpage;

public class Verifyvalidlogin
{
	@Test
	public void verifylogin()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Shanu Data\\Slenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		Loginpage Login=new Loginpage(driver);
		
		Login.typeusername("admin");
		Login.typepassword("demo123");
		Login.clicklogin();
		
	}

}
