package com.solvd.automation.gui.mobile.carinademo.common;

import org.openqa.selenium.WebDriver;

public abstract class MobileElementsPageBase extends AbstractPageBase {
    protected MobileElementsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeTextInput(String text);

    public abstract void typeEmailInput(String text);

    public abstract void typeDateInput(String text);

    public abstract void clickCopyCheckBox();

    public abstract void clickRadioButtonMale();

    public abstract void clickRadioButtonFemale();

    public abstract void clickRadioButtonOther();

    public abstract void clickSwitchEnable();

    public abstract boolean isTextInputPresent();

    public abstract boolean isEmailInputPresent();

    public abstract boolean isDateInputPresent();

    public abstract boolean isCopyCheckBoxPresent();

    public abstract boolean isRadioButtonMalePresent();

    public abstract boolean isRadioButtonFemalePresent();

    public abstract boolean isRadioButtonOtherPresent();

    public abstract boolean isSwitchEnablePresent();
}
