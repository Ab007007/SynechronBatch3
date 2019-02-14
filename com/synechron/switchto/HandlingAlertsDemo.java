package com.synechron.switchto;

import org.openqa.selenium.WebDriver;

import com.synechron.utils.ActitimeUtils;
import com.synechron.utils.DriverUtils;

public class HandlingAlertsDemo 
{
	public static void main(String[] args) {
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launchApp(driver, "http://localhost:8080");
		ActitimeUtils.login(driver, "admin", "manager");
		ActitimeUtils.selectModule(driver, "tasks");
		ActitimeUtils.clickOnCreateCustomerButton(driver);
		ActitimeUtils.checkEnabledAndClick(driver,"id","");
	}

}
