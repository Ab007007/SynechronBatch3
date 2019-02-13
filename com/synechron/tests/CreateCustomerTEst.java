package com.synechron.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.utils.ActitimeUtils;
import com.synechron.utils.DriverUtils;

public class CreateCustomerTEst 
{
	public static void main(String[] args) {
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launchApp(driver, "http://localhost:8080");
		ActitimeUtils.login(driver, "admin", "manager");
		ActitimeUtils.selectModule(driver, "tasks");
		ActitimeUtils.clickOnCreateCustomerButton(driver);
		ActitimeUtils.CreateCustomer(driver,"NEWCUST-1","NEWDESC-1");
		ActitimeUtils.logout(driver);
		
	}

	
}
