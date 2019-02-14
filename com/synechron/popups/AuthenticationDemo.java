package com.synechron.popups;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.synechron.utils.ActitimeUtils;

public class AuthenticationDemo 
{
	public static void main(String[] args) throws IOException {
		Runtime.getRuntime().exec("D:\\Synechron\\11_FEB_SELENIUM\\EclipseWS\\SeleniumPractice\\autoITScripts\\AuthenticationPopUp.exe");	
		WebDriver driver = ActitimeUtils.getMyDriver("ie");
		ActitimeUtils.launchApp(driver, "http://www.engprod-charter.net/");
		
	}

}
