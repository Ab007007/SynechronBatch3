package com.synechron.testng.groups;

import org.testng.annotations.Test;

public class Cars {

	@Test(groups= {"mahendra","cars"})
	public void xuv()
	{
		System.out.println("XUV");
	}
	
	@Test(groups="mahendra")
	public void tuv()
	{
		System.out.println("TUV");
	}
	
	@Test(groups="honda")
	public void hondaCity()
	{
		System.out.println("hondaCity");
	}
	
	@Test(groups="honda")
	public void hondaCivic()
	{
		System.out.println("hondaCivic");
	}
	@Test(groups="maruthi")
	public void swift()
	{
		System.out.println("swift");
	}
	
	@Test(groups="maruthi")
	public void swiftdesire()
	{
		System.out.println("swiftdesire");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
