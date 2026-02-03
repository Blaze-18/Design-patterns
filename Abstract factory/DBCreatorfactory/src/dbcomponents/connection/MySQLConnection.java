package dbcomponents.connection;

public class MySQLConnection implements Connection {

    private String result = "Result from MYSQL connection component";
    private boolean match = true;
    @Override
    public boolean validate() {
        return match;
    }

    @Override
    public void connect(String userName, String password) {
        if(validate()){
            System.out.println("MYSQL Connect component connection successful!!");
        }
    }

    @Override
    public void execute() {
        if(validate()){
            System.out.println("Executing MYSQL connection..");
        }
    }

    @Override
    public String getResult() {
        return result;
    }
}
