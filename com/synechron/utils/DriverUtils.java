package com.synechron.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils 
{
	static WebDriver driver = null;
	
	public static WebDriver getMyDriver()
	{
		System.out.println("[INFO - ] Creating a driver Object ");
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public static void checkEnabledAndClick(WebElement link) {
		if(link.isDisplayed())
		{
			System.out.println("Element is displayed ");
			if(link.isEnabled())
			{
				System.out.println("Element is Enabled and can Perform Action");
				link.click();
			}
			else
			{
				System.out.println("Element is not Enabled so ACTION CAN'T BE DONE...");
			}
		}
		else
		{
			System.out.println("element is not displayed");
		}
	}
	
	public static void checkEnabledAndType(WebElement link,String text) {
		if(link.isDisplayed())
		{
			System.out.println("Element is displayed ");
			if(link.isEnabled())
			{
				System.out.println("Element is Enabled and can Perform Action");
				link.sendKeys(text);
			}
			else
			{
				System.out.println("Element is not Enabled so ACTION CAN'T BE DONE...");
			}
		}
		else
		{
			System.out.println("element is not displayed");
		}
	}
	
	public static void selectCheckBox(WebElement checkBoxEle) {
		if(checkBoxEle.isDisplayed() && checkBoxEle.isEnabled())
		{
			System.out.println("check box is displayed and enabled ");
			if(checkBoxEle.isSelected())
			{
				System.out.println("CHECK BOX IS ALREADY SELECTED SO NOT SELECTING THE CB");
			}
			else
			{
				System.out.println("Selecting CheckBox");
				checkBoxEle.click();
			}
		}
		else
		{
			System.out.println("check box is either not displayed or enabled ");
		}
	}
}
