package com.HeadlessBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadlessBrowserTesting {

	public static void main(String[] args) throws Exception{


		//Launch the browser
		WebDriverManager.chromedriver().setup();
		
		//Set as Headless browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		//Open URL
		driver.get("https://www.google.com/");
		
		//Print title of webpage
		System.out.println("Before Search Title : " + driver.getTitle());
		
		//Find searchbox webelement
		WebElement searchBox = driver.findElement(By.name("q"));
		
		//Search Keyword
		searchBox.sendKeys("India Gate");
		searchBox.sendKeys(Keys.ENTER);
		
		//Print title of webpage
		System.out.println("After Search Title : " + driver.getTitle());
		
		//pause of 3 sec
		Thread.sleep(3000);
		driver.quit();
	

	}

}
