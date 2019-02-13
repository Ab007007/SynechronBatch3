package com.synechron.basics;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestionsDemo 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Synechron");
//		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath("//ul[@class='erkvQe']"))));
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//li[@class='sbct']//span"));
		
		for (WebElement suggestion : suggestions)
		{
			System.out.println(suggestion.getText());
		}
		
		
		
		
		
		
		
		
		
	/*	Iterator<WebElement> it = suggestions.iterator();
		
		while(it.hasNext())
		{
			WebElement suggestion = null;
			suggestion = it.next();
			
			System.out.println(suggestion.getText());
		}*/
		
		
		
		System.out.println(suggestions.size());
	}

}
