package com.HeadlessBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.*;


public class HTMLUnitDriverExample {

	public static void main(String[] args) throws Exception{

		//Launch HTML unit driver browser
		HtmlUnitDriver driver = new HtmlUnitDriver(true);

		//Open URL
		driver.get("https://www.google.com/");

		//Print title of webpage
		System.out.println("Before Search Title : " + driver.getTitle());

		//Find searchbox webelement
		WebElement searchBox1 = driver.findElement(By.name("q"));

		//Search Keyword
		searchBox1.sendKeys("India Gate");
		searchBox1.submit();
		
		Thread.sleep(3000);

		//Print title of webpage
		System.out.println("After Search Title : " + driver.getTitle());

		//pause of 3 sec
		Thread.sleep(3000);
		driver.quit();


	}

}
