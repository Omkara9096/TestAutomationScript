package com.WebDriverExamples;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section_Screenshot {

	public static void main(String[] args) throws Exception {
		
		//Launch the browser 
		WebDriver driver = new ChromeDriver();

		//maximize window 
		driver.manage().window().maximize();

		//Open the URl
		driver.get("https://testautomationpractice.blogspot.com/");

		// Capture Section Screenshot : convert webdriver to TakesScreenshot interface

		WebElement section = driver.findElement(By.xpath("//div[@class='titlewrapper']"));
		
		// Capture Screenshot of Webelement
		
		//WebElement section = driver.findElement(By.cssSelector("button[onclick='myFunction()']"));

		// Call getScreenshots method to create image file of section

		File src = section.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\ADMIN\\eclipse-workspace\\AutomationMaven\\Screenshots\\WebElement.png");

		//Copy file to destination (Before that add Apache commons io libraries)
		FileUtils.copyFile(src, dest);

		Thread.sleep(300);

		//close driver
		driver.close();

	}

}