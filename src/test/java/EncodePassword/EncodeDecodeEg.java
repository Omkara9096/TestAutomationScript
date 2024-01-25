package EncodePassword;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EncodeDecodeEg {

	public static void main(String[] args) throws Exception{


		//Encode Password
		String password = "secret_sauce";
		
		String encodePassword = Base64.getEncoder().encodeToString(password.getBytes());
		
		System.out.println(encodePassword);
		// c2VjcmV0X3NhdWNl
		//------------------------------------------------------------------------------
		//Launch the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://www.saucedemo.com/");
		
		//enter the Username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//decode password
		
		byte[] decodePassword = Base64.getDecoder().decode(encodePassword);
		
		System.out.println(new String(decodePassword));
		
		driver.findElement(By.id("password")).sendKeys(new String(decodePassword));
		
		//click on login button
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(2000);
		
 
	}

}
