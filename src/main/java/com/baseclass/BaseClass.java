package com.baseclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.utility.TakeScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public  WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	driver.get("https://www.google.com/");	
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		if (result.FAILURE == result.getStatus()) {
			TakeScreenshot.screenshot(driver, result.getName());
		}
		driver.close();
	}
		
}
