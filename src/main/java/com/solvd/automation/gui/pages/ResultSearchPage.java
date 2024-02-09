package com.solvd.automation.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultSearchPage extends AbstractGithubPage {

    @FindBy(css = "div[data-testid = 'results-list'] > div")
    private List<ExtendedWebElement> results;

    public ResultSearchPage(WebDriver driver) {
        super(driver);
    }

    public List<ExtendedWebElement> getResults() {
        return results;
    }
}
