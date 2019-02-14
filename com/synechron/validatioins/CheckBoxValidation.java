package com.synechron.validatioins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.synechron.utils.ActitimeUtils;
import com.synechron.utils.DriverUtils;

public class CheckBoxValidation 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  =  DriverUtils.getMyDriver();
		ActitimeUtils.launchApp(driver, "http://formy-project.herokuapp.com/checkbox");
		Thread.sleep(5000);
		WebElement checkBoxEle = driver.findElement(By.id("checkbox-1"));
		
		DriverUtils.selectCheckBox(checkBoxEle);
		
		
	}

	
}
