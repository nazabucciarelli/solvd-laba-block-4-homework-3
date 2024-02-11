package com.solvd.automation.gui.mobile.carinademo.common;

import com.solvd.automation.gui.mobile.carinademo.common.components.HeaderBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPageBase extends AbstractPage implements IMobileUtils {
    protected AbstractPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract HeaderBase getHeader();
}
