package com.synechron.switchto;

import org.openqa.selenium.WebDriver;

import com.synechron.utils.ActitimeUtils;
import com.synechron.utils.DriverUtils;

public class HandlingAlertsDemo 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launchApp(driver, "http://localhost:8080");
		ActitimeUtils.login(driver, "admin", "manager");
		ActitimeUtils.selectModule(driver, "tasks");
		ActitimeUtils.clickOnCreateCustomerButton(driver);
		ActitimeUtils.checkEnabledAndType(driver,"id","customerLightBox_nameField","JunkText");
		ActitimeUtils.checkEnabledAndClick(driver,"id","customerLightBox_cancelBtn");
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		ActitimeUtils.checkEnabledAndClick(driver,"id","customerLightBox_cancelBtn");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
	}

}
