package com.synechron.basics;

import java.util.Date;

public class TEstME 
{
	public static void main(String[] args) {
		Date d  = new Date();
		System.out.println(d.toString().replaceAll(" ", "_").replaceAll(":", "_"));
	}
	

}
