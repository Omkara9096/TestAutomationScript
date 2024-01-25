package com.WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeDemo2 {

	public static void main(String[] args) throws Exception {

		//Launch Chrome Browser
		WebDriver driver = new ChromeDriver();

		//Maximise browser
		driver.manage().window().maximize();

		//Open URl 
		driver.navigate().to("https://chercher.tech/practice/frames");
		
		//Switch to Outside frame 1
		driver.switchTo().frame("frame1");
		
		//Switch to Inside frame 3
		driver.switchTo().frame("frame3");
		
		//Find checkbox webelement and Click 
		driver.findElement(By.id("a")).click();
		
		//Switch to parent frame
		driver.switchTo().parentFrame();
		
		//Find webelement input box
		driver.findElement(By.tagName("input")).sendKeys("Omkar..Its your Message...!!");
		
		//Switch to default content
		driver.switchTo().defaultContent();
		
		//Switch to Inside frame 2
		driver.switchTo().frame("frame2");
		
		//Find web element animal dropdown
		WebElement dropdownElement = driver.findElement(By.id("animals"));
		Select dropdown = new Select(dropdownElement);
		
		dropdown.selectByVisibleText("Big Baby Cat");
		
		Thread.sleep(3000);
		
		//close the driver
		driver.close();

	}

}
