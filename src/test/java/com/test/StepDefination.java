package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	
	BaseTest b;
	HomePage h;
	MortgageRatePage m;
	HSBCPage hs;

	@Given("^Open browser$")
	public void open_browser() throws Throwable {
		b = new BaseTest();
		b.getDriver();
	}

	@Given("^Nevigate to URL$")
	public void nevigate_to_URL() throws Throwable {
		h= b.nevigateToURL();
	}

	@When("^User hoverOver on mortgage$")
	public void user_hoverOver_on_mortgage() throws Throwable {
	    h.mouseOverOnMortgage();
	}

	@When("^User click on mortgage rate$")
	public void user_click_on_mortgage_rate() throws Throwable {
		m=h.clickOnMortgageRate();
	}

	@When("^User click on next HSBC Button$")
	public void user_click_on_next_HSBC_Button() throws Throwable {
	  hs = m.clickOnNextForHSBC();
	}

	@Then("^User should be able to see HSBC Bank Rate Page$")
	public void user_should_be_able_to_see_HSBC_Bank_Rate_Page() throws Throwable {
	   System.out.println("HSBC");
	}

}
