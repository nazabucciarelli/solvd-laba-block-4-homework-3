package com.solvd.automation.gui.mobile.saucelabs.common;

import org.openqa.selenium.WebDriver;

public abstract class SearchWebPageBase extends AbstractPageBase {
    protected SearchWebPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickGoToSiteButton();

    public abstract void typeUrlInput(String url);

    public abstract boolean isGoToSiteButtonPresent();

    public abstract boolean isUrlInputPresent();

    public abstract boolean isWebViewPresent();

}
