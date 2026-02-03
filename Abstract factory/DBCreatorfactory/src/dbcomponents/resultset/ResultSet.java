package dbcomponents.resultset;

public interface ResultSet {
    public boolean validate();
    public void connect(String userName, String password);
    public void execute();
    public String getResult();
}
