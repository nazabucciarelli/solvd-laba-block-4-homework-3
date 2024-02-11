package com.solvd.automation.gui.mobile.carinademo.android;

import com.solvd.automation.gui.mobile.carinademo.android.components.Header;
import com.solvd.automation.gui.mobile.carinademo.common.UIElementsPageBase;
import com.solvd.automation.gui.mobile.carinademo.common.components.HeaderBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = UIElementsPageBase.class)
public class UIElementsPage extends UIElementsPageBase {

    @FindBy(id = "toolbar")
    private Header header;

    @FindBy(id = "editText")
    private ExtendedWebElement textInput;

    @FindBy(id = "editText2")
    private ExtendedWebElement emailInput;

    @FindBy(id = "editText3")
    private ExtendedWebElement dateInput;

    @FindBy(id = "checkBox2")
    private ExtendedWebElement copyCheckBox;

    @FindBy(id = "radioButton")
    private ExtendedWebElement radioButtonMale;

    @FindBy(id = "radioButton3")
    private ExtendedWebElement radioButtonFemale;

    @FindBy(id = "radioButton5")
    private ExtendedWebElement radioButtonOther;

    @FindBy(id = "switch1")
    private ExtendedWebElement switchEnable;

    public UIElementsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HeaderBase getHeader() {
        return this.header;
    }

    @Override
    public void typeTextInput(String text) {
        textInput.type(text);
    }

    @Override
    public void typeEmailInput(String text) {
        emailInput.type(text);
    }

    @Override
    public void typeDateInput(String text) {
        dateInput.type(text);
    }

    @Override
    public void tapCopyCheckBox() {
        tap(copyCheckBox);
    }

    @Override
    public void tapRadioButtonMale() {
        tap(radioButtonMale);
    }

    @Override
    public void tapRadioButtonFemale() {
        tap(radioButtonFemale);
    }

    @Override
    public void tapRadioButtonOther() {
        tap(radioButtonOther);
    }

    @Override
    public void tapSwitchEnable() {
        tap(switchEnable);
    }

    @Override
    public boolean isTextInputPresent() {
        return textInput.isPresent();
    }

    @Override
    public boolean isEmailInputPresent() {
        return emailInput.isPresent();
    }

    @Override
    public boolean isDateInputPresent() {
        return dateInput.isPresent();
    }

    @Override
    public boolean isCopyCheckBoxPresent() {
        return copyCheckBox.isPresent();
    }

    @Override
    public boolean isRadioButtonMalePresent() {
        return radioButtonMale.isPresent();
    }

    @Override
    public boolean isRadioButtonFemalePresent() {
        return radioButtonFemale.isPresent();
    }

    @Override
    public boolean isRadioButtonOtherPresent() {
        return radioButtonOther.isPresent();
    }

    @Override
    public boolean isSwitchEnablePresent() {
        return switchEnable.isPresent();
    }
}
