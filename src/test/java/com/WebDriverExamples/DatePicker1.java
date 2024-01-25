package com.WebDriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {

	public static void main(String[] args) throws Exception {

		//16-May-2024
		
		String expectedDay = "16";
		String expectedMonth = "May";
		String expectedYear = "2024";
		
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize window 
		driver.manage().window().maximize();
		
		//Open the URL
		driver.get("https://jqueryui.com/datepicker/");
		
		//Switch to iframe
		driver.switchTo().frame(0);
		
		//Find webelement
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.click();
		
		//Compare expectedMonth to expectedYear
		////table/tbody/tr/td
		
		while(true)
		{
			String calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(calenderMonth.equals(expectedMonth) && calenderYear.equals(expectedYear))
			{
				List <WebElement> daysList = driver.findElements(By.xpath("//table/tbody/tr/td"));
				
				for(WebElement e:daysList)
				{
					String calenderDay = e.getText();
					if(calenderDay.equals(expectedDay))
					{
						e.click();
						break;
					}
				}
				
				break;		//break while loop also
			}
			else {		//Click on nextbutton if date & month is not match
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			
		}
		
		Thread.sleep(3000);
		//close driver
		driver.close();

	}

}
