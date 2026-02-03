package factories;

import button.Button;
import checkbox.Checkbox;
import textbox.Textbox;

public abstract class ThemeFactory {
    public abstract Button getButton();
    public abstract Checkbox getCheckbox();
    public abstract Textbox getTextbox();
}
