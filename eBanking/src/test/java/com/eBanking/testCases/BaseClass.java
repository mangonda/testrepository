package com.eBanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public String baseURL = "https://demo.guru99.com/v4/";
	public String username = "mngr403584";
	public String password = "bEdYgYq";
	public static WebDriver driver;
	public static Logger logger;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
