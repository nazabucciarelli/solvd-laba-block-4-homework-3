package com.solvd.automation.gui.mobile;

import com.solvd.automation.gui.mobile.carinademo.common.HomePageBase;
import com.solvd.automation.gui.mobile.carinademo.common.SignUpPageBase;
import com.solvd.automation.gui.mobile.carinademo.common.UIElementsPageBase;
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
        sa.assertTrue(menuBase.isUIElementsButtonPresent(), "UI Elements Button from Menu is not present");
        UIElementsPageBase uiElementsPageBase = menuBase.tapUIElementsButton();
        sa.assertTrue(uiElementsPageBase.isTextInputPresent(),"Text input is not present");
        uiElementsPageBase.typeTextInput("Hello from Java!");
        sa.assertTrue(uiElementsPageBase.isEmailInputPresent(),"Email input is not present");
        uiElementsPageBase.typeEmailInput("nazareno@solvd.com");
        sa.assertTrue(uiElementsPageBase.isDateInputPresent(),"Date input is not present");
        uiElementsPageBase.typeDateInput("10/01/2024");
        sa.assertTrue(uiElementsPageBase.isCopyCheckBoxPresent(),"Copy checkbox is not present");
        uiElementsPageBase.tapCopyCheckBox();
        sa.assertTrue(uiElementsPageBase.isRadioButtonMalePresent(),"Radio Button male is not present");
        uiElementsPageBase.tapRadioButtonMale();
        sa.assertTrue(uiElementsPageBase.isRadioButtonFemalePresent(),"Radio Button female is not present");
        uiElementsPageBase.tapRadioButtonFemale();
        sa.assertTrue(uiElementsPageBase.isRadioButtonOtherPresent(),"Radio Button other is not present");
        uiElementsPageBase.tapRadioButtonOther();
        sa.assertTrue(uiElementsPageBase.isSwitchEnablePresent(),"Switch enable is not present");
        uiElementsPageBase.tapSwitchEnable();
        sa.assertAll();
    }

    public HomePageBase login(String name, String password){
        WelcomePageBase welcomePageBase = initPage(getDriver(), WelcomePageBase.class);
        Assert.assertTrue(welcomePageBase.isNextButtonPresent(), "Next button is not present");
        SignUpPageBase signUpPageBase = welcomePageBase.tapNextButton();
        Assert.assertTrue(signUpPageBase.isNameInputPresent(),"Name input is not present");
        signUpPageBase.typeNameInput(name);
        Assert.assertTrue(signUpPageBase.isPasswordInputPresent(),"Password input is not present");
        signUpPageBase.typePasswordInput(password);
        Assert.assertTrue(signUpPageBase.isRadioMalePresent(),"Radio male is not present");
        Assert.assertTrue(signUpPageBase.isRadioFemalePresent(),"Radio female is not present");
        signUpPageBase.tapRadioFemale();
        signUpPageBase.tapRadioMale();
        Assert.assertTrue(signUpPageBase.isSwitchPrivacyPolicyPresent(),"Switch privacy policy is not present");
        signUpPageBase.tapSwitchPrivacyPolicy();
        Assert.assertTrue(signUpPageBase.isSignUpButtonPresent(),"Switch privacy policy is not present");
        return signUpPageBase.tapSignUpButton();
    }

}
