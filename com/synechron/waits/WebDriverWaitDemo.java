package com.synechron.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.utils.DriverUtils;

public class WebDriverWaitDemo 
{
	public static void main(String[] args) {
		
		WebDriver driver = DriverUtils.getMyDriver();
		driver.get("file:///D:/Synechron/11_FEB_SELENIUM/html/PageLoadApp.html");
		
		WebDriverWait wait  = new WebDriverWait(driver, 20);
		WebElement visibileButton = wait.until
				(ExpectedConditions.visibilityOf(driver.findElement(By.id("btnContinue"))));
		
		System.out.println("Element is visible");
	}
}
