package com.solvd.automation.gui.mobile.saucelabs.common.components;

import com.solvd.automation.gui.mobile.saucelabs.common.LoginPageBase;
import com.solvd.automation.gui.mobile.saucelabs.common.SearchWebPageBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;

public abstract class MenuBase extends AbstractUIObject implements IMobileUtils {
    protected MenuBase(WebDriver driver) {
        super(driver);
    }

    public abstract SearchWebPageBase clickWebViewButton();

    public abstract LoginPageBase clickLogoutButton();

    public abstract boolean isWebViewButtonPresent();
}
