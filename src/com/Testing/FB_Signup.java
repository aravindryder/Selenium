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
import org.openqa.selenium.support.ui.Select;

public class FB_Signup {
	
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Flynn Ryder\\eclipse-workspace\\com.Testing\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.facebook.com/");
		String title = wd.getTitle();
		System.out.println("Title: "+title);
		Thread.sleep(2000);
		
		wd.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement id = wd.findElement(By.id("email"));
		id.sendKeys("javatester");
		Thread.sleep(1000);
		boolean enabled = id.isEnabled();
		System.out.println(enabled);
				
		WebElement pass = wd.findElement(By.name("pass"));
		pass.sendKeys("abcdefghi");
		Thread.sleep(1000);
		boolean displayed = pass.isDisplayed();
		System.out.println(displayed);
		
		WebElement Create = wd.findElement(By.xpath("(//a[@role='button'])[2]"));
		Create.click();
		Thread.sleep(3000);
		
		WebElement fname = wd.findElement(By.name("firstname"));
		fname.sendKeys("java");
		
		WebElement lname = wd.findElement(By.name("lastname"));
		lname.sendKeys("tester");
		
		WebElement phn = wd.findElement(By.xpath("//input[@name='reg_email__']"));
		phn.sendKeys("9790888627");
		
		WebElement date = wd.findElement(By.id("day"));
		date.sendKeys("15");
		
		WebElement month = wd.findElement(By.id("month"));
		Select s = new Select(month);
		s.selectByValue("8");
		
		WebElement year = wd.findElement(By.id("year"));
		year.sendKeys("1946");
		
		WebElement password = wd.findElement(By.xpath("(//input[@type='password'])[2]"));
		password.sendKeys("123456789");
		
		WebElement gender = wd.findElement(By.xpath("(//input[@name='sex'])[2]"));
		gender.click();
		Thread.sleep(1000);
		
		WebElement signup = wd.findElement(By.xpath("//button[@name='websubmit']"));
		signup.click();
		Thread.sleep(20000);
		boolean selected = signup.isSelected();
		System.out.println(selected);
		
		TakesScreenshot shot = (TakesScreenshot) wd;
		File sou = shot.getScreenshotAs(OutputType.FILE);
		File Des = new File("C:\\Users\\Flynn Ryder\\eclipse-workspace\\selenium.java\\ScreenShot\\shot3.png");
		FileUtils.copyFile(sou, Des);
		
		wd.quit();
		Thread.sleep(5000);
	}
}