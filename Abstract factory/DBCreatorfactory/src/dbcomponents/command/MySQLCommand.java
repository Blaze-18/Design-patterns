package dbcomponents.command;

public class MySQLCommand implements Command{

    private String result = "Result from MYSQL command component";
    private boolean match = true;
    @Override
    public boolean validate() {
        return match;
    }

    @Override
    public void connect(String userName, String password) {
        if(validate()){
            System.out.println("MYSQL Command connection successful!!");
        }
    }

    @Override
    public void execute() {
        if(validate()){
            System.out.println("Executing MYSQL command..");
        }
    }

    @Override
    public String getResult() {
        return result;
    }
}
