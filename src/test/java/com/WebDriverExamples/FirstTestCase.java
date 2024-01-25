package com.WebDriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

public static void main(String[] args) {
		
		// 1.Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// 2.Launch YouTube WebPage
		
		driver.get("https://m.youtube.com/");		
		
		// 3.Capture Title of Webpage and print
		
		String title = driver.getTitle();
		
		System.out.println("Page Title : " + title);
		
		// 4.Capture URL of WebPage
		
		System.out.println("URL : " + driver.getCurrentUrl());
		
		
		//Close the Driver
		
		driver.close();
			

	}

}
