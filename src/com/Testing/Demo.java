package com.Testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Flynn Ryder\\eclipse-workspace\\com.Testing\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();					// UpCasting
		wd.get("https://www.facebook.com/");
		wd.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement id = wd.findElement(By.id("email"));
		id.sendKeys("javatester");
		Thread.sleep(1000);
		
		WebElement pass = wd.findElement(By.name("pass"));
		pass.sendKeys("abcdefghi");
		Thread.sleep(1000);
		
		WebElement login = wd.findElement(By.name("login"));
		login.click();
		Thread.sleep(10000);
	
		TakesScreenshot ts = (TakesScreenshot) wd;			//Narrow casting
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Flynn Ryder\\eclipse-workspace\\com.Testing\\ScreenShot\\myproject.png");
		FileUtils.copyFile(source, destination);
		
		Thread.sleep(8000);
		wd.quit();
	}
}