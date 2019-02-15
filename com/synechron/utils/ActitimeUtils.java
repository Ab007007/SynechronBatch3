package com.synechron.utils;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeUtils extends DriverUtils
{
	
	public static void launchApp(WebDriver driver, String url)
	{
		System.out.println("Launching the App " + url);
		driver.get(url);
		DriverUtils.validateTitle(driver, "actiTIME - Login");
		
		
	}
	
	
	public static void login(WebDriver driver, String un,String pwd)
	{
		System.out.println("Logging in wiht " + un + " and " + pwd);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DriverUtils.validateTitle(driver, "actiTIME - Enter Time-Track");
	}

	public static void selectModule(WebDriver driver, String name)
	{
		System.out.println("Selecting module");
		driver.findElement(By.linkText(name.toUpperCase())).click();
		//DriverUtils.validateTitle(driver, expectedTitle);
	}

	public static void logout(WebDriver driver)
	{
		System.out.println("Logout of app");
		driver.findElement(By.id("logoutLink")).click();
		DriverUtils.validateTitle(driver, "actiTIME - Login");
	}

	public static void CreateCustomer(WebDriver driver,String cn,String cd) {
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys(cn);
		
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys(cd);
		driver.findElement(By.id("customerLightBox_commitBtn")).click();
		
		WebDriverWait waitAppear =  new WebDriverWait(driver, 10);
		waitAppear.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
		
		WebDriverWait waitDisAppear =  new WebDriverWait(driver, 10);
		waitAppear.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
	}

	public  static void clickOnCreateCustomerButton(WebDriver driver) {
		driver.findElement(By.xpath("//div[div[text()='Add New']]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'New Customer')]")).click();
	}









}
