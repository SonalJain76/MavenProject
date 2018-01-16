package org.openmrs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;



public class LoginPage {

	WebDriver driver;
	By username = By.name("uid");
	By password = By.name("password");
	By Loginbt = By.name("btnLogin");
	By titletext = By.xpath("//h2[text() = 'Guru99 Bank']");
	
	

	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	//Set user name in the text box
	
		public void setUserName(String strUserName)
		{
			  driver.findElement(username).sendKeys(strUserName);
		}
		
		public void setPassword(String strPassword)
		{
			  driver.findElement(password).sendKeys(strPassword);
		}
		
		public void clickLogin()
		{
			  driver.findElement(Loginbt).click();
		}
		
		
		public void login (String strUserName, String strPassword)
		{
	        
	       this.setUserName(strUserName);
	       this.setPassword(strPassword);
	       this.clickLogin();
	       
	  	}
		
		 public String verifyTitle()
		    {
		     return driver.findElement(titletext).getText() ;
		    }
		
		@AfterClass
	public void logout()
	{
		driver.close();
	}
	}

   
		