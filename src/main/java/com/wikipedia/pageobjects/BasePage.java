package com.wikipedia.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class BasePage {
	
	public static final String BASE_URL = "https://en.wikipedia.org";
	public WebDriver driver;	  
	protected Actions action;
   

    public BasePage(WebDriver driver) {
       this.driver = driver;
       action = new Actions(driver);
    }

    public String getCurrentUrl() {        
        return driver.getCurrentUrl();
    }

    public void openBaseurl() {
       driver.navigate().to(BASE_URL);
    } 
    
   
    
    public String urlEqualsTo(String url, int timeOut) {
    	WebDriverWait wait = new WebDriverWait(driver, timeOut);
    	wait.until(ExpectedConditions.urlToBe(url));
    	return url;
    }  
    
    public WebElement waitUntil(By by, int timeOut) {
    	WebDriverWait wait = new WebDriverWait(driver, timeOut);
    	return wait.until(ExpectedConditions.elementToBeClickable(by));
    } 

    
    public void goToPageEnd() {
        action.sendKeys(Keys.END).click().perform();
    }

}
