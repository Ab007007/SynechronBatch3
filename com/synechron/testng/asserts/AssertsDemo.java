package com.synechron.testng.asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertsDemo {
	
	@Test
	public void additionTest()
	{
		int a=5;
		int b=10;
		Assert.assertEquals(a+b, 10);
		System.out.println("*******************");
		a=15;
		b=30;
		Assert.assertEquals(a+b, 45);
		
		System.out.println("*******************End");
	}

}
