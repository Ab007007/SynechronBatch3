package com.synechron.testng;

import org.testng.annotations.Test;

public class SecondTest {
	@Test(priority=1)
	public void launch() {
		System.out.println("Test-Launch");
	}

	@Test(priority=2)
	public void login() {
		System.out.println("Test-Login");
	}

	@Test(priority=3)
	public void createCustomer()
	{
		System.out.println("Test- CreateCustomer");
	}
	@Test(priority=4)
	public void logout() {
		System.out.println("Test-Logout");
	}
}
