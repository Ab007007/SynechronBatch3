package com.synechron.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 
{
	public static String getMyPropertyValue(String key)
	{	
		File f=null;
		FileInputStream fis =null;
		Properties props =null;
		String value = null;
		try
		{
			f  = new File("data//config.properties");
			fis  =  new FileInputStream(f);
			props = new Properties();
			props.load(fis);
			value = props.getProperty(key);
		}catch(Exception ex)
		{
			System.out.println("Exception while reading properties file..!!!!");
		}
		finally
		{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return value;
	}
	
	
	
	
	
}
