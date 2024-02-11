package com.solvd.automation.gui.mobile.saucelabs.common.components;

import com.solvd.automation.gui.mobile.saucelabs.common.ShoppingCartPageBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class HeaderBase extends AbstractUIObject implements IMobileUtils {

    protected HeaderBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract MenuBase tapMenuButton();

    public abstract ShoppingCartPageBase tapShoppingCartButton();

    public abstract boolean isMenuButtonPresent();
}
