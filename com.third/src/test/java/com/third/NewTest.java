package com.third;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	 
	  
	  @BeforeTest
	  public void beforeTest()
	  {
			
		  System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Ashwini_Java\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		  driver=new FirefoxDriver();

	  }
	  
	  
	  @Test
	  public void setUp()
	  {
		  driver.get("https://www.amazon.in/");
	  }
	  

	  @AfterTest
	  public void afterTest() 
	  {
		 
		  driver.close();
	  }

	}

