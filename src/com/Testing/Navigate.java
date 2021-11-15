package com.Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Flynn Ryder\\eclipse-workspace\\com.Selenium\\WebDriver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("https://www.instagram.com/");
		
		String title = w.getTitle();
		System.out.println("Title: " + title);
		
		w.manage().window().maximize();

		Thread.sleep(2000);
		
		w.navigate().to("https://www.ebay.com/");
		
		String currentUrl = w.getCurrentUrl();
		System.out.println("URL: " + currentUrl);
		Thread.sleep(2000);
		
		w.navigate().back();
		Thread.sleep(2000);
		
		w.navigate().forward();
		String pageSource = w.getPageSource();
		System.out.println(pageSource);
		Thread.sleep(2000);
		
		w.navigate().to("https://www.quora.com/");
		Thread.sleep(3000);
		w.navigate().refresh();
		Thread.sleep(2000);
		
		w.close();
	}
}