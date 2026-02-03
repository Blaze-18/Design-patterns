package dbcomponents.connection;

public class PgSQLConnection implements Connection{
    private String result = "Result from PGSQL connection component";
    private boolean match = true;
    @Override
    public boolean validate() {
        return match;
    }

    @Override
    public void connect(String userName, String password) {
        if(validate()){
            System.out.println("PGSQL Connect component connection successful!!");
        }
    }

    @Override
    public void execute() {
        if(validate()){
            System.out.println("Executing PGSQL connection..");
        }
    }

    @Override
    public String getResult() {
        return result;
    }}
