package dbcomponents.connection;

public interface Connection {
    public boolean validate();
    public void connect(String userName, String password);
    public void execute();
    public String getResult();
}
