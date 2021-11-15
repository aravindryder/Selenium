package com.Testing;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Move {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Flynn Ryder\\eclipse-workspace\\com.Testing\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();				//upcasting
		wd.get("https://www.myntra.com/");
		wd.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions a = new Actions(wd);
		WebElement kid = wd.findElement(By.xpath("//a[@data-group='kids']"));
		a.moveToElement(kid).build().perform();
		Thread.sleep(2000);
		
		WebElement toy = wd.findElement(By.linkText("Soft Toys"));
		a.contextClick(toy).build().perform();
		Thread.sleep(3000);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		
		WebElement women = wd.findElement(By.xpath("//a[@data-group='women']"));
		a.moveToElement(women).build().perform();
		Thread.sleep(2000);
		
		WebElement saree = wd.findElement(By.linkText("Sarees"));
		a.contextClick(saree).build().perform();
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement men = wd.findElement(By.xpath("//a[@data-group='men']"));
		a.moveToElement(men).build().perform();
		Thread.sleep(2000);
		
		WebElement dress = wd.findElement(By.linkText("Sherwanis"));
		a.contextClick(dress).build().perform();
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		Thread.sleep(3000);
		wd.close();
		Thread.sleep(5000);
		wd.quit();
	}
}