package com.WebDriverExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabOrWindow {

	public static void main(String[] args) {

		//Launch chrome browser
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//Open URl 
		driver.get("https://www.google.com/");

		System.out.println("First Page Title : " + driver.getTitle());
		
		//Open new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		//Open new Tab
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		//Open 2nd URL
		driver.get("https://en-gb.facebook.com/");
		System.out.println("Second Tab : " + driver.getTitle());
		
		//Get window handles of open windows
		Set <String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>();
		
		handles.addAll(windowHandles);
		
		driver.close();
		
		driver.switchTo().window(handles.get(0)); //switch to google.com
		System.out.println("First Page : " + driver.getTitle());
		
		driver.close();
	}

}
