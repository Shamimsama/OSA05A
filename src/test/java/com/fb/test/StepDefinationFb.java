package com.fb.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinationFb {
	WebDriver dr;
	@Given("^open browser$")
	public void open_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md Shamibur Rahman\\Documents\\chromedriver.exe");
		dr = new ChromeDriver();
	
	}

	@And("^nevigate to URl$")
	public void nevigate_to_URl() throws Throwable {
		dr.get("https://www.facebook.com/");
	}

	@When("^user type userId and password$")
	public void user_type_userId_and_password() throws Throwable {
	    dr.findElement(By.id("email")).sendKeys("dkjfdkj");
	    dr.findElement(By.id("pass")).sendKeys("jfhdkjg");
	}

	@And("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		System.out.println("click");
	    
	}

	@Then("^user should see his profile page$")
	public void user_should_see_his_profile_page() throws Throwable {
		System.out.println("profile");
		dr.quit();
	}
	
	@When("^user type \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_type_and(String arg1, String arg2) throws Throwable {
		dr.findElement(By.id("email")).sendKeys(arg1);
		dr.findElement(By.id("pass")).sendKeys(arg2);
	}
	
	

	@Then("^user should not see his profile page$")
	public void user_should_not_see_his_profile_page() throws Throwable {
		//Assert.assertFalse(4>3);
		System.out.println("profile");
	 dr.quit();
	}




}
