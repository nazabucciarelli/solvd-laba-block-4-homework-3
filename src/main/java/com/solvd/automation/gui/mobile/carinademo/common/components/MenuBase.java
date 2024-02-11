package com.solvd.automation.gui.mobile.carinademo.common.components;

import com.solvd.automation.gui.mobile.carinademo.common.UIElementsPageBase;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;

public abstract class MenuBase extends AbstractUIObject {
    protected MenuBase(WebDriver driver) {
        super(driver);
    }

    public abstract UIElementsPageBase tapUIElementsButton();

    public abstract boolean isUIElementsButtonPresent();
}
