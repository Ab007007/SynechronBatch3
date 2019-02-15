package com.synechron.js;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.synechron.utils.ActitimeUtils;
import com.synechron.utils.DriverUtils;

public class ScrolToElementDemo
{
	@Test
	public void scrollVerticalTest() throws InterruptedException
	{
		WebDriver driver = DriverUtils.getMyDriver();
		driver.get("http://formy-project.herokuapp.com/scroll");
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		//js.executeScript("window.scrollTo(0, 500);");
		WebElement ele = ActitimeUtils.getMyElement(driver, "id", "name");
		js.executeScript("arguments[0].scrollIntoView();", ele);
		Thread.sleep(3000);
	}

}
