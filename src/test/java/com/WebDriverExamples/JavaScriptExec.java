package com.WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExec {

	public static void main(String[] args) throws Exception{

		//Launch the browser
		WebDriver driver = new ChromeDriver();

		//maximize browser
		driver.manage().window().maximize();

		//Open URL
		driver.get("https://testautomationpractice.blogspot.com/");

		//Type the Text to in WebElement
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('Wikipedia1_wikipedia-search-input').value='Omkar' ; ");

		//Click on button
		WebElement element = driver.findElement(By.xpath("//input[@type='submit']"));
		js.executeScript("arguments[0].click();",element);
		System.out.println("Clicked on Button..!!");

		//Refresh the browser
		js.executeScript("history.go(0)");
		System.out.println("Browser Refresh...!!");

		//To Get Domain Name 
		String domain = js.executeScript("return document.domain;").toString();
		System.out.println("Domain : " + domain);

		//To get the Title :
		String title =  js.executeScript("return document.title;").toString();
		System.out.println("Title : " + title);

		//To get the URL:
		String URL = js.executeScript("return document.URL;").toString();
		System.out.println("URL : " + URL);	

		WebElement element2 = driver.findElement(By.id("name"));

		//To Draw a Border
		js.executeScript("arguments[0].style.border = '3px solid red' ; ", element2);
		System.out.println("Border is Drawn around given element..!!");

		//To Zoomout page
		js.executeScript("document.body.style.zoom ='50%'");

		//Return Height and width of web page 
		System.out.println("Height : " + js.executeScript("return window.innerHeight;").toString());
		System.out.println("Width : " + js.executeScript("return window.innerWidth;").toString());

		//To generate Alert Popup
		//js.executeScript("alert('This is My Alert Message...');");

		Thread.sleep(5000);

		//Scroll by vertically 
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		Thread.sleep(10000);

		// scroll vertically page up
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

		//To navigate to another URL
		js.executeScript("window.location = 'https://www.saucedemo.com/' ");
		System.out.println("Switch to swaglab window..!!");

		WebElement element3 = driver.findElement(By.id("login-button"));

		//To Flash the element 
		String bgcolor = element.getCssValue("backgroundColor");
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
