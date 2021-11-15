package com.Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Flynn Ryder\\eclipse-workspace\\com.Testing\\Driver\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		wd.get("https://www.facebook.com/");

		Thread.sleep(3000);
		wd.quit();
	}
}