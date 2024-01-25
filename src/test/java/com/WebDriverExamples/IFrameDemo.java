package com.WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameDemo {

	public static void main(String[] args) throws Exception{

		//Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximise browser
		driver.manage().window().maximize();
		
		//Open URl 
		driver.navigate().to("https://www.rediff.com/");;
		
		Thread.sleep(10000);
		//Switch to frame 
		driver.switchTo().frame("moneyiframe");
		
		//Find webelement and print value
		String nseindex = driver.findElement(By.id("nseindex")).getText();
		System.out.println(nseindex);
		
		//Close the driver
		driver.close();
	}

}
