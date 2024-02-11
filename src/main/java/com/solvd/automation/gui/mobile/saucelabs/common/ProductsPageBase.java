package com.solvd.automation.gui.mobile.saucelabs.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;

import java.util.List;

public abstract class ProductsPageBase extends AbstractPageBase {
    protected ProductsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isProductsListEmpty();
}
