package com.solvd.automation.gui.mobile.carinademo.android.components;

import com.solvd.automation.gui.mobile.carinademo.common.UIElementsPageBase;
import com.solvd.automation.gui.mobile.carinademo.common.components.MenuBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MenuBase.class)
public class Menu extends MenuBase implements ICustomTypePageFactory {

    @FindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id=\"com.solvd.carinademoapplication" +
            ":id/design_navigation_view\"]/android.support.v7.widget.LinearLayoutCompat[4]")
    private ExtendedWebElement UIElementsButton;

    public Menu(WebDriver driver) {
        super(driver);
    }

    @Override
    public UIElementsPageBase tapUIElementsButton() {
        UIElementsButton.click();
        return initPage(UIElementsPageBase.class);
    }

    @Override
    public boolean isUIElementsButtonPresent() {
        return UIElementsButton.isPresent();
    }
}
