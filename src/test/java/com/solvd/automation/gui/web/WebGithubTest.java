package com.solvd.automation.gui.web;

import com.solvd.automation.gui.web.components.SearchPopUp;
import com.solvd.automation.gui.web.pages.HomePage;
import com.solvd.automation.gui.web.pages.ResultSearchPage;
import com.solvd.automation.gui.web.pages.SignInPage;
import com.solvd.automation.gui.web.pages.SignUpPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebGithubTest implements IAbstractTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{{"charlie", "secret"},
                {"louis333", "githubpass"},
                {"johndoe", "487392421"}};
    }

    @Test(dataProvider = "loginData")
    @MethodOwner(owner = "nazareno")
    public void validateWrongLoginAttemptTest(String username, String password) {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.getHeader().isSignInButtonPresent(), "The Sign In button from HomePage is not" +
                " present");
        SignInPage signInPage = homePage.getHeader().clickSignInButton();
        Assert.assertTrue(signInPage.isUsernameInputPresent(), "The username input field is not present");
        Assert.assertTrue(signInPage.isPasswordInputPresent(), "The password input field is not present");
        Assert.assertTrue(signInPage.isSignInButtonPresent(), "The Sign in button from SignInPage is not present");
        signInPage.typeUsernameInput(username);
        signInPage.typePasswordInput(password);
        signInPage.clickSignInButton();
        Assert.assertTrue(signInPage.isIncorrectCredentialsMessagePresent(), "The error login message is not present");
    }

    @Test
    @MethodOwner(owner = "nazareno")
    public void verifySearchResultsTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.getHeader().isShowSearchPopUpButtonPresent(), "The show search pop-up button is not present");
        SearchPopUp searchPopUp = homePage.getHeader().clickShowSearchPopUpButton();
        Assert.assertTrue(searchPopUp.isSearchInputPresent(), "The search input is not present");
        searchPopUp.typeSearchInput("carina-demo");
        Assert.assertTrue(searchPopUp.isResultSearchOptionPresent(), "The result search option is not present");
        ResultSearchPage resultSearchPage = searchPopUp.clickResultSearchOption();
        pause(5);
        Assert.assertFalse(resultSearchPage.getResults().isEmpty(), "The result search is empty");
    }

    @Test
    @MethodOwner(owner = "nazareno")
    public void verifyRegisterProcessTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(homePage.getHeader().isSignUpButtonPresent(), "The Sign Up button is not present");
        SignUpPage signUpPage = homePage.getHeader().clickSignUpButton();
        sa.assertTrue(signUpPage.isEmailInputPresent(), "The email input is not present");
        signUpPage.typeEmailInput("nazareno@solvd.com");
        sa.assertTrue(signUpPage.isEmailContinueButtonPresent(), "The email continue button is not present");
        signUpPage.clickEmailContinueButton();
        sa.assertTrue(signUpPage.isPasswordInputPresent(), "The password input is not present");
        signUpPage.typePasswordInput("password123NA");
        sa.assertTrue(signUpPage.isPasswordContinueButtonPresent(), "The password continue button is not present");
        signUpPage.clickPasswordContinueButton();
        sa.assertTrue(signUpPage.isUsernameInputPresent(), "The username input is not present");
        signUpPage.typeUsernameInput("nazarenoghub");
        sa.assertTrue(signUpPage.isUsernameContinueButtonPresent(), "The username continue button is not present");
        signUpPage.clickUsernameContinueButton();
        sa.assertTrue(signUpPage.isEmailPreferencesContinueButtonPresent(), "The email preferences continue button is" +
                " not present");
        signUpPage.clickEmailPreferencesContinueButton();
        sa.assertAll();
    }

}
