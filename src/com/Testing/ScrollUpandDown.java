package com.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpandDown {

		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Flynn Ryder\\eclipse-workspace\\com.Testing\\Driver\\chromedriver.exe");
			WebDriver wd = new ChromeDriver();				//upcasting
			wd.get("https://www.amazon.in/ref=nav_logo");
			wd.manage().window().maximize();
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor) wd;
			js.executeScript("window.scroll(0, 3500)", "");
			Thread.sleep(5000);
			
			js.executeScript("window.scrollTo(0, 0)", "");
			Thread.sleep(5000);
			
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
			Thread.sleep(5000);
			
			js.executeScript("window.scrollTo(0, 2000)", "");
			Thread.sleep(5000);
			
			WebElement findElement = wd.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			js.executeScript("arguments[0].scrollIntoView(true);", findElement);
			findElement.sendKeys("soundbar");
			Thread.sleep(3000);
			WebElement sear = wd.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
			sear.click();
			
			Thread.sleep(10000);
			wd.quit();
		}
	}