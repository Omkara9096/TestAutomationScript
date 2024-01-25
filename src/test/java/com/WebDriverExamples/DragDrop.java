package com.WebDriverExamples;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {


	public static void main(String[] args) throws Exception {

		//launch Browser
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//Providing implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//open the url
		driver.get("https://demoqa.com/droppable");
			
		//Find web element
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		
	
		//Perform drap&drop action
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).perform();
	
		Thread.sleep(3000);
		//Print Message
		System.out.println("Drag&Drop action performed successfully...!!");
		
		//Close Driver
		driver.close();

	}

}
