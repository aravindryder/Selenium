package com.Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class ParentChild extends Parent {
	
	public static void main(String[] args) {
		
		Browser("https://www.facebook.com/");
		wd.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		wd.findElement(By.id("email")).sendKeys("javatester");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		wd.findElement(By.name("pass")).sendKeys("12345678");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		wd.findElement(By.name("login")).click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}