package com.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Flynn Ryder\\eclipse-workspace\\com.Testing\\Driver\\chromedriver.exe");
	    WebDriver wd = new ChromeDriver();
	    wd.get("http://demo.automationtesting.in/Frames.html");
	    wd.manage().window().maximize();
	    Thread.sleep(3000);
	    
	    //iframe=single frame
	    WebElement ifra = wd.findElement(By.xpath("//*[@id=\"singleframe\"]"));
	    wd.switchTo().frame(ifra);
	    WebElement ifra1 = wd.findElement(By.xpath("/html/body/section/div/div/div/input"));
	    ifra1.sendKeys("flynn");
	    Thread.sleep(3000);
	    
	    wd.switchTo().defaultContent();
	    WebElement mifra = wd.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
	    mifra.click();
	    
	  //double frame
	    WebElement mifra1 = wd.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
	    wd.switchTo().frame(mifra1);
	    
	    WebElement ifra2 = wd.findElement(By.xpath("/html/body/section/div/div/iframe"));
	    wd.switchTo().frame(ifra2);
	    
	    WebElement ifra3 = wd.findElement(By.xpath("/html/body/section/div/div/div/input"));
	    ifra3.sendKeys("ryder");
	    
	    Thread.sleep(3000);
	    wd.quit();
	}
}