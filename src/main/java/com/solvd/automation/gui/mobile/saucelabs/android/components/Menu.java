package com.solvd.automation.gui.mobile.saucelabs.android.components;

import com.solvd.automation.gui.mobile.saucelabs.common.LoginPageBase;
import com.solvd.automation.gui.mobile.saucelabs.common.SearchWebPageBase;
import com.solvd.automation.gui.mobile.saucelabs.common.components.MenuBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MenuBase.class)
public class Menu extends MenuBase implements ICustomTypePageFactory {

    @FindBy(xpath = "//android.widget.TextView[@text=\"WEBVIEW\"]")
    private ExtendedWebElement webViewButton;

    @FindBy(xpath = "//android.widget.TextView[@text=\"LOGOUT\"]")
    private ExtendedWebElement logoutButton;

    public Menu(WebDriver driver) {
        super(driver);
    }

    @Override
    public SearchWebPageBase clickWebViewButton() {
        webViewButton.click();
        return initPage(SearchWebPageBase.class);
    }

    @Override
    public LoginPageBase clickLogoutButton() {
        logoutButton.click();
        return initPage(LoginPageBase.class);
    }

    @Override
    public boolean isWebViewButtonPresent() {
        return webViewButton.isPresent();
    }
}
