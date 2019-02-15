package com.synechron.testng.allannotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllAnotations {
  @Test
  public void Test1() {
	  Reporter.log("TEST-1");
  }
  @Test
  public void Test2()
  {
	  Reporter.log("TEST-2");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("afterMethod");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("beforeClass");
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("afterClass");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  Reporter.log("beforeTest");
  }

  @AfterTest
  public void afterTest()
  {
	  Reporter.log("afterTest");
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  Reporter.log("beforeSuite");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  Reporter.log("afterSuite");
  }

}
