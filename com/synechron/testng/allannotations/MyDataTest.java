package com.synechron.testng.allannotations;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class MyDataTest {
  @Test(dataProvider = "mytestdata",dataProviderClass=TestData.class)
  public void f(String n, String s)
  {
	  System.out.println( n + " and " + s);
  }

 
}
