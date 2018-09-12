import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Verify {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Shanu Data\\gecko\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.fbok.com/");
	}

	@Test
	public void validate() throws InterruptedException {
		String Title = "Facebook – log in or sign p";
		// System.out.println("Title is " + Title );
		Assert.assertEquals(driver.getTitle(), Title);

		/*
		 * if (Title.equals("Facebook – log in or sign up")) {
		 * System.out.println("Test case passed"); } else {
		 * System.out.println(" Test case failed"); String
		 * currentURL=driver.getCurrentUrl(); System.out.println(currentURL);
		 */
		// Thread.sleep(5000);

		try {
			WebElement element = driver.findElement(By.id("u_0_"));

			boolean status = element.isEnabled();

			// Check that if the Text field is enabled, if yes enter value
			if (status) {

				element.sendKeys("Shanu");

			}
		} catch (Exception e) {

			// System.out.println("Exception has been handled " + e);

			// System.out.println("No such element exception");
			// TODO Auto-generated catch block
			// e.printStackTrace();

		}
	}

	@AfterMethod //AfterMethod annotation - This method executes after every test execution
		 public void screenShot(ITestResult result){
		 //using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
		 if(ITestResult.FAILURE==result.getStatus()){
		 try{
		 // To create reference of TakesScreenshot
		 TakesScreenshot screenshot=(TakesScreenshot)driver;
		 // Call method to capture screenshot
		 File src=screenshot.getScreenshotAs(OutputType.FILE);
		 // Copy files to specific location 
		 // result.getName() will return name of test case so that screenshot name will be same as test case name
		 FileUtils.copyFile(src, new File("D:\\"+result.getName()+".png"));
		 System.out.println("Successfully captured a screenshot");
		 }catch (Exception e){
		 System.out.println("Exception while taking screenshot "+e.getMessage());
		 } 
		 
		 driver.quit();
		 }
		 }
}
