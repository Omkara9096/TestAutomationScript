package com.WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {

		//Launch browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Open the URL
		driver.get("https://en-gb.facebook.com/");
		
		//Find WebElement
		String actualTooltip = driver.findElement(By.linkText("Sign Up")).getAttribute("title");
		String expectedTooltip = "Sign um for Facebook";
		
		if (actualTooltip.equals(expectedTooltip))
		{
			System.out.println("Test Passed...!!");
		}
		else {
			System.out.println("Test Failed...!!");
		}
			
		//Close driver
		driver.close();

	}

}
