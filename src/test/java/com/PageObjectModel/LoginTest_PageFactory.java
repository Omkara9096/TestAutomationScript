package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest_PageFactory {

	public static void main(String[] args) throws Exception{

		//Launch the chromebrowser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//Creating the Object
		LoginPage2 lg = new LoginPage2(driver);

		//Open the URL 
		driver.get("https://www.saucedemo.com/");
		
		lg.maximizeWindow();

		Thread.sleep(1000);

		lg.enterUsername("standard_user");
		lg.enterPassword("secret_sauce");
		lg.clickOnLoginBtn();

		Thread.sleep(3000);
		
		lg.closeApplication();

	}

}
