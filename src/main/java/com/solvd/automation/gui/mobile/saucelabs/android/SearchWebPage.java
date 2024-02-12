package com.solvd.automation.gui.mobile.saucelabs.android;

import com.solvd.automation.gui.mobile.saucelabs.android.components.Header;
import com.solvd.automation.gui.mobile.saucelabs.common.SearchWebPageBase;
import com.solvd.automation.gui.mobile.saucelabs.common.components.HeaderBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SearchWebPageBase.class)
public class SearchWebPage extends SearchWebPageBase {

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout" +
            "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/" +
            "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
            "ViewGroup[1]")
    private Header header;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-enter a https url here...\"]")
    private ExtendedWebElement urlInput;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-GO TO SITE\"]")
    private ExtendedWebElement goToSiteButton;

    @FindBy(xpath = "//android.webkit.WebView")
    private ExtendedWebElement webView;

    public SearchWebPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HeaderBase getHeader() {
        return this.header;
    }

    @Override
    public void clickGoToSiteButton() {
        goToSiteButton.click();
        Wait<WebDriver> waiter = new FluentWait<>(driver)
                .pollingEvery(Duration.ofMillis(200))
                .withTimeout(Duration.ofSeconds(10L));
        waiter.until(o -> webView.isPresent());
    }

    @Override
    public void typeUrlInput(String url) {
        urlInput.type(url);
    }

    @Override
    public boolean isGoToSiteButtonPresent() {
        return goToSiteButton.isPresent();
    }

    @Override
    public boolean isUrlInputPresent() {
        return urlInput.isPresent();
    }

    @Override
    public boolean isWebViewPresent() {
        return webView.isPresent();
    }
}
