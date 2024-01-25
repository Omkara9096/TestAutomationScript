package com.WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureImageSrcURL {
	
	public static void main(String[] args) {
		
		//Launch the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		//find the WebElement
		WebElement logo =  driver.findElement(By.xpath("//img[@class = 'fb_logo _8ilh img']"));
		
		
		//Capture "src" attribute value of imageLogo
		System.out.println("Src attribute value : " + logo.getAttribute("src"));
				
		driver.quit();	
		
	}

}
