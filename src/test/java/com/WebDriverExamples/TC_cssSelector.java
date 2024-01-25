package com.WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_cssSelector {

	public static void main(String[] args) throws Exception {

		//Launch chrome browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Open Swaglab webpage
		driver.get("https://www.saucedemo.com/");
		
		//Locate username -- tag#id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		//Locate password -- tag[attribute=value]
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		
		//Locate Login button -- tag.value of class name 
		driver.findElement(By.cssSelector("input.submit-button")).click();
		
		//Switch to window
		String currentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		
		//tag.valueofClass[attribute=value]
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
		
		//Substring Endwith-- tag[attribute$=substring]  (start with ^	/ ends with $	/ contains *)
		driver.findElement(By.cssSelector("button[name$=light]")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
