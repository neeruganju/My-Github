package com.scrips.ActiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;


// as per scenario create tests
public class TestHomepage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver");
				
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com");
		
		ActitimeLoginPage login = new ActitimeLoginPage(driver);
		login.loginMethod();
		
		ActitimeHomePage homepage = new ActitimeHomePage(driver);
		homepage.createhomepageMethod();
		
		
		
		
		
		

		
	}
		
	}


