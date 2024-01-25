package com.WebDriverExamples;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Full_Screenshots {

	public static void main(String[] args) throws Exception {

		//Launch the browser 
		WebDriver driver = new ChromeDriver();
		
		//maximize window 
		driver.manage().window().maximize();
		
		//Open the URl
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Capture full Screenshot : convert webdriver to TakesScreenshot interface
		
		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		
		// Call getScreenshots method to create image file
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\ADMIN\\eclipse-workspace\\AutomationMaven\\Screenshots\\fullScreenshot.png");
		
		//Copy file to destination (Before that add Apache commons io libraries)
		FileUtils.copyFile(src, dest);
		
		
		Thread.sleep(300);
		
		//close driver
		driver.close();
		

	}

}
 