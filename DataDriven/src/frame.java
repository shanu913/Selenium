import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class frame {

	@Test
	public void test()
	{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
	//int size = driver.findElements(By.tagName("iframe")).size();
	//System.out.println("Size is  " +   size);
	List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
	System.out.println("The total number of iframes are " + iframeElements.size());
}
}