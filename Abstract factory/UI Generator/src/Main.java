import button.Button;
import checkbox.Checkbox;
import factories.DarkThemeFactory;
import factories.LightThemeFactory;
import textbox.Textbox;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DarkThemeFactory darkThemeFactory = new DarkThemeFactory();
        LightThemeFactory lightThemeFactory = new LightThemeFactory();

        System.out.println("Dark Theme UI elements Rendering Demo");

        Button darkButton = darkThemeFactory.getButton();
        System.out.println(darkButton.render());
        darkButton.showDetails();

        Checkbox darkCheckBox = darkThemeFactory.getCheckbox();
        System.out.println(darkCheckBox.render());
        darkCheckBox.showDetails();

        Textbox darkTextBox = darkThemeFactory.getTextbox();
        System.out.println(darkTextBox.render());
        darkTextBox.showDetails();


        System.out.println("Light Theme UI elements Rendering Demo");

        Button lightButton = lightThemeFactory.getButton();
        System.out.println(lightButton.render());
        lightButton.showDetails();

        Checkbox lightCheckBox = lightThemeFactory.getCheckbox();
        System.out.println(lightCheckBox.render());
        lightCheckBox.showDetails();

        Textbox lightTextBox = lightThemeFactory.getTextbox();
        System.out.println(lightTextBox.render());
        lightTextBox.showDetails();
    }
}