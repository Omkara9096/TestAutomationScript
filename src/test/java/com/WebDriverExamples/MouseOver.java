package com.WebDriverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {

		//launch the browser
		WebDriver driver = new ChromeDriver();

		//maximize window
		driver.manage().window().maximize();

		//Providing implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//open the url
		driver.get("https://sellglobal.ebay.in/seller-center/");
		
		//Find Web element 
		WebElement element = driver.findElement(By.linkText("Marketing & Promotion"));
		
		//Perform mouseover action 
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		
		Thread.sleep(3000);
		//Close driver
		driver.close();

	}

}
