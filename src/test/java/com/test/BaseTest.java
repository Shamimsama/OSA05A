package com.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	
	  WebDriver driver;
	  
	  @Before public void getDriver() {
	  System.setProperty("webdriver.chrome.driver",
	  "C:\\Users\\Md Shamibur Rahman\\Downloads\\chromedriver.exe"); driver=new
	  ChromeDriver(); driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  }
	 

	public HomePage nevigateToURL() {
		driver.get("http://www.bankrate.com");
		return new HomePage(driver);
	}
	
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		
	}

}
