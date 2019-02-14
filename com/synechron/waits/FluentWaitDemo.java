package com.synechron.waits;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.collect.FluentIterable;
import com.synechron.utils.ActitimeUtils;
import com.synechron.utils.DriverUtils;

public class FluentWaitDemo
{
	public static void main(String[] args) {
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launchApp(driver, "file:///D:/Synechron/11_FEB_SELENIUM/html/CounterText.html");
		
		FluentWait<WebElement> wait  = 
				new FluentWait<WebElement>(driver.findElement(By.id("counter")))
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);
		
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() {

			@Override
			public Boolean apply(WebElement myele) {
				String text =null;
				text = myele.getText();
				
				System.out.println(text);
				if(!(text.equals("NaN")))
				{
					System.out.println(" Waiting for Element to change the status...");
					return false;
				}
				else
				{
					System.out.println("found..!!!!");
					return true;
				}
			}
		};
	
		wait.until(fun);
	
	}

}
