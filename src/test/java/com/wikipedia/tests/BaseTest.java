package com.wikipedia.tests;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.wikipedia.utils.DriverFactory;

public abstract class BaseTest {

	protected static WebDriver driver;

	public static WebDriver getDriver() {
		return driver = ((driver != null) ? driver : DriverFactory.getDriver());
	}

	@BeforeClass
	public static void openBrowser() {
		getDriver();
	}

	public static void closeBroser() {
		driver.quit();
	}

}
