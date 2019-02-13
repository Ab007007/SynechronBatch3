package com.synechron.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello All welcome to Selenium..");
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8080");
		
	//	WebElement userNameTextBox = driver.findElement(By.id("username"));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		
		
		driver.close();
	}

}
