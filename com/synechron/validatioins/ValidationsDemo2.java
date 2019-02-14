package com.synechron.validatioins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.synechron.utils.ActitimeUtils;
import com.synechron.utils.DriverUtils;

public class ValidationsDemo2 
{
	public static void main(String[] args) {
		WebDriver driver  =  DriverUtils.getMyDriver();
		ActitimeUtils.launchApp(driver, "http://formy-project.herokuapp.com/");
		WebElement link = driver.findElement(By.linkText("Enabled and disabled elements"));
		
		DriverUtils.checkEnabledAndClick(link);
		WebElement disabledEle = driver.findElement(By.id("disabledInput"));
		WebElement enabledEle = driver.findElement(By.id("input"));		
		DriverUtils.checkEnabledAndType(disabledEle, "juck123");
		DriverUtils.checkEnabledAndType(enabledEle, "juck123");
		
				
	}
	

	
	

}
