package com.WebDriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMgrClass {

	public static void main(String[] args) {


		//Launch Chrome browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//Open URL 
		driver.get("https://www.saucedemo.com/");
		
		//close driver
		driver.close();

	}

}
