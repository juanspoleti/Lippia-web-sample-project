package com.crowdar.examples.pages;

import com.crowdar.bdd.cukes.SharedDriver;
import com.crowdar.core.CucumberPageBase;
import org.openqa.selenium.By;

public class WikipediaResultsPage extends CucumberPageBase {

    private final String TITLE_LABEL_LOCATOR_ID = "firstHeading";

    public WikipediaResultsPage(SharedDriver driver){
        super(driver);
    }

    public String getResultTitle() {
        return getValueField(By.id(TITLE_LABEL_LOCATOR_ID));
    }
}
