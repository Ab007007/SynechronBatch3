package com.synechron.validatioins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.synechron.utils.ActitimeUtils;
import com.synechron.utils.DriverUtils;

public class ValidationsDemo 
{
	public static void main(String[] args) {
		WebDriver driver  =  DriverUtils.getMyDriver();
		ActitimeUtils.launchApp(driver, "http://formy-project.herokuapp.com/");
		WebElement link = driver.findElement(By.linkText("Enabled and disabled elements"));
		System.out.println(link.isDisplayed());
		System.out.println(link.isEnabled());
		System.out.println(link.isSelected());
		System.out.println(link.getText());
		System.out.println(link.getAttribute("href"));
		System.out.println(driver.getTitle());
				
	}
	

}
