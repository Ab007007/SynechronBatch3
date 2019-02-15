package com.synechron.testng.groups;

import org.testng.annotations.Test;

public class Bus {

	@Test(groups="mahendra")
	public void mBus()
	{
		System.out.println("XUV");
	}
	
	@Test(groups="mahendra")
	public void mBus2()
	{
		System.out.println("TUV");
	}
	
	@Test(groups="maruthi")
	public void volvoSleeper()
	{
		System.out.println("swift");
	}
	
	@Test(groups="maruthi")
	public void volvoSleeper2()
	{
		System.out.println("swiftdesire");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
