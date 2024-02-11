package com.solvd.automation.gui.mobile.carinademo.common;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SignUpPageBase extends AbstractPage implements IMobileUtils {

    protected SignUpPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeNameInput(String text);

    public abstract void typePasswordInput(String text);

    public abstract void tapRadioMale();

    public abstract void tapRadioFemale();

    public abstract void tapSwitchPrivacyPolicy();

    public abstract HomePageBase tapSignUpButton();

    public abstract boolean isNameInputPresent();

    public abstract boolean isPasswordInputPresent();

    public abstract boolean isRadioMalePresent();

    public abstract boolean isRadioFemalePresent();

    public abstract boolean isSwitchPrivacyPolicyPresent();

    public abstract boolean isSignUpButtonPresent();
}
