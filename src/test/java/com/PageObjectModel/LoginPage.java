package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// With Page Object Model

public class LoginPage {
	
	WebDriver driver;
	
	//Constructor
	LoginPage(WebDriver d){
		driver = d;
	}
	
	By username = By.id("user-name");
	By password = By.id("password");
	By loginBtn = By.id("login-button");
	
	public void enterUsername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLoginBtn() {
		driver.findElement(loginBtn).click();
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void closeApplication() {
		driver.quit();
	}
	
}
