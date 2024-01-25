package com.WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadAutoIT {

	public static void main(String[] args) throws Exception{
		
		//Launch browser
		WebDriver driver = new ChromeDriver();
		
		//maximize window 
		driver.manage().window().maximize();
		
		//Open URL
		driver.get("https://the-internet.herokuapp.com/upload");
		
		//Find WebElement
		WebElement button =  driver.findElement(By.id("file-upload"));
		
		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();
		
		Runtime.getRuntime().exec("C:\\SSquareit\\FileUpload.exe" + " " + "C://SSquareit//Resume.txt" );
		
		Thread.sleep(3000);
		//Close driver 
		//driver.close();

	}

}
