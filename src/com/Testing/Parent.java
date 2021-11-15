package com.Testing;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Parent {
	
	public static WebDriver  wd; 
	
	public static WebDriver Browser(String url) {
		
		if (url.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			wd = new ChromeDriver();
		}
		
		else if (url.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\firefoxdriver.exe");
			wd = new FirefoxDriver();
		}
		
		else if (url.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver", System.getProperty("user.dir") + "\\Driver\\operadriver.exe");
			wd = new OperaDriver();
		}
		
		else if (url.equalsIgnoreCase("safari")) {
			System.setProperty("webdriver.safari.driver", System.getProperty("user.dir") + "\\Driver\\safaridriver.exe");
			wd = new SafariDriver();
		}
		
		else if (url.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\Driver\\edgedriver.exe");
			wd = new EdgeDriver();
		}
		
		else if (url.equalsIgnoreCase("internetExplore")) {
			System.setProperty("webdriver.opera.driver", System.getProperty("user.dir") + "\\Driver\\internetexploredriver.exe");
			wd = new InternetExplorerDriver();
		}
		
		wd.manage().window().maximize();
		return wd;
	}
	
	public static void Pass(WebElement w, String s) {
		w.sendKeys(s);
	}
	
	public static void click(WebElement c) {
		c.click();
	}

	public static void screenshot(String filepath) throws Exception {
		TakesScreenshot shot = (TakesScreenshot) wd;
		File sou = shot.getScreenshotAs(OutputType.FILE);
		File Des = new File("path.png");
		FileUtils.copyFile(sou, Des);
	}
	
	public static void close() {
		wd.close();
	}
}