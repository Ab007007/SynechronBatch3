package com.synechron.browseroperation;

import org.openqa.selenium.WebDriver;

import com.synechron.utils.DriverUtils;

public class BrowserOperationsDemo 
{
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Started....");
		WebDriver driver = DriverUtils.getMyDriver();
		driver.get("http://localhost:8080/login.do");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();
		System.out.println("Main Ended....");
		
	}

}
