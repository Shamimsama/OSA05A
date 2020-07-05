package com.test;

import org.junit.Test;

public class SmokeTest extends BaseTest {
	
	HomePage homePage;
	MortgageRatePage mortgageRatePage;
	HSBCPage hSBCPage;
	@Test
	public void test1() {
		homePage = new HomePage(driver);
		homePage.mouseOverOnMortgage();
		mortgageRatePage = homePage.clickOnMortgageRate();
		hSBCPage = mortgageRatePage.clickOnNextForHSBC();
		
	}
	
	
	

}
