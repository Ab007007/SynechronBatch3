package com.synechron.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.synechron.utils.ActitimeUtils;
import com.synechron.utils.DriverUtils;

public class DragAndDropDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  DriverUtils.getMyDriver();
		ActitimeUtils.launchApp(driver, "http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement draggableElement = driver.findElement(By.id("draggable"));
		WebElement droppableElement = driver.findElement(By.id("droppable"));
		System.out.println("Text Before dropping -->" + droppableElement.getText());
		Actions act =  new Actions(driver);
		act.dragAndDrop(draggableElement, droppableElement).perform();
		Thread.sleep(2000);
		System.out.println("Text After dropping -->" + droppableElement.getText());
	}
	
}
