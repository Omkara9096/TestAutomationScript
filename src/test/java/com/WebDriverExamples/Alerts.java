package com.WebDriverExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Alerts {

	static String url = "http://183.82.103.245/nareshit/login.php";
	static String username = "nareshit";
	static String password = "nareshit";

	public static void main(String[] args) throws Exception{

		//Launch the browser
		WebDriver driver = new FirefoxDriver();

		//Open the URL
		driver.navigate().to(url);

		//Login into application
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("Submit")).click();

		Thread.sleep(4000);

		//Switch to Alert
		Alert a = driver.switchTo().alert(); 

		//Get a text of alert
		System.out.println(a.getText());

		//Click on Ok button
		a.accept();

		//Click on cancel button 
		a.dismiss();

		//Provie text to prompt
		a.sendKeys("Omkar");

		Thread.sleep(3000);

		//Login to application by providing password
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();

		Thread.sleep(3000);

		//Logout the application
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed..");

		//Close the application
		driver.close();
	}


}
