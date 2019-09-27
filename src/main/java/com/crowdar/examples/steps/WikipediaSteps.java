package com.crowdar.examples.steps;

import com.crowdar.bdd.cukes.SharedDriver;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.GoogleHomePage;
import com.crowdar.examples.pages.GoogleSearchResultPage;
import com.crowdar.examples.pages.WikipediaHomePage;
import com.crowdar.examples.pages.WikipediaResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.DailyRollingFileAppender;
import org.testng.Assert;

public class WikipediaSteps extends PageSteps {

    private WikipediaHomePage wikipediaHomePage;
    private WikipediaResultsPage wikipediaResultsPage;

    public WikipediaSteps(SharedDriver driver) {
        super(driver);
        this.wikipediaHomePage = new WikipediaHomePage(driver);
        this.wikipediaResultsPage = new WikipediaResultsPage(driver);
    }

    @Given("the user is in wikipedia page")
    public void getWikipediaHomePage() {
        wikipediaHomePage.goToHomePage();
    }

    @When("the user search for (.*)")
    public void searchWikipedia(String word) {
        wikipediaHomePage.setSearchInput(word);
        wikipediaHomePage.clickSearchButton();
    }

    @Then("the (.*) is searched correctly")
    public void verifyCorrectSearch(String word) {
        Assert.assertEquals(word, wikipediaResultsPage.getResultTitle());
    }
}
