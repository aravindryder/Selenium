package com.Testing;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Flynn Ryder\\eclipse-workspace\\com.Testing\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();				//upcasting
		wd.get("https://www.amazon.in/ref=nav_logo");
		wd.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) wd;
		Actions a = new Actions(wd);
		WebElement mob = wd.findElement(By.xpath("//*[@id='nav-xshop']/a[1]"));
		a.contextClick(mob).build().perform();
		Thread.sleep(3000);
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement bs = wd.findElement(By.xpath("//*[@id='nav-xshop']/a[2]"));
		a.contextClick(bs).build().perform();
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement fas = wd.findElement(By.xpath("//*[@id='nav-xshop']/a[3]"));
		a.contextClick(fas).build().perform();
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement ele = wd.findElement(By.xpath("//*[@id='nav-xshop']/a[5]"));
		a.contextClick(ele).build().perform();
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement td = wd.findElement(By.xpath("//*[@id='nav-xshop']/a[8]"));
		a.contextClick(td).build().perform();
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		Set<String> handles = wd.getWindowHandles();
		for (String str : handles) {
			String title = wd.switchTo().window(str).getTitle();
			System.out.println(title);
			Thread.sleep(3000);
			js.executeScript("window.scroll(0, 2000)", "");
			Thread.sleep(3000);	
		}
		
		String s = "Amazon.in Bestsellers: The most popular items on Amazon";
		
		for (String string : handles) {

			if (wd.switchTo().window(string).getTitle().equalsIgnoreCase(s)) {
				break;
			}
		}
		
		js.executeScript("window.scrollTo(0, 3500)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,0)", "");
		
		Thread.sleep(5000);
		wd.quit();
	}
}