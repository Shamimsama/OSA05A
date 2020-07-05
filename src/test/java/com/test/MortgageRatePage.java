package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MortgageRatePage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"mortgage-rate-table-app\"]/div/div/div[3]/div/table/tbody/tr[1]/td[6]/button") WebElement hSBCNextButton;
	@FindBy(xpath="//*[@id=\"csstyle\"]/div[2]/header/nav/ul/li[1]/div/div/div[1]/div/ul/li[1]/a") WebElement mortgageRateSubMenu;
	
	MortgageRatePage(WebDriver x){
		driver = x;
		PageFactory.initElements(driver, this);
	}
	
	public HSBCPage clickOnNextForHSBC() {
		
		hSBCNextButton.click();
		return new HSBCPage(driver);
	}
	
	

}
