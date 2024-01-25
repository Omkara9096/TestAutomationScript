package com.WebDriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioButton {

	public static void main(String[] args) {
		
		//Launch Chrome browser 
		WebDriver driver = new ChromeDriver();
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Open the URL 
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		
		//Find radio button web element and store in list 
		List<WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println("Total No of Radio Button on Webpage : " + radioButtonList.size());
		
		
		//Close driver
		driver.close();

	}

}
