package com.WebDriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperlink {

	public static void main(String[] args) {
		
		//Launch chrome browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Launch Website
		driver.get("https://www.calculator.net/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links on Webpage : " + links.size());
		
		for(WebElement el:links) {
			System.out.println(el.getText());
		}
		
		//Close driver
		driver.close();

	}

}
