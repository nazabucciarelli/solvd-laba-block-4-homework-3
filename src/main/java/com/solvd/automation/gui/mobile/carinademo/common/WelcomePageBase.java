package com.solvd.automation.gui.mobile.carinademo.common;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class WelcomePageBase extends AbstractPage implements IMobileUtils {
    protected WelcomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract SignUpPageBase clickNextButton();

    public abstract boolean isNextButtonPresent();
}
