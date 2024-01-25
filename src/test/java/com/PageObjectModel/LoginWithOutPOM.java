package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithOutPOM {

	public static void main(String[] args) throws Exception{

		//Launch the Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Open the URL 
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		//Enter the Username & Password
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		//Click on Login
		driver.findElement(By.id("login-button")).submit();
		
		Thread.sleep(3000);
		
		//close the driver
		driver.close();
		
	}

}
