package com.WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlashElement {

	public static void main(String[] args) throws Exception{

		//Launch the browser
		WebDriver driver = new ChromeDriver();

		//maximize browser
		driver.manage().window().maximize();

		//Open URL
		driver.get("https://www.saucedemo.com/");

		WebElement element3 = driver.findElement(By.id("login-button"));

		//Initiate Js driver
		JavascriptExecutor js = (JavascriptExecutor) driver;
				
		//To Flash the element 
		String bgcolor = element3.getCssValue("backgroundColor");
		for(int i=0; i<50; i++)
		{
			js.executeScript("arguments[0].style.backgroundColor = '#000000'", element3);	//Black color

			Thread.sleep(20);

			js.executeScript("arguments[0].style.backgroundColor = '"+ bgcolor +"'", element3);
		}

		Thread.sleep(2000);


		//Close driver
		driver.close();


	}

}
