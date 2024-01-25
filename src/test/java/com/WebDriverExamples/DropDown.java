package com.WebDriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) throws Exception {
		
		//Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		//Open URL
		driver.get("https://eudyogaadhaar.org/");

		//Locate dropdown element
		WebElement element = driver.findElement(By.name("type_of_organisation"));
		
		Select dropdown = new Select(element);
		
		//dropdown.selectByVisibleText("Government Department");
		dropdown.selectByValue("Proprietorship Firm");
		
		if(dropdown.isMultiple())
		{
			System.out.println("Drop down is Multiple...!!");
		}
		else {
			System.out.println("Drop down is not Multiple..!!");
		}
		
		List <WebElement> alldropdownoptions = dropdown.getOptions();
		
		System.out.println("Total Options :" + alldropdownoptions.size());
		
		for(WebElement el:alldropdownoptions)
		{
			System.out.println(el.getText());
		}
		
		Thread.sleep(2000);
		//Close driver
		driver.close();
	}
}
