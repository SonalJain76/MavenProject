package org.openmrs.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	protected WebDriver driver;
@Parameters({"browserType","url"})
	@BeforeClass


	public void invokebrowser(String browserType, String url)
	{
		
			if (browserType.equals("FF"))
					{
			System.setProperty("webdriver.geckodriver", "geckodriver.exe");
			 driver = new FirefoxDriver();
					}
			else if (browserType.equals("Chrome"))
			{
				System.setProperty("webdriver.chromedriver", "chromedriver.exe");
				 driver = new ChromeDriver();
			}
			else 
			{
				System.setProperty("webdriver.InternetExplorerDriver", "InternetExplorerDriver.exe");
			 driver = new InternetExplorerDriver();
			}
			driver.get(url);
	}
}

