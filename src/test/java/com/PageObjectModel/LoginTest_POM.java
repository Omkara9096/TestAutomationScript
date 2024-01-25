package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest_POM  {

	public static void main(String[] args) throws Exception{


		//Launch the chromebrowser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Creating the Object
		LoginPage login = new LoginPage(driver);
		
		//Open the URL 
		driver.get("https://www.saucedemo.com/");
		
		login.maximizeWindow();
		
		Thread.sleep(3000);
		
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickOnLoginBtn();
		
		Thread.sleep(3000);
		
		login.closeApplication();

	}

}
