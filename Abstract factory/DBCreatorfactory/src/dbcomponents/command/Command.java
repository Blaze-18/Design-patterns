package dbcomponents.command;

public interface Command {
    public boolean validate();
    public void connect(String userName, String password);
    public void execute();
    public String getResult();

}
