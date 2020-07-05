package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"csstyle\"]/div[2]/header/nav/ul/li[1]") WebElement mortgageMenu;
	@FindBy(xpath="//*[@id=\"csstyle\"]/div[2]/header/nav/ul/li[1]/div/div/div[1]/div/ul/li[1]/a") WebElement mortgageRateSubMenu;
	HomePage(WebDriver x){
		driver = x;
		PageFactory.initElements(driver, this);
	}
	public void mouseOverOnMortgage() {
		
		Actions ac = new Actions(driver);
		ac.moveToElement(mortgageMenu).build().perform();
		ac.contextClick(mortgageMenu).perform();
		
		
		
		WebElement ele=driver.findElement(By.xpath("html/body/div[4]/div[2]/div/section/div[16]/figure/a/img"));
		
        

	}
	
	public MortgageRatePage clickOnMortgageRate() {
	mortgageRateSubMenu.click();
	return new MortgageRatePage(driver);
		
	}

}
