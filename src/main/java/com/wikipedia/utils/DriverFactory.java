package com.wikipedia.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;


public class DriverFactory {
    public static final String BROWSER = System.getProperty("browser").toLowerCase();  

    public static WebDriver getDriver()  {

        switch (BROWSER) {        
        	case "chrome":
        		return getChromeDriver();   
        	case "firefox":
        		return getFirefoxDriver();                       
            default:
            	System.out.println(BROWSER + " is not a supported browser............. Stopping the test execution..........".toUpperCase());
            	System.exit(1);
                return null;         
        }       
    }

    private static WebDriver getFirefoxDriver() {
    	System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "target/firefox_logs.txt");
        FirefoxDriverManager.getInstance().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized");
        return new FirefoxDriver(options);
    }

    private static WebDriver getChromeDriver() {
    	ChromeDriverManager.getInstance().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        return new ChromeDriver(options);
    }
}
