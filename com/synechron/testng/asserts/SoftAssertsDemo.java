package com.synechron.testng.asserts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertsDemo {
	
	@Test
	public void additionTest()
	{
		SoftAssert sa = new SoftAssert();
		int a=5;
		int b=10;
		sa.assertEquals(a+b, 10);
		System.out.println("*******************");
		a=15;
		b=30;
		sa.assertEquals(a+b, 45);
		
		System.out.println("*******************End");
		sa.assertAll();
	}

}
