package com.Testing;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {

	public static void main(String[] args) throws Throwable  {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Flynn Ryder\\eclipse-workspace\\com.Testing\\Driver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("http://automationpractice.com/index.php");
		String title = w.getTitle();
		System.out.println("Mini Project Title: "+title);
		String Url = w.getCurrentUrl();
		System.out.println("Mini Project URL: " + Url);
		Thread.sleep(2000);
		
//		w.manage().window().maximize();
//		Thread.sleep(3000);

		// product selection
		WebElement zoom = w.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[4]/div/div[1]/div/a[1]"));
		zoom.click();
		Thread.sleep(2000);
		
		// change the product size
		WebElement size = w.findElement(By.id("group_1"));
		Select s = new Select(size);
		s.selectByValue("3");
		Thread.sleep(3000);
		
		//add to cart
		WebElement addtocart = w.findElement(By.name("Submit"));
		addtocart.click();											
		Thread.sleep(10000);
		
		//proceed to check
		WebElement proceed = w.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
		proceed.click();
		Thread.sleep(5000);
		
		//proceed to checkout
		WebElement checkout = w.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
		checkout.click();
		Thread.sleep(3000);

		//sign in
		WebElement id = w.findElement(By.id("email"));
		id.sendKeys("ajithleo67@gmail.com");
		Thread.sleep(2000);
		WebElement pass = w.findElement(By.name("passwd"));
		pass.sendKeys("Password0007");
		Thread.sleep(2000);
		WebElement login = w.findElement(By.name("SubmitLogin"));
		login.click();
		Thread.sleep(1000);
		
		//address verification
		WebElement proceed2 = w.findElement(By.name("processAddress"));
		proceed2.click();
		Thread.sleep(2000);
		
		//acknowledgement
		WebElement agree = w.findElement(By.id("cgv"));
		agree.click();
		Thread.sleep(2000);
		
		WebElement proceed3 = w.findElement(By.name("processCarrier"));
		proceed3.click();
		Thread.sleep(2000);
		
		//bank wire payment
		WebElement payment = w.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
		payment.click();
		Thread.sleep(1000);
		
		//order confirm
		WebElement confirm = w.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
		confirm.click();
		Thread.sleep(2000);
		
		System.out.println("\n**************************************************************************************\n");
		String title1 = w.getTitle();
		System.out.println("Mini Project Completed: "+title1);
		String Url1 = w.getCurrentUrl();
		System.out.println("Mini Project Order URL: " + Url1);
		Thread.sleep(2000);
		
		//screenshot
		TakesScreenshot shot = (TakesScreenshot) w;
		File sou = shot.getScreenshotAs(OutputType.FILE);
		File Des = new File("C:\\Users\\Flynn Ryder\\eclipse-workspace\\com.Testing\\ScreenShot\\MiniProject.png");
		FileUtils.copyFile(sou, Des);

		//close window
		Thread.sleep(5000);		
		w.quit();
	}
}