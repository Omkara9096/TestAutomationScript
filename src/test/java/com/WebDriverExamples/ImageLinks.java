package com.WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLinks {

	public static void main(String[] args) throws Exception {

		//Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize window 
		driver.manage().window().maximize();
		
		//Open URL 
		driver.get("https://www.opencart.com/");
		
		//Find image web element and click on it 
		driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).click();
		
		//Verify Title of the current page with expected home page title
		if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"))
		{
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		Thread.sleep(3000);
		//Close driver
		driver.close();
		

	}

}
