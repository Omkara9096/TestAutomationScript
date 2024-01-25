package com.WebDriverExamples;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrokenLinks {


	public static void main(String[] args) throws Exception {


		//Launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Wait 10 seconds (Implicitly)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		//Open the URL
		driver.get("http://www.deadlinkcity.com/");
		
		//Find Hyperlinks 
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		int resCode = 200;		//2xx is valid links
		int brokenLinkCnt = 0;
		
		System.out.println("Total Links : " + links.size());
		
		for(WebElement element :links) {
			String url = element.getAttribute("href");
			
			URL urlLink = new URL(url);			//Capture all URl and store in urlLink
			
			HttpURLConnection huc = (HttpURLConnection)urlLink.openConnection();
			huc.setRequestMethod("HEAD");			
			huc.connect();						// Request sent -> connect -> check response code
			
			resCode = huc.getResponseCode();
			
			if(resCode >=400) {
				System.out.println(url + "Broken Link.");
				brokenLinkCnt ++;
			}
			
		}
		
		System.out.println("Total broken links : " + brokenLinkCnt);
		
		//Close driver
		driver.close();

	}

}
