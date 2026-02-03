package factories;

import button.Button;
import button.LightButton;
import checkbox.Checkbox;
import checkbox.LightCheckBox;
import textbox.LightTextBox;
import textbox.Textbox;

public class LightThemeFactory extends ThemeFactory{
    @Override
    public Button getButton() {
        return new LightButton();
    }

    @Override
    public Checkbox getCheckbox() {
        return new LightCheckBox();
    }

    @Override
    public Textbox getTextbox() {
        return new LightTextBox();
    }
}
