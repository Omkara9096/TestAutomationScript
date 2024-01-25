package com.WebDriverExamples;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormFillingUsingSingleClick {

	public static void main(String[] args) throws Exception{
		
		//Launch the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Open the URL
		driver.get("https://www.saucedemo.com/");
		
		Actions actions = new Actions(driver);
		Action seriesAction = actions
				.moveToElement(driver.findElement(By.id("user-name")))
				.click()
				.sendKeys("standard_user",Keys.TAB)
				.sendKeys("secret_sauce", Keys.ENTER).build();
				seriesAction.perform();
		
		Thread.sleep(3000);
		
		//Close the browser
		driver.close();

	}

}
