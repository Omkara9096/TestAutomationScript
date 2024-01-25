package com.WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScripExec2Method {

	public static void main(String[] args) throws Exception{


		//Launch the browser
		WebDriver driver = new ChromeDriver();

		//maximize browser
		driver.manage().window().maximize();

		//Open URL
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Initiate Js driver
		JavascriptExecutor js = (JavascriptExecutor) driver;

		//Locate and store WebElement 
		WebElement element = driver.findElement(By.xpath("//input[@type='submit']"));

		//Type the Text to in WebElement
		JavaScripUtility.typeText(driver);
		
		//Click on button
		JavaScripUtility.clickElement(element, driver);

		//Refresh the browser
		JavaScripUtility.refreshBrowser(driver);

		//To Get Domain Name 
		JavaScripUtility.getDomainName(driver);

		//To get the Title :
		JavaScripUtility.getTitle(element, driver);

		//To get the URL:
		JavaScripUtility.getURL(driver);

		WebElement element2 = driver.findElement(By.id("name"));

		//To Draw a Border
		JavaScripUtility.drowBorder(element2, driver);

		//To Zoom page
		JavaScripUtility.zoomPage(driver);

		//Return Height and width of web page 
		JavaScripUtility.getHeightWidth(driver);

		//To generate Alert Popup
		JavaScripUtility.getAlertMsg(driver);

		Thread.sleep(5000);

		//Scroll by vertically 
		
		Thread.sleep(10000);

		// scroll vertically page up
		

		//To navigate to another URL
		JavaScripUtility.navigateToUrl(driver);

		WebElement element3 = driver.findElement(By.id("login-button"));

		//To Flash the element 
		String bgcolor = element3.getCssValue("backgroundColor");
		for(int i=0; i<50; i++)
		{
			js.executeScript("arguments[0].style.backgroundColor = '#000000'", element3);	//Black color

			Thread.sleep(20);

			js.executeScript("arguments[0].style.backgroundColor = '"+ bgcolor +"'", element3);
		}

		Thread.sleep(2000);


		//Close driver
		driver.close();
	}

}
