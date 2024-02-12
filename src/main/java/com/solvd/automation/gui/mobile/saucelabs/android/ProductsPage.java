package com.solvd.automation.gui.mobile.saucelabs.android;

import com.solvd.automation.gui.mobile.saucelabs.android.components.Header;
import com.solvd.automation.gui.mobile.saucelabs.common.ProductsPageBase;
import com.solvd.automation.gui.mobile.saucelabs.common.components.HeaderBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductsPageBase.class)
public class ProductsPage extends ProductsPageBase {
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout" +
            "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/" +
            "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
            "ViewGroup[1]")
    private Header header;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Item']")
    private List<ExtendedWebElement> products;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HeaderBase getHeader() {
        return this.header;
    }

    @Override
    public boolean isProductsListEmpty() {
        Wait<WebDriver> waiter = new FluentWait<>(driver).
                withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(500));
        waiter.until(webDriver -> !products.isEmpty());
        return false;
    }
}
