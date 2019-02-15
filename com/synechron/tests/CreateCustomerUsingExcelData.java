package com.synechron.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.utils.ActitimeUtils;
import com.synechron.utils.ConfigReader;
import com.synechron.utils.DriverUtils;
import com.synechron.utils.ExcelUtils;

public class CreateCustomerUsingExcelData 
{
	public static void main(String[] args) {
		String sheetName = "createcustomer";
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launchApp(driver, ConfigReader.getMyPropertyValue("url"));
		ActitimeUtils.login(driver, ConfigReader.getMyPropertyValue("username"), ConfigReader.getMyPropertyValue("password"));
		ActitimeUtils.selectModule(driver, "tasks");
		int rowCount = ExcelUtils.getRowCount(sheetName);
		
		for(int i=1;i<rowCount;i++)
		{
			String customerName=ExcelUtils.getMyCellData(sheetName, i, 0);
			String customerDesc= ExcelUtils.getMyCellData(sheetName, i, 1);
			ActitimeUtils.clickOnCreateCustomerButton(driver);
			ActitimeUtils.CreateCustomer(driver,customerName,customerDesc);
		}
		
		
		ActitimeUtils.logout(driver);
		
	}

	
}
