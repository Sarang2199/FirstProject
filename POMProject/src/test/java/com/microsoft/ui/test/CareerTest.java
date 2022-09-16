package com.microsoft.ui.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CareerTest {
	WebDriver driver;
	@BeforeClass
	public void SetupDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void Navigation() {
		driver.get("https://careers.microsoft.com/us/en");
		
	}
	@AfterClass
	public void CloseDriver() {
		driver.close();
	}

}
