package org.openmrs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LandingPg {

	WebDriver driver;
	
	By titletext = By.cssSelector(".heading3>td");
	
	public LandingPg(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public String getUserName()
	{
		return driver.findElement(titletext).getText();
		
	}
}
	