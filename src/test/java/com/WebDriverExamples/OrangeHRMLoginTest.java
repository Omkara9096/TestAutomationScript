package com.WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginTest {

	public static void main(String[] args) throws Exception{

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		WebElement txtUsernamElement = driver.findElement(By.cssSelector("input[placeholder='Username']"));
		txtUsernamElement.sendKeys("Admin");
		
		System.out.println("Username Typed Successfully");
		
		//close driver
		driver.close();
	}

}
