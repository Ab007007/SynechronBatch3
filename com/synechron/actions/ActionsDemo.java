package com.synechron.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.synechron.utils.ActitimeUtils;
import com.synechron.utils.DriverUtils;

public class ActionsDemo 
{
	public static void main(String[] args) {
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launchApp(driver, "http://localhost:8080/login.do");
		Actions act = new Actions(driver);
		
		act.sendKeys("admin").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("manager").perform();
		act.sendKeys(Keys.ENTER).perform();
				
		
	}

}










