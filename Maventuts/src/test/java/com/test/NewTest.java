package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class NewTest {
	public static WebDriver driver;
  @Test
  public void tc_1() {
	  driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.google.com/");
  }
  
  @Test
  public void tc_2() {
	  driver.get("https://www.facebook.com/");
}
  
//Waiting 30 seconds for an element to be present on the page, checking
  // for its presence once every 5 seconds.
  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
      .withTimeout(30, TimeUnit.SECONDS)
      .pollingEvery(1, TimeUnit.SECONDS)
      .ignoring(NoSuchElementException.class);

  WebElement foo = wait.until(new Function<WebDriver, WebElement>()
  {
    public WebElement apply(WebDriver driver) {
      return driver.findElement(By.id("foo"));
    }
  });
  


}