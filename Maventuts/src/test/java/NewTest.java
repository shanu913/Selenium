import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Shanu Data\\Slenium\\Chrome Driver\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  
	  driver.get ("https://www.facebook.com/");
	  //driver.navigate().refresh();
	 // driver.get(driver.getCurrentUrl());
	  Actions action = new Actions(driver);  
	  WebElement element = driver.findElement(By.id("email"));  
	  action.click(element).perform();  
	  
  }
  
}
