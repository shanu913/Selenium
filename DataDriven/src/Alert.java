import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Alert {
	
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Shanu Data\\Slenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


       /* // Launch the URL

        driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
        driver.manage().window().maximize();

        // Click on the Button "Alert Box"

        driver.findElement(By.xpath("//button[@onclick=\"newAlert()\"]")).click();

        // Switch to JavaScript Alert window
        
        //Thread.sleep(5000);

        //driver.switchTo().alert().accept();
        
        org.openqa.selenium.Alert alt=driver.switchTo().alert();
        
        String alertMessage= driver.switchTo().alert().getText();
        System.out.println(alertMessage);

        // Accept the Alert
        
        Thread.sleep(5000);

        alt.accept();
        
        
        
        driver.findElement(By.xpath("//button[@onclick='pushConfirm()']")).click();
        
        org.openqa.selenium.Alert confirmalert=driver.switchTo().alert();
        
        String alerttext=confirmalert.getText();
        
        System.out.println(alerttext);
        
        Thread.sleep(5000);
        
        confirmalert.dismiss();
        
        */
        

		/*driver.get("http://toolsqa.wpengine.com/automation-practice-table");
		driver.manage().window().maximize();
		String svalue=driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(svalue);*/
		
		
		
	}
	

}
