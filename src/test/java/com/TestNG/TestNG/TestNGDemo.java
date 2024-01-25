package com.TestNG.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;
import org.testng.Assert;

public class TestNGDemo {

	@Test
	public void verifyPageTitle() {
		//Launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Open the URl
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		
		//Verify the title
		String actualTitle = driver.getTitle();
		String expectedTitle = "Udyami Login";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		//close driver
		driver.quit();	
		
	}
}
