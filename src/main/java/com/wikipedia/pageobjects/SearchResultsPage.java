package com.wikipedia.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends BasePage {

	public SearchResultsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[normalize-space(text()[1])='Software' and normalize-space(text()[2])='engineers']/parent::th/following::td[1]/div/ul/li[3]")
	private WebElement thirdLink;

	public void clickOnLink(String link) {
		waitUntil(By.linkText(link), 4).click();
	}

	public void clickThridLink() {
		waitUntil(thirdLink, 4).click();	
	}
}
