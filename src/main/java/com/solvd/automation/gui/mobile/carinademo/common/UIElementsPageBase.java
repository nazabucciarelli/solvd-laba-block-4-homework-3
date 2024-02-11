package com.solvd.automation.gui.mobile.carinademo.common;

import org.openqa.selenium.WebDriver;

public abstract class UIElementsPageBase extends AbstractPageBase {
    protected UIElementsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeTextInput(String text);

    public abstract void typeEmailInput(String text);

    public abstract void typeDateInput(String text);

    public abstract void tapCopyCheckBox();

    public abstract void tapRadioButtonMale();

    public abstract void tapRadioButtonFemale();

    public abstract void tapRadioButtonOther();

    public abstract void tapSwitchEnable();

    public abstract boolean isTextInputPresent();

    public abstract boolean isEmailInputPresent();

    public abstract boolean isDateInputPresent();

    public abstract boolean isCopyCheckBoxPresent();

    public abstract boolean isRadioButtonMalePresent();

    public abstract boolean isRadioButtonFemalePresent();

    public abstract boolean isRadioButtonOtherPresent();

    public abstract boolean isSwitchEnablePresent();
}
