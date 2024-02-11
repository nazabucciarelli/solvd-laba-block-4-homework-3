package com.solvd.automation.gui.mobile.carinademo.android;

import com.solvd.automation.gui.mobile.carinademo.android.components.Header;
import com.solvd.automation.gui.mobile.carinademo.common.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(id = "toolbar")
    private Header header;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public Header getHeader() {
        return this.header;
    }


}
