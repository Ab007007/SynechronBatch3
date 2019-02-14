package com.synechron.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.synechron.utils.ActitimeUtils;
import com.synechron.utils.DriverUtils;

public class SingleSelectDemo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launchApp(driver, "file:///D:/Synechron/11_FEB_SELENIUM/html/dropDown.html");
		
		WebElement selectDropDown = driver.findElement(By.xpath("//select"));
		
		Select sel = new Select(selectDropDown);
		
		List<WebElement> options = sel.getOptions();
		
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		
	}
}











