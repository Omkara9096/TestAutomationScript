package com.WebDriverExamples;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws Exception {


		//Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize Browser
		driver.manage().window().maximize();
		
		//Open the URL
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Find rightclick button using inspector button
		WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		//Perform rightclick action using action class
		Actions act = new Actions(driver);
		act.contextClick(button).perform();	
		
		//Print Message
		System.out.println("RightClick action has been performed..!!");
		
		Thread.sleep(3000);
		
		//Close Browser
		driver.close();

	}

}
