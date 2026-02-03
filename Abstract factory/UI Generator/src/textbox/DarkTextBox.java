package textbox;

public class DarkTextBox implements Textbox{

    private String text = "This is a text box";

    @Override
    public String render() {
        return "Dark text box rendering... Dark text box rendered";
    }

    @Override
    public void showDetails() {
        System.out.println("Dark themed text box" + "\nText: " + text);
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
