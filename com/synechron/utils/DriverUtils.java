package com.synechron.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtils 
{
	static WebDriver driver = null;
	/**
	 * THIS IS THE FUNCTION TO GET CHROME 
	 * BROWSER OBJ BY DEFAULT
	 * @return
	 */
	public static WebDriver getMyDriver()
	{
		System.out.println("[INFO - ] Creating a driver Object ");
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	/**
	 * THIS IS THE FUNCTION TO GET A 
	 * REQUIRED BROWSER OBJECT
	 * @author ahb
	 * @param type - chrome, ff , ie
	 * @return
	 */
	public static WebDriver getMyDriver(String type)
	{
		System.out.println("[INFO - ] Creating a driver Object for " + type );
		switch (type)
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "ff":
			System.setProperty("webdriver.gecko.driver","driver//geckodriver.exe");
			driver =  new FirefoxDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver","driver//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("Please pass the supported Browser type only");
			break;
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	
	public static WebElement getMyElement(WebDriver driver, String locator, String locatorValue)
	{
		System.out.println("Finding element using " + locator + " and " + locatorValue);
		WebElement ele = null;
		switch(locator)
		{
		case "id" :
				ele = driver.findElement(By.id(locatorValue));
				break;
		case "name" :
			ele = driver.findElement(By.name(locatorValue));
			break;

		case "classname" :
			ele = driver.findElement(By.className(locatorValue));
			break;

		case "tagname" :
			ele = driver.findElement(By.tagName(locatorValue));
			break;

		case "linktext" :
			ele = driver.findElement(By.linkText(locatorValue));
			break;

		case "partiallinktext" :
			ele = driver.findElement(By.partialLinkText(locatorValue));
			break;

		case "css" :
			ele = driver.findElement(By.cssSelector(locatorValue));
			break;

		case "xpath" :
			ele = driver.findElement(By.xpath(locatorValue));
			break;

		default :
				System.out.println("Please pass valid locator...");
		
		}
		return ele;
	}
	
	public static void checkEnabledAndClick(WebElement link) {
		//WebElement link  =  getMyElement(driver, locator, locatorValue);
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
	/**
	 * @author ahb
	 * @param link - PASS WEBELEMENT ON WHICH YOU WANT TO 
	 * PERFORM VALIDATION AND THEN CLICK ACTION
	 */
	public static void checkEnabledAndClick(WebDriver driver, String locator, String locatorValue) {
		WebElement link  =  getMyElement(driver, locator, locatorValue);
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
	/**
	 * @author ahb
	 * @param link - WEB ELEMENT ON WHICH YOU WNAT TO TYPE
	 * @param text - VALUE TO BE ENTERED
	 */
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
	
	
	public static void checkEnabledAndType(WebDriver driver,String locator,String locatorValue,String text) {
		WebElement link =  getMyElement(driver, locator, locatorValue);
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
