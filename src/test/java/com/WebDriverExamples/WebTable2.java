package com.WebDriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch browser
		WebDriver driver = new ChromeDriver();

		//maximize window
		driver.manage().window().maximize();

		//open the url
		driver.get("https://testautomationpractice.blogspot.com/");

		//Find total rows in webtable 
		List <WebElement> rowList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		System.out.println("Rows : " + rowList.size());

		//Find total coloums in webtable 
		List <WebElement> coloumList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		System.out.println("Coloums : " + coloumList.size());

		for(int r=2; r<=rowList.size(); r++)
		{
			for(int c=1; c<=coloumList.size(); c++)
			{
				String data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + r + "]/td["+ c +"]")).getText();
				System.out.println(data);
			}
		}

		//close driver
		driver.close();
	}

}
