package factories;

import button.Button;
import button.DarkButton;
import checkbox.Checkbox;
import checkbox.DarkCheckBox;
import textbox.DarkTextBox;
import textbox.Textbox;

public class DarkThemeFactory extends ThemeFactory{
    @Override
    public Button getButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox getCheckbox() {
        return new DarkCheckBox();
    }

    @Override
    public Textbox getTextbox() {
        return new DarkTextBox();
    }
}
