import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import library.Utility;

public class Screenshot{
	
	WebDriver driver;
	@Test
	public void capture() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium\\New folder\\Chrome driver\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("hiernf");
		//Utility.capturescreenshot(driver,"screenshotname1");
		
	}
	
	@AfterMethod
	public void teardown(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.capturescreenshot(driver, result.getName());
		}
		
	}
}