package checkbox;

public class LightCheckBox implements Checkbox{

    private String status = "Unchecked";

    @Override
    public String render() {
        return "Light Check box rendering... Light check box rendered";
    }

    @Override
    public void showDetails() {
        System.out.println("Light Themed Chek box" + "\nStatus: " + status);
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String getStatus() {
        return status;
    }
}
