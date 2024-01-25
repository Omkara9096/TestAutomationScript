package com.WebDriverExamples;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class ImplicitWait {

	public static void main(String[] args) {

		//Launch Chrome Browser
		WebDriver driver = new ChromeDriver();

		//Maximize Browser
		driver.manage().window().maximize();

		//Open the URL
		driver.get("https://sellglobal.ebay.in/seller-center/start-selling/");
		
		//Apply imlicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Stopwatch watch = null;
		
		//Find the Web Element
		try {
			watch = Stopwatch.createStarted();
			driver.findElement(By.linkText("SELLING")).click();
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
