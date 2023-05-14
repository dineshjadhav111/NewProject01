package com.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {

	//static WebDriver driver;
	
	public static void screenshot(WebDriver driver,String filename) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		//File dest = new File(System.getProperty("user.dir")+"\\Screenshots\\"+filename+".png");
		File dest = new File(".\\Screenshots\\"+filename+".png");
		FileHandler.copy(src,dest);
		
		
		
	}

	
	
	
	
	
	
	
}
