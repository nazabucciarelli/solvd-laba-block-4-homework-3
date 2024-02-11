package com.solvd.automation.gui.mobile.saucelabs.common;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends AbstractPage implements IMobileUtils {
    protected LoginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeUsername(String text);

    public abstract void typePassword(String text);

    public abstract ProductsPageBase tapLoginButton();

    public abstract String getUsernameInputText();

    public abstract boolean isLoginButtonClickable();
}
