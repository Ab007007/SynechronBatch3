package com.synechron.mulitbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDemo {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "driver//geckodriver.exe");
//		WebDriver driver =  new FirefoxDriver();
		
		System.setProperty("webdriver.ie.driver", "driver//IEDriverServer.exe");
		WebDriver driver =  new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost:8080");
		Thread.sleep(3000);
		
		//	WebElement userNameTextBox = driver.findElement(By.id("username"));
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
	}
}
