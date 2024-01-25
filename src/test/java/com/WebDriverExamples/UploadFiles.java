package com.WebDriverExamples;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFiles {

	public static void main(String[] args) throws Exception{

		//launch the browser
		WebDriver driver = new ChromeDriver();

		//maximize window
		driver.manage().window().maximize();
		
		//open the url
		driver.get("https://eudyogaadhaar.org/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1700)");
		
		Thread.sleep(3000);
		
		
		// 1st Way || if type='file' then only used sendkeys for upload file
//		WebElement element = driver.findElement(By.xpath("//input[@id='upload_pan_card_front']"));
//		element.sendKeys("C:\\Users\\ADMIN\\Documents\\Code.txt");
		
		// 2nd way || if type = 'file' is not given then using keyboard action we upload file
		WebElement button = driver.findElement(By.xpath("//input[@id='upload_pan_card_front']"));
		
		//Open Window Popup
		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		//Copy path / file to clipboard
		StringSelection ss = new StringSelection("C:\\Users\\ADMIN\\Documents\\Code.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		//Perform Ctrl + V action to paste file
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(3000);
		System.out.println("File uploaded Successfully..!!");
		
		Thread.sleep(3000);
		
	
		//Close driver
		driver.close();
		

	}

}
