package com.learn.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	public static String captureScreenshot(WebDriver driver)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotPath=System.getProperty("user.dir")+ "/Screenshots/Test1.png";
		try {
			FileHandler.copy(src, new File(screenshotPath));
		} catch (IOException e) {
			
			System.out.println("Unable to cature screenshot" + e.getMessage());
		}
		return screenshotPath;
	}
	
	

}
