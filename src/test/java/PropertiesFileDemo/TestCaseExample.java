package PropertiesFileDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseExample {

	public static void main(String[] args) throws IOException {


		//Launch Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		ReadConfigFile ConfigFile = new ReadConfigFile();
		//Open URL
		//driver.get("https://www.saucedemo.com/");
		driver.get(ConfigFile.getURL());
		
		//Find Username & Enter the Password
		driver.findElement(By.id("user-name")).sendKeys(ConfigFile.getUsername());
		driver.findElement(By.id("password")).sendKeys(ConfigFile.getPassword());
		
		//Click on Login Button
		driver.findElement(By.id("login-button")).click();
		
		

	}

}
