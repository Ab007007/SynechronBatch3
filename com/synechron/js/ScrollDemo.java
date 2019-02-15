package com.synechron.js;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.synechron.utils.ActitimeUtils;
import com.synechron.utils.DriverUtils;

public class ScrollDemo
{
	@Test
	public void scrollVerticalTest()
	{
		WebDriver driver = DriverUtils.getMyDriver();
		driver.get("http://formy-project.herokuapp.com/scroll");
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, 500);");
		
	}

}
