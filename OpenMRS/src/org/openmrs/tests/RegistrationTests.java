package org.openmrs.tests;

import org.openmrs.pages.LandingPg;
import org.openmrs.pages.LoginPage;
import org.openmrs.util.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseClass{
	LoginPage lnpage;
	LandingPg landpg;
	WebDriver driver;
	
	@Test
	public void validateLogin()
	{
		
		lnpage = new LoginPage(driver);
		String loginPageTitle = lnpage.verifyTitle();
		
		Assert.assertTrue(loginPageTitle.contains("guru"));
//
		
		lnpage.login("mngr113804", "aruvYqU");
		
		//verify landing page
		landpg = new LandingPg (driver);
	Assert.assertTrue(landpg.getUserName().contains("manger"));
	}
}
