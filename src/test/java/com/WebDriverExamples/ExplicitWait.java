package com.WebDriverExamples;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.base.Stopwatch;

public class ExplicitWait {

	public static void main(String[] args) {
		

		//Launch Chrome Browser
		WebDriver driver = new ChromeDriver();

		//Maximize Browser
		driver.manage().window().maximize();

		//Open the URL
		driver.get("https://sellglobal.ebay.in/seller-center/start-selling/");

		//Explicit wait of 10 seconds || Its web element specific with expectedconditions
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		Stopwatch watch = null;

		//Find the Web Element
		try {
			watch = Stopwatch.createStarted();
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("SELLING")));
			element.click();
		}
		catch(Exception e) {
			watch.stop();
			System.out.println(e);
			System.out.println("After " + watch.elapsed(TimeUnit.SECONDS) + " Seconds We got this exception");

		}

		//Close driver
		driver.close();
	}

}
