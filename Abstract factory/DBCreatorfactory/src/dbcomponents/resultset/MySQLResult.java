package dbcomponents.resultset;

public class MySQLResult implements ResultSet{
    private String result = "Result from MYSQL resultset component";
    private boolean match = true;
    @Override
    public boolean validate() {
        return match;
    }

    @Override
    public void connect(String userName, String password) {
        if(validate()){
            System.out.println("MYSQL Result set component connection successful!!");
        }
    }

    @Override
    public void execute() {
        if(validate()){
            System.out.println("Executing MYSQL Resultset..");
        }
    }

    @Override
    public String getResult() {
        return result;
    }
}
