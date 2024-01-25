package com.WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerticalScroll {

	public static void main(String[] args) throws Exception {

		//Launch Chrome Browser
		WebDriver driver = new ChromeDriver();

		//Maximise browser
		driver.manage().window().maximize();

		//Open URl 
		driver.navigate().to("https://www.alexflueras.ro/");
		
		WebElement element = driver.findElement(By.xpath("//a[@href='assets/images/web-design/cabana-trei-brazi.jpg']"));

		//Initiate JS executor 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//scroll vertically down by 1000 pixels
		//js.executeScript("window.scrollBy(0,1000)");
		
		//Scroll till visibility of element
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		//click on the element
		js.executeScript("arguments[0].click();",element);
		
		Thread.sleep(3000);
		
		//Locate to element by clicking next button
		for(int i=0; i<=4; i++)
		{
			driver.findElement(By.xpath("//div[@class='lg-next lg-icon']")).click();
			Thread.sleep(2000);
		}
		
//		WebElement element2 = driver.findElement(By.xpath("assets/images/web-design/luca-valentin-01.jpg"));
//		
//		//Horizontal Scroll
//		js.executeScript("arguments[0].scrollIntoView();", element2);
		
		
		
		//close the driver
		driver.close();
		
		
		
		
	}

}
