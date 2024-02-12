package com.solvd.automation.gui.mobile;

import com.solvd.automation.gui.mobile.carinademo.common.HomePageBase;
import com.solvd.automation.gui.mobile.carinademo.common.SignUpPageBase;
import com.solvd.automation.gui.mobile.carinademo.common.MobileElementsPageBase;
import com.solvd.automation.gui.mobile.carinademo.common.WelcomePageBase;
import com.solvd.automation.gui.mobile.carinademo.common.components.MenuBase;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MobileCarinaDemoTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "nazareno")
    public void loginTest() {
        login("nazareno","password");
    }

    @Test
    @MethodOwner(owner = "nazareno")
    public void uiElementsPageTest() {
        SoftAssert sa = new SoftAssert();
        HomePageBase homePageBase = login("rick","password");
        sa.assertTrue(homePageBase.getHeader().isMenuButtonPresent(),"Menu button from header is not present");
        MenuBase menuBase = homePageBase.getHeader().tapMenuButton();
        sa.assertTrue(menuBase.isMobileElementsMenuButtonPresent(), "UI Elements Button from Menu is not present");
        MobileElementsPageBase mobileElementsPageBase = menuBase.clickMobileElementsMenuButton();
        sa.assertTrue(mobileElementsPageBase.isTextInputPresent(),"Text input is not present");
        mobileElementsPageBase.typeTextInput("Hello from Java!");
        sa.assertTrue(mobileElementsPageBase.isEmailInputPresent(),"Email input is not present");
        mobileElementsPageBase.typeEmailInput("nazareno@solvd.com");
        sa.assertTrue(mobileElementsPageBase.isDateInputPresent(),"Date input is not present");
        mobileElementsPageBase.typeDateInput("10/01/2024");
        sa.assertTrue(mobileElementsPageBase.isCopyCheckBoxPresent(),"Copy checkbox is not present");
        mobileElementsPageBase.clickCopyCheckBox();
        sa.assertTrue(mobileElementsPageBase.isRadioButtonMalePresent(),"Radio Button male is not present");
        mobileElementsPageBase.clickRadioButtonMale();
        sa.assertTrue(mobileElementsPageBase.isRadioButtonFemalePresent(),"Radio Button female is not present");
        mobileElementsPageBase.clickRadioButtonFemale();
        sa.assertTrue(mobileElementsPageBase.isRadioButtonOtherPresent(),"Radio Button other is not present");
        mobileElementsPageBase.clickRadioButtonOther();
        sa.assertTrue(mobileElementsPageBase.isSwitchEnablePresent(),"Switch enable is not present");
        mobileElementsPageBase.clickSwitchEnable();
        sa.assertAll();
    }

    public HomePageBase login(String name, String password){
        WelcomePageBase welcomePageBase = initPage(getDriver(), WelcomePageBase.class);
        Assert.assertTrue(welcomePageBase.isNextButtonPresent(), "Next button is not present");
        SignUpPageBase signUpPageBase = welcomePageBase.clickNextButton();
        Assert.assertTrue(signUpPageBase.isNameInputPresent(),"Name input is not present");
        signUpPageBase.typeNameInput(name);
        Assert.assertTrue(signUpPageBase.isPasswordInputPresent(),"Password input is not present");
        signUpPageBase.typePasswordInput(password);
        Assert.assertTrue(signUpPageBase.isRadioMalePresent(),"Radio male is not present");
        Assert.assertTrue(signUpPageBase.isRadioFemalePresent(),"Radio female is not present");
        signUpPageBase.clickRadioFemale();
        signUpPageBase.clickRadioMale();
        Assert.assertTrue(signUpPageBase.isSwitchPrivacyPolicyPresent(),"Switch privacy policy is not present");
        signUpPageBase.clickSwitchPrivacyPolicy();
        Assert.assertTrue(signUpPageBase.isSignUpButtonPresent(),"Switch privacy policy is not present");
        return signUpPageBase.tapSignUpButton();
    }

}
