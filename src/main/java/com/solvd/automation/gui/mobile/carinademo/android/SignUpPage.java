package com.solvd.automation.gui.mobile.carinademo.android;

import com.solvd.automation.gui.mobile.carinademo.common.HomePageBase;
import com.solvd.automation.gui.mobile.carinademo.common.SignUpPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SignUpPageBase.class)
public class SignUpPage extends SignUpPageBase {

    @FindBy(id = "name")
    private ExtendedWebElement nameInput;

    @FindBy(id = "password")
    private ExtendedWebElement passwordInput;

    @FindBy(id = "radio_male")
    private ExtendedWebElement radioMale;

    @FindBy(id = "radio_female")
    private ExtendedWebElement radioFemale;

    @FindBy(id = "checkbox")
    private ExtendedWebElement switchPrivacyPolicy;

    @FindBy(id = "login_button")
    private ExtendedWebElement signUpButton;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomePageBase tapSignUpButton() {
        tap(signUpButton);
        return initPage(HomePageBase.class);
    }

    @Override
    public boolean isNameInputPresent() {
        return nameInput.isPresent();
    }

    @Override
    public boolean isPasswordInputPresent() {
        return passwordInput.isPresent();
    }

    @Override
    public boolean isRadioMalePresent() {
        return radioMale.isPresent();
    }

    @Override
    public boolean isRadioFemalePresent() {
        return radioFemale.isPresent();
    }

    @Override
    public boolean isSwitchPrivacyPolicyPresent() {
        return switchPrivacyPolicy.isPresent();
    }

    @Override
    public boolean isSignUpButtonPresent() {
        return signUpButton.isPresent();
    }

    @Override
    public void typeNameInput(String text) {
        nameInput.type(text);
    }

    @Override
    public void typePasswordInput(String text) {
        passwordInput.type(text);
    }

    @Override
    public void tapRadioMale() {
        tap(radioMale);
    }

    @Override
    public void tapRadioFemale() {
        tap(radioFemale);
    }

    @Override
    public void tapSwitchPrivacyPolicy() {
        tap(switchPrivacyPolicy);
    }
}
