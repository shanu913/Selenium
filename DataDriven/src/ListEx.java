import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ListEx {
	
	@Test
	
	public void run() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Shanu Data\\Slenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("test");
		Thread.sleep(5000);
		List <WebElement> resultitem= driver.findElements(By.xpath("//div[@class=\"sbtc\"] /div/span"));
		Thread.sleep(5000);
		for (WebElement item:resultitem)
		{
			System.out.println(item.getText());
		}
		
		if (driver.findElement(By.xpath("//input[@class=\\\"gLFyf gsfi\\\"]")).isDisplayed())
		{
			System.out.println("yes");
		}
		
		else
		{
			System.out.println("no");
		}
		
		driver.close();
		driver.quit();
	}
	
}
