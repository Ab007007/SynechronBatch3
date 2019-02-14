package com.synechron.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.utils.ActitimeUtils;
import com.synechron.utils.DriverUtils;

public class MouseMovement 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launchApp(driver, "https://www.flipkart.com/");
		WebDriverWait wait =  new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement
				(By.xpath("//div[@class='_3Njdz7']/button")))).click();
		
		Thread.sleep(5000);
		WebElement electronicsTab = driver.findElement(By.xpath("//span[text()='Electronics']"));
		WebElement womenTab = driver.findElement(By.xpath("//span[text()='Women']"));
		WebElement tvTab = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		WebElement groceryTab = driver.findElement(By.xpath("//span[text()='Grocery']"));

		Actions act = new Actions(driver);
		
		act.moveToElement(womenTab).perform();
		Thread.sleep(2000);
		act.moveToElement(electronicsTab).perform();
		Thread.sleep(2000);
		act.moveToElement(tvTab).perform();
		Thread.sleep(2000);
		act.moveToElement(groceryTab).perform();
		Thread.sleep(2000);
		driver.close();
	}

}








