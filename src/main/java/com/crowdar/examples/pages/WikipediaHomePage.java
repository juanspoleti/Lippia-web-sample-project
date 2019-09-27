package com.crowdar.examples.pages;

import com.crowdar.bdd.cukes.SharedDriver;
import com.crowdar.core.CucumberPageBase;
import org.openqa.selenium.By;

public class WikipediaHomePage extends CucumberPageBase {

    private final String SEARCH_INPUT_LOCATOR_ID = "searchInput";
    private final String SEARCH_BUTTON_LOCATOR_CSS = "#search-form > fieldset > button";

    public WikipediaHomePage(SharedDriver driver){
        super(driver);
        this.url = "";
        BASE_URL = "https://wikipedia.org";
    }

    public void goToHomePage(){
        navigateToIt();
    }


    public void setSearchInput(String value){
        completeField(By.id(SEARCH_INPUT_LOCATOR_ID), value);
    }

    public void clickSearchButton(){
        clickElement(By.cssSelector(SEARCH_BUTTON_LOCATOR_CSS));
    }

}
