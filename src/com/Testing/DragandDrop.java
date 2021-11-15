package com.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Flynn Ryder\\eclipse-workspace\\com.Testing\\Driver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();		//upcasting
		w.get("http://www.leafground.com/pages/drop.html");
		w.manage().window().maximize();
		Thread.sleep(3000);
		
		//drag and drop
		Actions a = new Actions(w);
		
		WebElement drag = w.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]"));
		WebElement drop = w.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]"));
		Thread.sleep(3000);
		
		a.dragAndDrop(drag, drop).build().perform();
		
		Thread.sleep(3000);
		w.quit();
	}
}