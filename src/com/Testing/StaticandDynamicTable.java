package com.Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticandDynamicTable {

		public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Flynn Ryder\\eclipse-workspace\\com.Testing\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();				//upcasting 
		wd.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		
		System.out.println("\n\t\t\tSTATIC TABLE\n\n");
		String Stat = wd.getCurrentUrl();
		System.out.println("URL:"+ Stat +"\n");
		wd.manage().window().maximize();
		Thread.sleep(1000);
			
		//Static Table
		List<WebElement> head = wd.findElements(By.xpath("//table/thead/tr/th"));
		for (WebElement webh : head) {
			String text = webh.getText();
			System.out.println(text);
		}
			
		Thread.sleep(1000);
		System.out.println("\n******************************************\n");
			
		List<WebElement> body = wd.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement webb : body) {
			//String text = webb.getText();
			System.out.println(webb.getText());
		}
			
		Thread.sleep(1000);
		System.out.println("\n******************************************\n");
			
		List<WebElement> body1 = wd.findElements(By.xpath("//table/tbody/tr[6]/td"));
		for (WebElement webc : body1) {
			System.out.println(webc.getText());
		}
			
		Thread.sleep(1000);
		System.out.println("\n******************************************\n");
			
		List<WebElement> body2 = wd.findElements(By.xpath("//table/tbody/tr[5]/td[3]"));
		for (WebElement webc1 : body2) {
			System.out.println(webc1.getText());
		}
			
		Thread.sleep(1000);
		System.out.println("\n**********//////////////////////////**************\n\n");
			
		//Dynamic Table
		System.out.println("\n\t\t\tDYNAMIC TABLE\n\n");
		wd.navigate().to("https://www.worldometers.info/coronavirus/");
		String currentUrl = wd.getCurrentUrl();
		System.out.println("URL: "+ currentUrl + "\n");
		
		List<WebElement> dynh = wd.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		for (WebElement wedy : dynh) {
				System.out.println(wedy.getText().replaceAll("\n", " "));
		}
			
		Thread.sleep(1000);
		wd.quit();
	}
}