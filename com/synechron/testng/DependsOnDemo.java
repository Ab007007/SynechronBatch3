package com.synechron.testng;

import org.testng.annotations.Test;

public class DependsOnDemo {
	@Test
	public void launch() {
		System.out.println("Test-Launch");
	}

	@Test(dependsOnMethods="launch")
	public void login() {
		System.out.println("Test-Login");
	}

	@Test(dependsOnMethods= {"login","launch"})
	public void createCustomer()
	{
		System.out.println("Test- CreateCustomer");
	}
	@Test(dependsOnMethods="createCustomer")
	public void logout() {
		System.out.println("Test-Logout");
	}
}
