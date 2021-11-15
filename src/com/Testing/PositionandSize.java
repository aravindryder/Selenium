package com.Testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositionandSize {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Flynn Ryder\\\\eclipse-workspace\\\\com.Testing\\\\Driver\\\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		String title = wd.getTitle();
		System.out.println("Title: " + title);
		String currentUrl = wd.getCurrentUrl();
		System.out.println("URL: " + currentUrl);
		
		wd.manage().window().maximize();
		Thread.sleep(2000);
		
		Dimension size = new Dimension(650, 750);
		wd.manage().window().setSize(size);
		Thread.sleep(2000);
		
		Point position = new Point(500, 100);
		wd.manage().window().setPosition(position);
		Thread.sleep(2000);
		
		WebElement id = wd.findElement(By.id("email"));
		id.sendKeys("javatester");
		boolean enabled = id.isEnabled();
		System.out.println(enabled);
		Thread.sleep(1000);
		
		WebElement pass = wd.findElement(By.name("pass"));
		pass.sendKeys("abcdefghi");
		Thread.sleep(1000);
		
		wd.manage().window().maximize();
		WebElement login = wd.findElement(By.name("login"));
		login.click();
		Thread.sleep(1000);
		
		TakesScreenshot shot = (TakesScreenshot) wd;
		File sou = shot.getScreenshotAs(OutputType.FILE);
		File Des = new File("C:\\Users\\Flynn Ryder\\eclipse-workspace\\com.Testing\\ScreenShot\\New_Shot.png");
		FileUtils.copyFile(sou, Des);
		
		Thread.sleep(3000);
		wd.close();
	}
}