import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Registration 
{

	@Test
	public void main() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Study\\Selenium\\New folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://iskdemo.com/teamwear/");
		driver.findElement(By.xpath("//a[@class='login' and text()='Sign Up']")).click();
		WebDriverWait wait = new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='button' and @title='Register']")));
		driver.findElement(By.xpath("//button[@class='button' and @title='Register']")).click();
		/*WebElement element = driver.findElement(By.xpath("//button[@class='button' and @title='Register']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);*/

		
		
	}
}
