package com.Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class FaceTest {

	public static WebDriver driver;

	@Test
	public void faceTest() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		// Validation - Hard Assertion
		Assert.assertEquals(driver.getTitle(), "Facebook - Entrar o registrarse");
		
		System.out.println("PASO LA PRUEBA");
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
