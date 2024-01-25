package CookiesDemo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesExample {
	
	public static void main(String[] args) {
		
		//Launch the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Open the URL
		driver.get("https://www.amazon.in/");
		
		//Capture all the cookies
		Set <Cookie> cookiesList = driver.manage().getCookies();
		
		//print size / number of cookies 
		System.out.println(cookiesList.size());
		
		//get specific cookies according to name 
		System.out.println(driver.manage().getCookieNamed("i18n-prefs"));
		
		//------------------------------------------------------------------------------
		//Create Cookies 
		Cookie cookieObject = new Cookie("TestCookie", "www.amazon.com");
		
		//add cookie to browser
		driver.manage().addCookie(cookieObject);
		
		//capture all the cookies
		cookiesList = driver.manage().getCookies();
		
		//print size/number of cookies
		System.out.println("\n\n After adding size : " + cookiesList.size());
		
		for(Cookie ck : cookiesList)
			{
				System.out.println(ck.getName() + ":" + ck.getValue());
			}
		//------------------------------------------------------------------------------
		//delete cookie
		driver.manage().deleteCookie(cookieObject);
		
		//capture all the cookies
		cookiesList = driver.manage().getCookies();
		
		//print size/number of cookies
		System.out.println("\n\n After deleting : " + cookiesList.size());
		
		for(Cookie ck : cookiesList)
		{
			System.out.println(ck.getName() + ":" + ck.getValue());
		}
		//------------------------------------------------------------------------------
		//delete all cookies
		driver.manage().deleteAllCookies();
		
		//capture all the cookies
		cookiesList = driver.manage().getCookies();
		
		//print size/number of cookies
		System.out.println("\n After deleting : " + cookiesList.size());
	
		driver.quit();
		
	}

}
