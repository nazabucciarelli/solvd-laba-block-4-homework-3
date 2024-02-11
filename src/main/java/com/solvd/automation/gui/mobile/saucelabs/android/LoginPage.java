package com.solvd.automation.gui.mobile.saucelabs.android;

import com.solvd.automation.gui.mobile.saucelabs.common.LoginPageBase;
import com.solvd.automation.gui.mobile.saucelabs.common.ProductsPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {

    @FindBy(xpath = "//android.widget.EditText[@content-desc = 'test-Username']")
    private ExtendedWebElement usernameInput;

    @FindBy(xpath = "//android.widget.EditText[@content-desc = 'test-Password']")
    private ExtendedWebElement passwordInput;

    @FindBy(xpath = "//android.widget.TextView[@text = 'LOGIN']")
    private ExtendedWebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeUsername(String text) {
        usernameInput.type(text);
    }

    @Override
    public void typePassword(String text) {
        passwordInput.type(text);
    }

    @Override
    public ProductsPageBase tapLoginButton() {
        tap(loginButton);
        return initPage(ProductsPageBase.class);
    }

    @Override
    public String getUsernameInputText() {
        return usernameInput.getText();
    }

    @Override
    public boolean isLoginButtonClickable() {
        return loginButton.isClickable();
    }
}
