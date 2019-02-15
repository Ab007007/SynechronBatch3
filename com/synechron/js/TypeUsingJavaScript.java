package com.synechron.js;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.synechron.utils.ActitimeUtils;
import com.synechron.utils.DriverUtils;

public class TypeUsingJavaScript 
{
	WebDriver driver = null;
	@Test
	public void scrollDownTest(){
		driver = DriverUtils.getMyDriver();
		driver.get("http://formy-project.herokuapp.com/enabled");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('disabledInput').value='HackingAndEntering';");
		
	}
}
