package com.WebDriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		// Launch browser
		WebDriver driver = new ChromeDriver();

		//maximize window
		driver.manage().window().maximize();

		//open the url
		driver.get("file:///C:/SSquareit/AutomationProject/WebTable.html");
		
		//Locate element using xpath 
		String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		
		System.out.println(text);
		
		//Find total rows in webtable 
		List <WebElement> rowList = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Rows : " + rowList.size());
		
		//Find total coloums in webtable 
		List <WebElement> coloumList = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		System.out.println("Coloums : " + coloumList.size());
		
		for(int r=2; r<=rowList.size(); r++)
		{
			for(int c=1; c<=coloumList.size(); c++)
			{
				String data = driver.findElement(By.xpath("//table/tbody/tr[" + r + "]/td["+ c +"]")).getText();
				System.out.println(data);
			}
		}
		
		//close driver
		driver.close();
		
	}

}
