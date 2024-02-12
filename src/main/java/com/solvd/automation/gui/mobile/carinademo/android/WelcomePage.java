package com.solvd.automation.gui.mobile.carinademo.android;

import com.solvd.automation.gui.mobile.carinademo.common.SignUpPageBase;
import com.solvd.automation.gui.mobile.carinademo.common.WelcomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WelcomePageBase.class)
public class WelcomePage extends WelcomePageBase {

    @FindBy(id = "next_button")
    private ExtendedWebElement nextButton;

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public SignUpPageBase clickNextButton() {
        nextButton.click();
        return initPage(getDriver(), SignUpPageBase.class);
    }

    @Override
    public boolean isNextButtonPresent() {
        return nextButton.isPresent();
    }
}
