package com.solvd.automation.gui.mobile.carinademo.android.components;

import com.solvd.automation.gui.mobile.carinademo.common.components.HeaderBase;
import com.solvd.automation.gui.mobile.carinademo.common.components.MenuBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HeaderBase.class)
public class Header extends HeaderBase {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private ExtendedWebElement menuButton;

    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public MenuBase tapMenuButton() {
        menuButton.click();
        return new Menu(getDriver());
    }

    @Override
    public boolean isMenuButtonPresent() {
        return menuButton.isPresent();
    }
}
