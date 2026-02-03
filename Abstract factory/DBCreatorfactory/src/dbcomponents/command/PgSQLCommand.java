package dbcomponents.command;

public class PgSQLCommand implements Command{
    private String result = "Result from PGSQL command component";
    private boolean match = true;
    @Override
    public boolean validate() {
        return match;
    }

    @Override
    public void connect(String userName, String password) {
        if(validate()){
            System.out.println("PGSQL Command connection successful!!");
        }
    }

    @Override
    public void execute() {
        if(validate()){
            System.out.println("Executing PGSQL command..");
        }
    }

    @Override
    public String getResult() {
        return result;
    }
}
