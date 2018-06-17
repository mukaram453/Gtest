package com.wikipedia.tests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import com.wikipedia.pageobjects.BasePage;
import com.wikipedia.pageobjects.SearchPage;
import com.wikipedia.pageobjects.SearchResultsPage;

public class WikipediaTest extends BaseTest {

	SearchPage searchPage;
	SearchResultsPage searchResultsPage;

	public WikipediaTest() {
		searchPage = new SearchPage(driver);
		searchResultsPage = new SearchResultsPage(driver);
	}

	@Test
	public void test() {

		searchResultsPage = searchPage.enterSearch("OOP");
		String actualUrl = searchPage.urlEqualsTo(searchPage.getCurrentUrl(), 4);
		String expectedUrl = BasePage.BASE_URL + "/wiki/OOP";
		Assert.assertEquals("", expectedUrl, actualUrl);
		searchResultsPage.clickOnLink("Object-oriented programming");
		actualUrl = searchPage.urlEqualsTo(searchPage.getCurrentUrl(), 4);
		expectedUrl = BasePage.BASE_URL + "/wiki/Object-oriented_programming";
		Assert.assertEquals("", expectedUrl, actualUrl);
		searchResultsPage.goToPageEnd();
		searchResultsPage.clickThridLink();		
		searchResultsPage.clickThridLink();		
	}

	@AfterClass
	public static void setUp() {
		closeBroser();
	}

}
