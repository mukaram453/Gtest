package com.wikipedia.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);
		openBaseurl();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "searchInput")
	private WebElement searchField;

	@FindBy(id = "searchButton")
	private WebElement searchButton;

	public SearchResultsPage enterSearch(String searchText) {
		searchField.clear();
		searchField.sendKeys(searchText);
		searchButton.click();
		return new SearchResultsPage(driver);
	}

}
