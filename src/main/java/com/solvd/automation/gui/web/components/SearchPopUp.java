package com.solvd.automation.gui.web.components;

import com.solvd.automation.gui.web.pages.ResultSearchPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchPopUp extends AbstractUIObject {

    @FindBy(xpath = ".//ul[@role='presentation']//li[@role='option']")
    private ExtendedWebElement resultSearchOption;

    @FindBy(xpath = ".//input[@id = 'query-builder-test']")
    private ExtendedWebElement searchInput;

    public SearchPopUp(WebDriver driver) {
        super(driver);
    }

    public ResultSearchPage clickResultSearchOption() {
        resultSearchOption.click();
        return new ResultSearchPage(getDriver());
    }

    public boolean isResultSearchOptionPresent() {
        return resultSearchOption.isPresent();
    }

    public void typeSearchInput(String text) {
        searchInput.type(text);
    }

    public boolean isSearchInputPresent() {
        return searchInput.isPresent();
    }

}
