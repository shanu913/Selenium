import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Window {
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Shanu Data\\Slenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		/*
		 * driver.findElement(By.xpath("//button[@onclick= \"newMsgWin()\"]")).click();
		 * driver.findElement(By.xpath(".//*[@id='button1']")).click();
		 */
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		for (String handle1 : driver.getWindowHandles()) {
			 
        	System.out.println(handle1);

        	driver.switchTo().window(handle1);
        	
        	driver.close();
		}
        	/*
        	for (int i=0; i<driver.getWindowHandles().size();i++	) {
        		System.out.println("ii "+i);

        	}*/
		
}
}
