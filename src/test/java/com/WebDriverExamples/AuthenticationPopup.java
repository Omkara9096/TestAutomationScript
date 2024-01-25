package com.WebDriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AuthenticationPopup {

	public static void main(String[] args) throws Exception {

		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Open the URL 
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		Thread.sleep(3000);
		
		//Close the browser
		driver.close();
		
	}

}
