package com.synechron.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.synechron.utils.ActitimeUtils;
import com.synechron.utils.DriverUtils;

public class SingleSelectDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launchApp(driver, "file:///D:/Synechron/11_FEB_SELENIUM/html/dropDown.html");
		
		WebElement selectDropDown = driver.findElement(By.xpath("//select"));
		
		Select sel = new Select(selectDropDown);
		sel.selectByIndex(3);
		Thread.sleep(3000);
		sel.selectByValue("mercedes");
		Thread.sleep(3000);
		sel.selectByVisibleText("Volvo");
		
		ActitimeUtils.launchApp(driver, "file:///D:/Synechron/11_FEB_SELENIUM/html/multiSelect.html");
		
		WebElement multiSelectDropDown = driver.findElement(By.xpath("//select"));
		Select multiSel = new Select(multiSelectDropDown);
		multiSel.selectByIndex(3);
		Thread.sleep(3000);
		multiSel.selectByValue("mercedes");
		Thread.sleep(3000);
		multiSel.selectByVisibleText("Volvo");
		Thread.sleep(3000);
		multiSel.deselectByIndex(3);
		Thread.sleep(3000);
		multiSel.deselectByValue("mercedes");

		multiSel.deselectAll();
		
	}
}











