package com.solvd.automation.gui.mobile.saucelabs.android.components;

import com.solvd.automation.gui.mobile.saucelabs.common.ShoppingCartPageBase;
import com.solvd.automation.gui.mobile.saucelabs.common.components.HeaderBase;
import com.solvd.automation.gui.mobile.saucelabs.common.components.MenuBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HeaderBase.class)
public class Header extends HeaderBase implements ICustomTypePageFactory {

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc = 'test-Menu']")
    private ExtendedWebElement menuButton;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc = 'test-Cart']")
    private ExtendedWebElement shoppingCartButton;

    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public MenuBase clickMenuButton() {
        menuButton.click();
        return new Menu(getDriver());
    }

    @Override
    public ShoppingCartPageBase clickShoppingCartButton() {
        shoppingCartButton.click();
        return initPage(ShoppingCartPageBase.class);
    }

    @Override
    public boolean isMenuButtonPresent() {
        return menuButton.isPresent();
    }
}
