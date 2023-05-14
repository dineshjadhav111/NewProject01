package com.screenshot;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.utility.TakeScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotTest extends BaseClass 
{

	
	//WebDriver driver;
	
	/*
	 * @BeforeMethod public void setup() { WebDriverManager.firefoxdriver().setup();
	 * driver = new FirefoxDriver(); driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); }
	 */
	
		 @Test
		 public void facebook() 
		 {
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		  driver.findElement(By.name("firstnam")).sendKeys("Dinesh");
		 }
		 
		 @Test
		 public void instagram() 
		 {
		  driver.get("https://www.instagram.com/");
		  String ActTitle = "Instagram";
		  String ExpTitle = driver.getTitle();
		  Assert.assertEquals(ActTitle, ExpTitle);
		 }
		 
		 @Test
		 public void Amazon() 
		 {
		  driver.get("https://www.amazon.in/");
		  String ActTitle = "nline Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		  String ExpTitle = driver.getTitle();
		  Assert.assertEquals(ActTitle, ExpTitle);
		 }
		 
			
			/*
			 * @AfterMethod public void tearDown(ITestResult result) throws IOException { if
			 * (result.FAILURE == result.getStatus()) { TakeScreenshot.screenshot(driver,
			 * result.getName()); } driver.close(); }
			 */
		
}
	
	
	
	
	
	
	
	
	

