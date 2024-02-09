package com.solvd.automation.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends AbstractPage {

    @FindBy(id = "login_field")
    private ExtendedWebElement usernameInput;

    @FindBy(id = "password")
    private ExtendedWebElement passwordInput;

    @FindBy(xpath = "//form//input[@type = 'submit']")
    private ExtendedWebElement signInButton;

    @FindBy(xpath = "//div[contains(text(),'Incorrect username or password')]")
    private ExtendedWebElement incorrectCredentialsError;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void typeUsernameInput(String text) {
        usernameInput.type(text);
    }

    public void typePasswordInput(String text) {
        passwordInput.type(text);
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public boolean isIncorrectCredentialsMessagePresent() {
        return incorrectCredentialsError.isPresent();
    }

    public boolean isSignInButtonPresent() {
        return signInButton.isPresent();
    }

    public boolean isPasswordInputPresent() {
        return passwordInput.isPresent();
    }

    public boolean isUsernameInputPresent() {
        return usernameInput.isPresent();
    }
}
