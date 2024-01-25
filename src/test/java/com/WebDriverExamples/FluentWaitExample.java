package com.WebDriverExamples;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class FluentWaitExample {

	public static void main(String[] args) {

		//Launch Chrome Browser
		WebDriver driver = new ChromeDriver();

		//Maximize Browser
		driver.manage().window().maximize();

		//Open the URL
		driver.get("https://sellglobal.ebay.in/seller-center/start-selling/");

		//Fluent wait of 10 seconds || Its web element specific with expectedconditions
		Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("Omkar..Its Throwing Error ...")
				.ignoring(NoSuchElementException.class);
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("SELLING")));
		element.click();

		//Close driver
		driver.close();

	}

}
