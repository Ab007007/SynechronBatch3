package com.synechron.switchto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.synechron.utils.ActitimeUtils;
import com.synechron.utils.DriverUtils;

public class ChildBrowserDemo
{
	public static void main(String[] args) {
		WebDriver driver =  DriverUtils.getMyDriver("ff");
		ActitimeUtils.launchApp(driver, "https://www.irctc.co.in/eticketing/userSignUp.jsf");
		ActitimeUtils.checkEnabledAndClick(driver.findElement(By.linkText("Contact Us")));
		
		Set<String> windowIDs = driver.getWindowHandles();
		Iterator<String> it = windowIDs.iterator();
		
		String parentID = it.next();
		String childID = it.next();
		System.out.println("Parent window ID-- " + parentID);
		System.out.println("child window ID -- " + childID);
		
		driver.switchTo().window(childID);
		
		List<WebElement> hyperlinks = driver.findElements(By.xpath("//a"));
		System.out.println("Printing email ids present in child browser ");
		for (WebElement hyperlink : hyperlinks) {
			System.out.println(hyperlink.getText());
		}
		System.out.println("***************************************************");
		driver.close();
		driver.switchTo().window(parentID);
		System.out.println("Printing links Present  in Parent browser ");
		List<WebElement> linksInParent = driver.findElements(By.xpath("//a"));
	
		for (WebElement link : linksInParent) {
			System.out.println(link.getText());
		}
		driver.close();
		System.out.println("***************************************************");
	
//		driver.quit();
	}
}
