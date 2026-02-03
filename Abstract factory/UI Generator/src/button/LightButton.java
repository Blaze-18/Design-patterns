package button;

public class LightButton  implements Button  {

    private String buttonText = "Click Me!";

    @Override
    public String render() {
        return "Rendering Light button.... light Button Rendered";
    }

    @Override
    public void showDetails() {
        System.out.println("Light themed Button" +"\nButton Text: " + buttonText);
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
