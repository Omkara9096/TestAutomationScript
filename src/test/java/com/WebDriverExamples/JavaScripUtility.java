package com.WebDriverExamples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScripUtility {

	public static void typeText(WebDriver driver)
	{
		//Type the Text to in WebElement
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('Wikipedia1_wikipedia-search-input').value='Omkar' ; ");
	}
	
	public static void zoomPage(WebDriver driver)
	{
		//To Zoom Page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom ='50%'");
	}

	public static void drowBorder(WebElement element2, WebDriver driver)
	{
		//To Draw a border
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border = '3px solid red' ; ", element2);
		System.out.println("Border is Drawn around given element..!!");
	}

	public static void clickElement(WebElement element, WebDriver driver)
	{
		//Click on button
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
		System.out.println("Clicked on Button..!!");
	}

	public static void refreshBrowser(WebDriver driver)
	{
		//To Refresh the Browser
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
		System.out.println("Browser Refresh...!!");
	}

	public static String getDomainName(WebDriver driver)
	{
		//To Get Domain Name
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String domain = js.executeScript("return document.domain;").toString();
		System.out.println("Domain : " + domain);
		return domain;
	}

	public static String getTitle(WebElement element2, WebDriver driver)
	{
		//To get the Title :
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title =  js.executeScript("return document.title;").toString();
		System.out.println("Title : " + title);
		return title;
	}

	public static String getURL(WebDriver driver)
	{
		//To get the URL:
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String URL = js.executeScript("return document.URL;").toString();
		System.out.println("URL : " + URL);
		return URL;
	}

	public static void getHeightWidth(WebDriver driver)
	{
		//Return Height and width of web page 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println("Height : " + js.executeScript("return window.innerHeight;").toString());
		System.out.println("Width : " + js.executeScript("return window.innerWidth;").toString());
	}

	public static void getAlertMsg(WebDriver driver)
	{
		//To generate Alert Popup 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('This is My Alert Message...');");
	}

	public static void scrollVerticallyDown(WebDriver driver)
	{
		//Scroll by vertically Down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");

	}

	public static void scrollVerticallyUp(WebDriver driver)
	{
		//Scroll by vertically UP
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

	}

	public static void navigateToUrl(WebDriver driver)
	{
		//Navigate to URL
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location = 'https://www.saucedemo.com/' ");
		System.out.println("Switch to swaglab window..!!");
	}

}
