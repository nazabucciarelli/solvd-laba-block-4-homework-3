package com.solvd.automation.gui.web.pages;

import com.solvd.automation.gui.web.components.Header;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AbstractGithubPage extends AbstractPage {

    @FindBy(xpath = "//header")
    private Header header;

    protected AbstractGithubPage(WebDriver driver) {
        super(driver);
    }

    public Header getHeader() {
        return header;
    }
}
