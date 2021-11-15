package com.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Flynn Ryder\\eclipse-workspace\\com.Testing\\Driver\\chromedriver.exe");
	    WebDriver wd = new ChromeDriver();
	    wd.get("http://demo.automationtesting.in/Alerts.html");
	    
	    wd.manage().window().maximize();
	    
	    
	    //simple alert
	    WebElement ale = wd.findElement(By.xpath("(//a[@class='analystic'])[1]"));
	    ale.click();
	    
	    WebElement ale1 = wd.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    ale1.click();
	    wd.switchTo().alert().accept();
	    Thread.sleep(2000);
	    
	    //confirm alert
	    WebElement ale2 = wd.findElement(By.linkText("Alert with OK & Cancel"));
	    ale2.click();
	    
	    WebElement ale3 = wd.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button"));
	    ale3.click();
	    wd.switchTo().alert().dismiss();
	    Thread.sleep(2000);
	    
	    //prompt alert
	    WebElement ale4 = wd.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
	    ale4.click();
	    Thread.sleep(2000);
	    
	    WebElement ale5 = wd.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
	    ale5.click();
	    Thread.sleep(2000);
	    
	    wd.switchTo().alert().sendKeys("Ryder");
	    wd.switchTo().alert().accept();
	    Thread.sleep(5000);
	    
	    wd.navigate().to("https://www.irctc.co.in/nget/train-search");
	    WebElement ale6 = wd.findElement(By.xpath("(//button[@type='submit'])[1]"));
	    ale6.click();
	    
	    Thread.sleep(5000);
	    wd.quit();
	}
}