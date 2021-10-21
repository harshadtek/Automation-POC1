package com.allegis.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Testbase {
	public WebDriver driver;



	@BeforeMethod()
	public void setup() throws IOException {
	Properties property = new Properties();
	FileInputStream fis = new FileInputStream(
	"C:\\Users\\hak\\eclipse-workspace\\allegisqa-allegis-automation-SeleniumTask 1\\src\\main\\resources\\Automation.properties");
	property.load(fis);
	System.setProperty("webdriver.chrome.driver", property.getProperty("Driver"));
	driver = new ChromeDriver();
	String amazonurl = property.getProperty("Url");
	driver.get(amazonurl);
	driver.manage().window().maximize();
	}


	@AfterMethod()
	public void close() {
	driver.quit();
	}
}
