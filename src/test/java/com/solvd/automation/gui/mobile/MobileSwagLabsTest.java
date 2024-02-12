package com.solvd.automation.gui.mobile;

import com.solvd.automation.gui.mobile.saucelabs.common.LoginPageBase;
import com.solvd.automation.gui.mobile.saucelabs.common.ProductsPageBase;
import com.solvd.automation.gui.mobile.saucelabs.common.SearchWebPageBase;
import com.solvd.automation.gui.mobile.saucelabs.common.components.MenuBase;
import com.zebrunner.carina.core.AbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileSwagLabsTest extends AbstractTest {

    @Test
    @MethodOwner(owner = "nazareno")
    public void webViewPageTest() {
        ProductsPageBase productsPageBase = login("standard_user", "secret_sauce");
        Assert.assertTrue(productsPageBase.getHeader().isMenuButtonPresent(), "The menu button is not present");
        MenuBase menuBase = productsPageBase.getHeader().clickMenuButton();
        Assert.assertTrue(menuBase.isWebViewButtonPresent(), "The Web View button is not present");
        SearchWebPageBase searchWebPageBase = menuBase.clickWebViewButton();
        Assert.assertTrue(searchWebPageBase.isUrlInputPresent(), "The url input is not present");
        searchWebPageBase.typeUrlInput("www.google.com");
        Assert.assertTrue(searchWebPageBase.isGoToSiteButtonPresent(), "The Go To Site button is not present");
        searchWebPageBase.clickGoToSiteButton();
        Assert.assertTrue(searchWebPageBase.isWebViewPresent(), "The web view is not present");
    }

    @Test
    @MethodOwner(owner = "nazareno")
    public void loginTest() {
        login("standard_user", "secret_sauce");
    }

    public ProductsPageBase login(String username, String password) {
        LoginPageBase loginPageBase = initPage(LoginPageBase.class);
        loginPageBase.typeUsername(username);
        Assert.assertEquals(username, loginPageBase.getUsernameInputText(), "The username doesn't match");
        loginPageBase.typePassword(password);
        Assert.assertTrue(loginPageBase.isLoginButtonClickable(), "The login button is not clickable.");
        return loginPageBase.clickLoginButton();
    }

    @Test
    @MethodOwner(owner = "nazareno")
    public void areThereProductsTest() {
        ProductsPageBase productsPageBase = login("standard_user", "secret_sauce");
        Assert.assertFalse(productsPageBase.isProductsListEmpty(), "There are no products displayed");
    }
}
