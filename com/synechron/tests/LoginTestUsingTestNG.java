package com.synechron.tests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.synechron.utils.ActitimeUtils;
import com.synechron.utils.ConfigReader;
import com.synechron.utils.DriverUtils;

public class LoginTestUsingTestNG {

	WebDriver driver = null;
	@BeforeClass
	public void createDriver() throws MalformedURLException
	{
		//driver = DriverUtils.getMyDriver();
		String nodeUrl="http://192.168.0.92:5555/wd/hub"; // url of node
		
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.addArguments("disable-infobars");
		driver = new RemoteWebDriver(new URL(nodeUrl),options);
	
	}
	
	@Test(priority=1)
	public void loginWithValidCredentials()
	{
		ActitimeUtils.launchApp(driver, ConfigReader.getMyPropertyValue("url"));
		ActitimeUtils.login(driver, "admin","manager");
		ActitimeUtils.logout(driver);
	}
	
	@Test(priority=2)
	public void loginWithInValidCredentials()
	{
		ActitimeUtils.launchApp(driver, ConfigReader.getMyPropertyValue("url"));
		ActitimeUtils.login(driver, "admin12","manager12");
		ActitimeUtils.logout(driver);
	}
	
	@AfterMethod
	public void checkStatus(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			DriverUtils.getScreenShot();
		}
	}
	
	
	
	
	
	
	
	
}
