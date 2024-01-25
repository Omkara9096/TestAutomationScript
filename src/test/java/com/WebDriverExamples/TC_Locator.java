package com.WebDriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Locator {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		//Locate Username by id
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//Locate Password by name 
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		//Locate Login Button
		driver.findElement(By.id("login-button")).click();
		
		//Switch to Product Page
		String currentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		
		//Locate Sauce Lbs Bolt T-shirt
		//driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
		
		//driver.findElement(By.partialLinkText("Sauce")).click();
		
		List<WebElement> elementList =	driver.findElements(By.partialLinkText("Sauce"));
		System.out.println("Element Size : " + elementList.size());
		
		//Close driver
		driver.close();

	}

}
