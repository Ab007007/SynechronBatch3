package com.synechron.switchto;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import com.synechron.utils.ActitimeUtils;
import com.synechron.utils.DriverUtils;

public class FramesUsingName 
{
	public static void main(String[] args) {
		System.out.println("Main Started...");
		WebDriver driver =  DriverUtils.getMyDriver();
		ActitimeUtils.launchApp(driver, "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_settimeout_param");
		ActitimeUtils.checkEnabledAndClick(driver,"xpath","//button[contains(text(),'Run')]");
		driver.switchTo().frame("iframeResult");
		ActitimeUtils.checkEnabledAndClick(driver,"xpath","//button[text()='Start']");
		FluentWait<WebElement> wait = new FluentWait<WebElement>(driver.findElement(By.id("demo")))
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(NoSuchElementException.class)
				.ignoring(Exception.class);
		
		Function fun = new Function<WebElement, Boolean>() {
			@Override
			public Boolean apply(WebElement ele) {
				
				if(ele.getText().equals("Hello"))
				{
						System.out.println("HElllooooooooooooooo Found");
						return true;
				}
				else
				{
						System.out.println("Waiting..!!!!!!!");
						return false;
				}
			}

		};
		
		wait.until(fun);
		System.out.println("Ended.....");
	}

}
