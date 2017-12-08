package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testing {
	
	@Test
	public void Demo()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://learn-automation.com/selenium-maven-build-and-usage/");
		
		
	}

}
