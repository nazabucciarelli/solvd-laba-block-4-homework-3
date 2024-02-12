package com.solvd.automation.gui.mobile.carinademo.common.components;

import com.solvd.automation.gui.mobile.carinademo.common.MobileElementsPageBase;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;

public abstract class MenuBase extends AbstractUIObject {
    protected MenuBase(WebDriver driver) {
        super(driver);
    }

    public abstract MobileElementsPageBase clickMobileElementsMenuButton();

    public abstract boolean isMobileElementsMenuButtonPresent();
}
