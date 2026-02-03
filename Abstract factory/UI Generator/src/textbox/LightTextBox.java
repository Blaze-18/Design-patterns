package textbox;

public class LightTextBox implements Textbox{

    private String text = "This is a text box";

    @Override
    public String render() {
        return "Light text box rendering... Light text box rendered";
    }

    @Override
    public void showDetails() {
        System.out.println("Light themed text box" + "\nText: " + text);
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
