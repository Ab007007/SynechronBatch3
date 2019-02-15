package com.synechron.testng.allannotations;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DummyTests {

	@Parameters({"url", "username" , "password"})
	@Test
	public void dummyTest1(String url, String un, String pwd)
	{
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
	}
}
