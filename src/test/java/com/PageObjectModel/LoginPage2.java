package com.PageObjectModel;

// With Page Factory
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//With Page Factory
public class LoginPage2 {
	
	WebDriver driver;
	
	//Constructor
	LoginPage2(WebDriver d){
		driver = d;
		
		//This method will create web elements 
		PageFactory.initElements(driver, this);
	}
	
	//identify the WebElement
	//Identify username,password & loginBtn
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	public void enterUsername(String uname) {
		username.sendKeys(uname);
	}
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void closeApplication() {
		driver.quit();
	}		

}
