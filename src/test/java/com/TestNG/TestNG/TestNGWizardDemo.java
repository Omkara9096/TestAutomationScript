package com.TestNG.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGWizardDemo {
	@Test
	public void loginpage() {
		//Launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//Open the URl
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		
		//Maximize the browser
		driver.manage().window().maximize();

		//Verify the title
		String actualTitle = driver.getTitle();
		String expectedTitle = "Udyami Login";

		Assert.assertEquals(actualTitle, expectedTitle);

		//close driver
		driver.quit();

	}
}
