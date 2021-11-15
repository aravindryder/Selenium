package com.Testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Flynn Ryder\\eclipse-workspace\\com.Testing\\Driver\\chromedriver.exe");
		WebDriver driv = new ChromeDriver();
		driv.get("https://www.myntra.com/");
		driv.manage().window().maximize();
		driv.manage().deleteAllCookies();
		Thread.sleep(3000);
		
		//XPath = Relative XPath
		driv.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a")).click();
		Thread.sleep(3000);
		
		//Full XPath = Absolute XPath
		driv.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/a/div/picture/img")).click();
		Thread.sleep(2000);
		
		//Dynamic XPath	
		List<WebElement> casual = driv.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
		
		//List - ArrayList
		List<Integer> a = new ArrayList<Integer>();
		
		//for each Loop
		for (WebElement dress : casual) {
			String text = dress.getText().replaceAll("Rs. ", "");
			int parseInt = Integer.parseInt(text);
			a.add(parseInt);
		}
		//Print Total Items in this list
		System.out.println("Total Number of Items in this List: " + a.size() + "\n");
		
		//Print All Prices of this list
		System.out.println(a + "\n");
		
		//Arrange Minimum prices of this list
		System.out.println("*************************************************");
		System.out.println(Collections.min(a));
		
		Thread.sleep(2000);
		driv.quit();
	}
}