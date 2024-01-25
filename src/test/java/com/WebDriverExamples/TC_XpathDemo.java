package com.WebDriverExamples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_XpathDemo {

	public static void main(String[] args) throws Exception{


		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		//Display text using xpath 
		String txt = driver.findElement(By.xpath("//*[text()='Accepted usernames are:']")).getText();
		System.out.println("Text Displayed : " + txt);
		
		//Locate Username -- single attribute multiple attribute (or) 
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		//Locate Password -- multiple attribute (and)
		driver.findElement(By.xpath("//input[@id='password' and @name='password']")).sendKeys("secret_sauce");
		
		//Locate Login -- startwith
		driver.findElement(By.xpath("//input[starts-with(@class,'submit')]")).click();
		
		//Switch to Product Page
		String currentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		
		//Locate Sauce Lbs Bolt T-shirt -- multiple attribute (or) 
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' or @name='add-to-cart-sauce-labs-backpack']")).click();
		
		//Contains - when value change dynamically : 
		driver.findElement(By.xpath("//button[contains(@name,'bike')]")).click();
		
		Thread.sleep(3000);
		//Close driver
		driver.close();
	}

}
