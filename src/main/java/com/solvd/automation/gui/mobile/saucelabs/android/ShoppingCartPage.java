package com.solvd.automation.gui.mobile.saucelabs.android;

import com.solvd.automation.gui.mobile.saucelabs.android.components.Header;
import com.solvd.automation.gui.mobile.saucelabs.common.ShoppingCartPageBase;
import com.solvd.automation.gui.mobile.saucelabs.common.components.HeaderBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ShoppingCartPageBase.class)
public class ShoppingCartPage extends ShoppingCartPageBase {

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout" +
            "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/" +
            "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
            "ViewGroup[1]")
    private Header header;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HeaderBase getHeader() {
        return this.header;
    }
}
