package com.Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Flynn Ryder\\eclipse-workspace\\com.Testing\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		wd.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("\n");
		
		WebElement selectall = wd.findElement(By.id("multi-select"));
		Select s = new Select(selectall);
		
		//isMultiple
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		//getOption and getAllSelectedOption
		List<WebElement> options = s.getOptions();
		System.out.println(options.size() + "\n");
		for (WebElement multi : options) {
			System.out.println(multi.getText());
		}
		
		//deSelectedAllOptions
		WebElement deselect = wd.findElement(By.id("multi-select"));		
		Select ds = new Select(deselect);
		ds.deselectAll();
		System.out.println("\n************************************************\n");
		
		wd.quit();
		Thread.sleep(5000);
	}
}