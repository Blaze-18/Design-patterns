package button;

public class DarkButton implements Button{
    private String buttonText = "Click Me!";
    @Override
    public String render() {
        return "Rendering Dark button....Dark Button Rendered";
    }

    @Override
    public void showDetails() {
        System.out.println("Dark themed Button" +"\nButton Text: " + buttonText);
    }

    @Override
    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    @Override
    public String getButtonText() {
        return buttonText;
    }
}
