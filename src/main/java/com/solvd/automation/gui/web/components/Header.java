package com.solvd.automation.gui.web.components;

import com.solvd.automation.gui.web.pages.SignInPage;
import com.solvd.automation.gui.web.pages.SignUpPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends AbstractUIObject {

    @FindBy(xpath = ".//div[contains(@class, 'd-lg-flex')]//a[@href = '/login']")
    private ExtendedWebElement signInButton;

    @FindBy(xpath = ".//div[contains(@class, 'd-lg-flex')]//a[contains(@href,'/signup')]")
    private ExtendedWebElement signUpButton;

    @FindBy(xpath = ".//button[contains(@class,'search-button')]")
    private ExtendedWebElement showSearchPopUpButton;


    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public SignInPage clickSignInButton() {
        signInButton.click();
        return new SignInPage(getDriver());
    }

    public SignUpPage clickSignUpButton() {
        signUpButton.click();
        return new SignUpPage(getDriver());
    }

    public boolean isSignUpButtonPresent() {
        return signUpButton.isPresent();
    }

    public boolean isSignInButtonPresent() {
        return signInButton.isPresent();
    }

    public boolean isShowSearchPopUpButtonPresent() {
        return showSearchPopUpButton.isPresent();
    }

    public SearchPopUp clickShowSearchPopUpButton() {
        showSearchPopUpButton.click();
        return new SearchPopUp(getDriver());
    }

}
