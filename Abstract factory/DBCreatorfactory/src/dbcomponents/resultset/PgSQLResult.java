package dbcomponents.resultset;

public class PgSQLResult implements ResultSet{

    private String result = "Result from PGSQL resultset component";
    private boolean match = true;
    @Override
    public boolean validate() {
        return match;
    }

    @Override
    public void connect(String userName, String password) {
        if(validate()){
            System.out.println("PGSQL Result set component connection successful!!");
        }
    }

    @Override
    public void execute() {
        if(validate()){
            System.out.println("Executing PGSQL Resultset..");
        }
    }

    @Override
    public String getResult() {
        return result;
    }
}
