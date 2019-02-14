package com.synechron.popups;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.synechron.utils.ActitimeUtils;

public class ChromeAuthenticationemo 
{
	public static void main(String[] args) throws IOException {
		WebDriver driver = ActitimeUtils.getMyDriver("chrome");
		Runtime.getRuntime().exec("D:\\Synechron\\11_FEB_SELENIUM\\EclipseWS\\SeleniumPractice\\autoITScripts\\AuthenticationPopUpChrome.exe");	
		ActitimeUtils.launchApp(driver, "http://www.engprod-charter.net/");
		
	}

}
