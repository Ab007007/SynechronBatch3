package com.synechron.testng.allannotations;

import org.testng.annotations.DataProvider;

public class TestData {

	 @DataProvider(name="mytestdata")
	  public Object[][] customerdata() {
	    return new Object[][] {
	    	  new Object[] { "Customer-1TEstNG1" ,"Customer-1TEstNG1-Desc"},
	    	  new Object[] { "Customer-1TEstNG2" ,"Customer-1TEstNG2-Desc"},
	    	  new Object[] { "Customer-1TEstNG3" ,"Customer-1TEstNG3-Desc"},
	    	  new Object[] { "Customer-1TEstNG4" ,"Customer-1TEstNG4-Desc"},
	   };
	  }
}
