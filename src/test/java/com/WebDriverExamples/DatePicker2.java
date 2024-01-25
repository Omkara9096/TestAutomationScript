package com.WebDriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker2 {

	public static void main(String[] args) throws Exception{


		//16-May-2024

		
		String expectedDay = "16";
		String expectedMonthYear = "May 2024";


		//Launch the browser
		WebDriver driver = new ChromeDriver();

		//Maximize window 
		driver.manage().window().maximize();

		//Open the URL
		driver.get("https://www.goibibo.com/");

		//Find webelement
		WebElement datepicker = driver.findElement(By.xpath("//p[@class='sc-12foipm-18 cTPYom fswWidgetTitle']"));
		datepicker.click();


		while(true)
		{
			//String calenderDay = driver.findElement(By.xpath("//text[@class='dateText']")).getText();
			String calenderMonthYear = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();

			if(calenderMonthYear.equals(expectedMonthYear))
			{
				List <WebElement> daysList = driver.findElements(By.xpath("//p[@class='fsw__date']"));

				for(WebElement e:daysList)
				{
					String calenderDay = e.getText();
					if(calenderDay.equals(expectedDay))
					{
						e.click();
						driver.findElement(By.xpath("//span[@class='fswTrvl__done']")).click();
						break;
					}
				}

				break;		//break while loop also
			}
			else {		//Click on nextbutton if date & month is not match
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}

		}

		Thread.sleep(3000);
		//close driver
		driver.close();

	}

}
