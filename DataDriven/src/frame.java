import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class frame {

	@Test
	public void test()
	{
		
	System.setProperty("webdriver.gecko.driver", "D:\\Shanu Data\\gecko\\New folder\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
	/*int size = driver.findElements(By.tagName("iframe")).size();
	System.out.println("Size is  " +   size);
	List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
	System.out.println("The total number of iframes are " + iframeElements.size());*/
	
	driver.switchTo().frame(0);
	int size = driver.findElements(By.tagName("iframe")).size();
	List<WebElement> Size1=driver.findElements(By.tagName("iframe"));
	System.out.println(Size1.size());
	
	System.out.println(size);
	
	String s=driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[1]/p[2]/span/em ")).getText();
	System.out.println(s);
	
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	
	int size2 = driver.findElements(By.tagName("iframe")).size();
	System.out.println(size2);
	
	//List<WebElement> Size1=driver.findElements(By.tagName("iframe"));
	//System.out.println(Size1.size());
	
	String ss=driver.findElement(By.xpath(".//*[@id='post-1']/header/h1")).getText();
	System.out.println(ss);
}
}