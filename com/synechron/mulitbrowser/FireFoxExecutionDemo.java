package com.synechron.mulitbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.synechron.utils.DriverUtils;

public class FireFoxExecutionDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  DriverUtils.getMyDriver("ff");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost:8080");
		Thread.sleep(3000);
		
		//	WebElement userNameTextBox = driver.findElement(By.id("username"));
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
	}
}
