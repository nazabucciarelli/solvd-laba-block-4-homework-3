package com.solvd.automation.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class SignUpPage extends AbstractPage {

    @FindBy(id = "email")
    private ExtendedWebElement emailInput;

    @FindBy(id = "password")
    private ExtendedWebElement passwordInput;

    @FindBy(id = "login")
    private ExtendedWebElement usernameInput;

    @FindBy(xpath = "//button[@data-continue-to = 'password-container']")
    private ExtendedWebElement emailContinueButton;

    @FindBy(xpath = "//button[@data-continue-to = 'username-container']")
    private ExtendedWebElement passwordContinueButton;

    @FindBy(xpath = "//button[@data-continue-to = 'opt-in-container']")
    private ExtendedWebElement usernameContinueButton;

    @FindBy(xpath = "//button[@data-continue-to = 'captcha-and-submit-container']")
    private ExtendedWebElement emailPreferencesContinueButton;

    private final Wait<WebDriver> waiter;

    public SignUpPage(WebDriver driver) {
        super(driver);
        waiter = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10L))
                .pollingEvery(Duration.ofMillis(300));
    }

    public void clickEmailContinueButton() {
        waiter.until(webDriver -> isContinueButtonEnabled(emailContinueButton));
        emailContinueButton.click();
        emailContinueButton.waitUntilElementDisappear(5L);
    }

    public void clickPasswordContinueButton() {
        waiter.until(webDriver -> isContinueButtonEnabled(passwordContinueButton));
        passwordContinueButton.click();
        passwordContinueButton.waitUntilElementDisappear(5L);
    }

    public void clickUsernameContinueButton() {
        waiter.until(webDriver -> isContinueButtonEnabled(usernameContinueButton));
        usernameContinueButton.click();
        usernameContinueButton.waitUntilElementDisappear(5L);
    }

    public void clickEmailPreferencesContinueButton() {
        waiter.until(webDriver -> isContinueButtonEnabled(emailPreferencesContinueButton));
        emailPreferencesContinueButton.click();
        emailPreferencesContinueButton.waitUntilElementDisappear(5L);
    }

    public void typeEmailInput(String text) {
        waiter.until(webDriver -> emailInput.isVisible());
        emailInput.type(text);
    }

    public void typePasswordInput(String text) {
        passwordInput.type(text);
    }

    public void typeUsernameInput(String text) {
        usernameInput.type(text);
    }

    public boolean isEmailInputPresent() {
        return emailInput.isPresent();
    }

    public boolean isUsernameInputPresent() {
        return usernameInput.isPresent();
    }

    public boolean isPasswordInputPresent() {
        return passwordInput.isPresent();
    }

    public boolean isEmailContinueButtonPresent() {
        return emailContinueButton.isPresent();
    }

    public boolean isUsernameContinueButtonPresent() {
        return usernameContinueButton.isPresent();
    }

    public boolean isPasswordContinueButtonPresent() {
        return passwordContinueButton.isPresent();
    }

    public boolean isEmailPreferencesContinueButtonPresent() {
        return emailPreferencesContinueButton.isPresent();
    }

    private boolean isContinueButtonEnabled(ExtendedWebElement button) {
        return button.getAttribute("disabled") == null;
    }
}
