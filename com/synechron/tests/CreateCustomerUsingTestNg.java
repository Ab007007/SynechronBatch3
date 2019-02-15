package com.synechron.tests;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.synechron.testng.allannotations.TestData;
import com.synechron.utils.ActitimeUtils;

public class CreateCustomerUsingTestNg
{
	WebDriver driver = null;
	
	@BeforeClass
	public void createDriver()
	{
		driver = ActitimeUtils.getMyDriver();
	}
	
	@AfterClass
	public void closeDriver()
	{
		driver.close();
		driver = null;
	}
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preExecutionSteps(String url , String username, String password)
	{
		ActitimeUtils.launchApp(driver, url);
		ActitimeUtils.login(driver, username, password);
		ActitimeUtils.selectModule(driver, "tasks");
	}
	
	@Test
	public void createCustomer()
	{
	
		ActitimeUtils.clickOnCreateCustomerButton(driver);
		ActitimeUtils.CreateCustomer(driver,"NEWCUST-1222","NEWDESC-1222");
	}
	
	@Test(dataProviderClass=TestData.class,dataProvider="mytestdata")
	public void createCustomerUsingDataProvider(String cn, String cd)
	{
		ActitimeUtils.clickOnCreateCustomerButton(driver);
		ActitimeUtils.CreateCustomer(driver,cn,cd);
	}
	@AfterMethod
	public void logoutFromApp()
	{
		ActitimeUtils.logout(driver);
	}
	
	
	
	
	

}
